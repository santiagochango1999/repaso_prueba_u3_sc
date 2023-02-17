package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.ProductoCantidad;

public interface IVentaService {
	public void Realizarventa(List<ProductoCantidad> pc, String cedula, String nv);

}
