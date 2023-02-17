package com.example.demo.modelo;

import java.math.BigDecimal;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle")

@NamedQuery(name = "Detalle.primera", query = "select NEW com.example.demo.modelo.dto.ReporteVentaDTO(p.codigoBarra,p.categoria,d.cantidad,d.precioUnitario,d.subtotal) from Producto p JOIN FETCH p.detalle d JOIN FETCH d.venta v where  v.fecha=:fecha and p.categoria=:categoria and d.cantidad>= :cantidad")

public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deta_sec")
	@SequenceGenerator(name = "deta_sec", sequenceName = "deta_sec", allocationSize = 1)
	@Column(name = "deta_id")
	private String id;
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	@Column(name = "deta_precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name = "deta_subtotal")
	private BigDecimal subtotal;

	@ManyToOne
	@JoinColumn(name = "deta_id_venta")
	private Venta venta;

	@ManyToOne
	@JoinColumn(name = "deta_id_producto")
	private Producto producto;

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	// GET Y SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

}
