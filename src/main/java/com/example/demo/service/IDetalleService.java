package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.dto.ReporteVentaDTO;

public interface IDetalleService {

	public void insertar(Detalle detalle);
	public List<ReporteVentaDTO> buscar(LocalDateTime fecha,String categoria,Integer cantidad); 
	
}
