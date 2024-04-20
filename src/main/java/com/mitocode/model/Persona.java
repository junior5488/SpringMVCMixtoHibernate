package com.mitocode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "persona")
public class Persona implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String apellidos;
	
	@Column
	private String nombres;
	
	@Transient
	private String nombreCompleto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNombreCompleto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.apellidos).append(", ").append(this.nombres);
		return sb.toString();
//		return this.apellidos + ", " + this.nombres;
		
	}
}
