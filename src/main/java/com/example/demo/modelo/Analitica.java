package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analiticas")
public class Analitica {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idAnalitica;

@Column(name="descripcion", nullable=true,length = 150)
private String descripcion;

@Column(name="nombre", nullable=false,length = 50)
private String nombre;

public Integer getIdAnalitica() {
	return idAnalitica;
}

public void setIdAnalitica(Integer idAnalitica) {
	this.idAnalitica = idAnalitica;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}





}