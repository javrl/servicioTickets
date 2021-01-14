package com.demo.tickets.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {
	
	private static final long serialVersionUID = 1285454306356845809L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_salida")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaSalida;
	
	@Column(name = "fecha_llegada")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaLlegada;
	
	@Column(name = "ciudad_origen")
	private String ciudadOrigen;
	
	@Column(name = "ciudad_destino")
	private String ciudadDEstino;
	
	@Column(name = "nombre_pasajero")
	private String nombrePasajero;
	
	@Column(name = "edad_pasajero")
	private int edadPasajero;
	
	@Column(name = "bodega_equipaje")
	private boolean bodegaEquipaje;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "hora_salida")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date horaSalida;
	
	@Column(name = "hora_llegada")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date horaLlegada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDEstino() {
		return ciudadDEstino;
	}

	public void setCiudadDEstino(String ciudadDEstino) {
		this.ciudadDEstino = ciudadDEstino;
	}

	public String getNombrePasajero() {
		return nombrePasajero;
	}

	public void setNombrePasajero(String nombrePasajero) {
		this.nombrePasajero = nombrePasajero;
	}

	public int getEdadPasajero() {
		return edadPasajero;
	}

	public void setEdadPasajero(int edadPasajero) {
		this.edadPasajero = edadPasajero;
	}

	public boolean getBodegaEquipaje() {
		return bodegaEquipaje;
	}

	public void setBodegaEquipaje(boolean bodegaEquipaje) {
		this.bodegaEquipaje = bodegaEquipaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	

}
