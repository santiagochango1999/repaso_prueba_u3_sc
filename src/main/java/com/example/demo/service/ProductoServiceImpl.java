package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.dto.ProductoDTO;
import com.example.demo.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		Producto p = this.buscar(producto.getCodigoBarra());
		
		if (p == null) {
			this.iProductoRepository.insertar(producto);
		} else {
			p.setStock(p.getStock() + producto.getStock());
			this.actualizar(p);
		}
	}

	@Override
	public Producto buscar(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(codigoBarra);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(producto);
	}

	@Override
	public ProductoDTO buscarcodigo(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscarcodigo(codigoBarra);
	}

}
