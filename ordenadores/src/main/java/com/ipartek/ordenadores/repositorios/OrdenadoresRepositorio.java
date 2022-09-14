package com.ipartek.ordenadores.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.ordenadores.entidades.Ordenador;



public interface OrdenadoresRepositorio extends CrudRepository<Ordenador, Long> {

	Iterable<Ordenador> findByCoreAndRamAndDisk(String procesador, Integer ram, Integer disk);
	
}
