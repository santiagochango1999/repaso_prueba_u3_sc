package com.example.demo.modelo.dto;

public class ProductoDTO {
	
	private String codigoBarra;
	private String nombre;
	private String categoria;
	private Integer stock;
	
	
	public ProductoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoDTO(String codigoBarra, String nombre, String categoria, Integer strock) {
		super();
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.categoria = categoria;
		stock = strock;
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getStrock() {
		return stock;
	}
	public void setStrock(Integer strock) {
		stock = strock;
	}
	
	

	

}
