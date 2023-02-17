package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.Producto;
import com.example.demo.modelo.ProductoCantidad;
import com.example.demo.modelo.Venta;
import com.example.demo.repository.IVentaRepository;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaRepository iVentaRepository;

	@Autowired
	private IProductoService iProductoService;

	@Override
	public void Realizarventa(List<ProductoCantidad> pc, String cedula, String nv) {
		// TODO Auto-generated method stub

		Producto p = new Producto();
		Detalle detalle = new Detalle();
		List<Detalle> d = new ArrayList<>();
		
		Venta venta = new Venta();
		venta.setCedulaCliente(cedula);
		venta.setFecha(LocalDateTime.now());
		venta.setNumero(nv);
		BigDecimal valortotal=null;

		for (ProductoCantidad pc1 : pc) {
			
			p = this.iProductoService.buscar(pc1.getCodigoBarra());

			if (pc1.getCantidad() >= p.getStock() && p != null) {
				if (p.getStock() == null) {
					System.out.println("null");
				} else {
					
					//cantidad
					pc1.setCantidad(p.getStock());
					p.setStock(0);
					this.iProductoService.actualizar(p);
					
					//detalle
					detalle.setCantidad(pc1.getCantidad());
					detalle.setPrecioUnitario(p.getPrecio());
					detalle.setProducto(p);
					detalle.setSubtotal(null);
					detalle.setVenta(venta);
				}
				
			} if(pc1.getCantidad() < p.getStock() && p != null) {
				
				//cantidad
				p.setStock(p.getStock()-pc1.getCantidad());
				this.iProductoService.actualizar(p);
				
				//detalle
				detalle.setCantidad(pc1.getCantidad());
				detalle.setPrecioUnitario(p.getPrecio());
				detalle.setProducto(p);
				detalle.setSubtotal(null);
				detalle.setVenta(venta);
				
			}else {
				System.out.println("no hay el producto");
			}
			valortotal=valortotal.add(detalle.getPrecioUnitario().multiply(BigDecimal.valueOf(detalle.getCantidad())));
			d.add(detalle);

		}

		
		venta.setTotalVenta(valortotal);
		venta.setDetalle(d);

		p.setDetalle(d);
		this.iProductoService.actualizar(p);
		this.iVentaRepository.ingresar(venta);

	}

}
