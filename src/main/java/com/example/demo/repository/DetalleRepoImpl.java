package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.dto.ReporteVentaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleRepoImpl implements IDetalleRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalle);
	}

	@Override
	public List<ReporteVentaDTO> buscar(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		TypedQuery<ReporteVentaDTO> typedQuery=this.entityManager.createQuery("Detalle.primera",ReporteVentaDTO.class);
		typedQuery.setParameter("fecha", fecha);
		typedQuery.setParameter("categoria", categoria);
		typedQuery.setParameter("cantidad", cantidad);
		return typedQuery.getResultList();
	}

}
