package com.ipartek.ordenadores.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "ordenadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Ordenador {
	
	public enum TipoAlmacenamiento { Hdd, Sdd };
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String aula;

	@NotNull
	private String nombreEquipo;
	
	@NotNull
	private String core;

	
	@NotNull
	private String numSerie;
	
	@NotNull
	private Integer ram;
	
	@NotNull
	private Integer disk;
	
	@NotNull
	private  TipoAlmacenamiento tipoAlmacenamiento;
	

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy = "ordenadores")
	@JsonManagedReference
	private Set<Reparacion> reparaciones;
	
}