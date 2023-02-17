package com.example.demo.modelo;

public class ProductoCantidad {
	
	private String codigoBarra;
	private Integer cantidad;
	
	public ProductoCantidad() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoCantidad(String codigoBarra, Integer cantidad) {
		super();
		this.codigoBarra = codigoBarra;
		this.cantidad = cantidad;
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
