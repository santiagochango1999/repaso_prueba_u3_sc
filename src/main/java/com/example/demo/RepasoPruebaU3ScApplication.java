package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.ProductoCantidad;
import com.example.demo.service.IDetalleService;
import com.example.demo.service.IProductoService;
import com.example.demo.service.IVentaService;

@SpringBootApplication
public class RepasoPruebaU3ScApplication implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IVentaService iVentaService;
	
	@Autowired
	private IDetalleService detalleService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoPruebaU3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Producto p1=new Producto();
		p1.setCategoria("frutas");
		p1.setCodigoBarra("12345");
		p1.setNombre("manzana");
		p1.setPrecio(new BigDecimal(1));
		p1.setStock(12);
		
		this.iProductoService.insertar(p1);
		
//		List<ProductoCantidad> lista=new ArrayList<>();
//		
//		ProductoCantidad p11=new ProductoCantidad();
//		ProductoCantidad p2=new ProductoCantidad();
//		ProductoCantidad p3=new ProductoCantidad();
//		
//		p11.setCodigoBarra(p1.getCodigoBarra());
//		p11.setCantidad(6);
//		p2.setCodigoBarra(p1.getCodigoBarra());
//		p2.setCantidad(2);
//		
//		lista.add(p11);
//		lista.add(p2);
//		
//		this.iVentaService.Realizarventa(lista, "1727490953", "1");
//		
//		System.out.println(this.iProductoService.buscarcodigo("12345"));
//		
//		System.out.println(this.detalleService.buscar(LocalDateTime.now(), "manzana", 2));

		
	}

}
