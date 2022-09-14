package com.ipartek.ordenadores.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "reparaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Reparacion {
	public enum Estado { Espera, Procesando, Terminado };
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//
//	public Reparacion(Long id, @NotNull Ordenador ordenadores, @NotBlank @NotNull String solicitante,
//			@NotNull @Size(max = 5000) @NotBlank String descripcion, @NotBlank @NotNull String tecnico) {
//		this(id, ordenadores, solicitante, descripcion, tecnico );
//	}

	@NotNull
	@ManyToOne
	@JsonBackReference
	private Ordenador ordenadores;
	
	@NotBlank
	@NotNull
	private String solicitante;
	
	@Lob
	@NotNull
	@Size(max = 5000)
	@NotBlank
	private String descripcion;
	
	@NotBlank
	@NotNull
	private String tecnico;
}