package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.dto.ReporteVentaDTO;
import com.example.demo.repository.IDetalleRepository;

@Service
public class DetalleServiceImpl implements IDetalleService {

	@Autowired
	private IDetalleRepository detalleRepository;

	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub
		this.detalleRepository.insertar(detalle);
		;
	}

	@Override
	public List<ReporteVentaDTO> buscar(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		return this.detalleRepository.buscar(fecha, categoria, cantidad);
	}

}
