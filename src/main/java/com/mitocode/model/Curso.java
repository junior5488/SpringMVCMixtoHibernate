package com.mitocode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String descripcion;
	
	@Column
	private String creditos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", descripcion=" + descripcion + ", creditos=" + creditos + "]";
	}
}
