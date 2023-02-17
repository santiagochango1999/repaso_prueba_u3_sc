package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.dto.ReporteVentaDTO;

public interface IDetalleRepository {
	
	public void insertar(Detalle detalle);
	public List<ReporteVentaDTO> buscar(LocalDateTime fecha,String categoria,Integer cantidad); 
	
}
