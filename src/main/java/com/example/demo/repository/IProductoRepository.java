package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.dto.ProductoDTO;

public interface IProductoRepository {
	
	public void insertar(Producto producto);
	public 	Producto buscar(String codigoBarra);
	public  void actualizar(Producto producto);
	public 	ProductoDTO buscarcodigo(String codigoBarra);


}
