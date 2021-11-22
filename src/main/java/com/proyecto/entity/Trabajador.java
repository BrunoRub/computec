package com.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trabajador")
@Getter
@Setter
public class Trabajador implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtra;
	
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 45)
	private String apellido;
	
	@Column(name = "numdoc", nullable = false, length = 8)
	private String numdoc;
	
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;
	
	@Column(name = "username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "clave", nullable = false, length = 20)
	private String clave;

	public Trabajador(Long idtra, String nombre, String apellido, String numdoc, String direccion, String telefono,
			String username, String clave) {
		super();
		this.idtra = idtra;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numdoc = numdoc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.username = username;
		this.clave = clave;
	}

	public Trabajador() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	@Override
	public String toString() {
		return "Cliente [idtra=" + idtra + ", nombre=" + nombre + ", apellido=" + apellido + ", numdoc=" + numdoc + 
				", direccion=" + direccion + ", telefono=" + telefono +  ", usuario=" + usuario + ", clave=" + clave + "]";
	}
	
	public String getDatos() {
		return getNombre() + " "+getApellido();
	}*/

	
}