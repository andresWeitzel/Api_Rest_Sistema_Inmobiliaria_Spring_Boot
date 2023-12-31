package com.sistema_inmobiliaria.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="propietarios_inmuebles")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropietarioInmueble {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Id
	@Column(name="id", nullable=false , unique=true)
	private int id;
	
	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="apellido", nullable=false, length=100)
	private String apellido;
	
	@Column(name="edad", nullable=false)
	private int edad;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private Date fechaNac;
	
	@Column(name="tipo_documento", nullable=false, length=30)
	private String tipoDoc;
	
	@Column(name="nro_documento", nullable=false, length=50 , unique=true)
	private String nroDoc;
	
	@Column(name="direccion", nullable=false, length=100 )
	private String direc;
	
	@Column(name="nro_telefono_principal", nullable=false, length=40 , unique=true)
	private String nroTelPrinc;
	
	@Column(name="nro_telefono_secundario", nullable=true, length=50 )
	private String nroTelSec;
	
	@Column(name="email", nullable=true, length=50 , unique=true)
	private String email;
	
	
	
}
