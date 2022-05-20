package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")

public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;

	@Column(name = "cedula", nullable = false, length = 12)
	private String cedula;

	@Column(name = "foto_url", nullable = true, length = 255)
	private String foto_url;

	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getFoto_url() {
		return foto_url;
	}



	public void setFoto_url(String foto_url) {
		this.foto_url = foto_url;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	

}