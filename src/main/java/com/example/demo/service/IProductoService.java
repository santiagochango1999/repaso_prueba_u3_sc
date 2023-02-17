package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.dto.ProductoDTO;

public interface IProductoService {

	public void insertar(Producto producto);
	public 	Producto buscar(String codigoBarra);
	public  void actualizar(Producto producto);
	public 	ProductoDTO buscarcodigo(String codigoBarra);

}
