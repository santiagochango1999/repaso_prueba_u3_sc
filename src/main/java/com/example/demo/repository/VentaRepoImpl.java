package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VentaRepoImpl implements IVentaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
	}

}
