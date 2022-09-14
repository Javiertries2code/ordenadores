package com.ipartek.ordenadores.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.ordenadores.entidades.Ordenador;
import com.ipartek.ordenadores.repositorios.OrdenadoresRepositorio;

@Service
public class OrdenadoresServicioImpl implements OrdenadoresServicio{
	
	@Autowired
	OrdenadoresRepositorio repoOr;

	@Override
	public Iterable<Ordenador> buscarCoreRamDisk(String core, Integer ram, Integer disk) {
		// TODO Auto-generated method stub
		return repoOr.findByCoreAndRamAndDisk(core, ram, disk);
	}
	
	

}
