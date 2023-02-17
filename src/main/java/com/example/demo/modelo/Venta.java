package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ven_sec")
	@SequenceGenerator(name = "ven_sec", sequenceName = "ven_sec", allocationSize = 1)
	@Column(name = "ven_id")
	private String id;
	@Column(name = "ven_numero")
	private String numero;
	@Column(name = "ven_fecha")
	private LocalDateTime  fecha;
	@Column(name = "ven_cedula_cliente")
	private String cedulaCliente;
	@Column(name = "ven_total_venta")
	private BigDecimal totalVenta;
	
	
	@OneToMany(mappedBy = "venta")
	private List<Detalle> detalle;
	
	
	
	
	
	public List<Detalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<Detalle> detalle) {
		this.detalle = detalle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public BigDecimal getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	
	
	
	

	
	
}
