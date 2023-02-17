package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.dto.ProductoDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProdcutoRepoImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(String codigoBarra) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> typedQuery = this.entityManager
				.createQuery("select p from Producto p where p.codigoBarra= :datoBarra", Producto.class);
		typedQuery.setParameter("datoBarra", codigoBarra);
		return typedQuery.getSingleResult();
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public ProductoDTO buscarcodigo(String codigoBarra) {
		TypedQuery<ProductoDTO> typedQuery=this.entityManager.createQuery("select New com.example.demo.modelo.dto.ProductoDTO(p.codigoBarras,p.nombre,p.categoria,p.stock) from Producto p where p.codigoBarras=:datoCodigo", ProductoDTO.class);
//		TypedQuery<ProductoDTO> typedQuery=this.entityManager.createNativeQuery("select New com.example.demo.modelo.dto.ProductoDTO(pro_codigo_barra,pro_nombre,pro_categoria,pro_stock) from producto  where pro_codigo_barra =:datoCodigo", ProductoDTO.class);

		typedQuery.setParameter("datoCodigo", codigoBarra);
		return typedQuery.getSingleResult();
	}

}
