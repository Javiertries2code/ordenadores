package com.ipartek.ordenadores.servicios;

import com.ipartek.ordenadores.entidades.Ordenador;

public interface OrdenadoresServicio {

	Iterable<Ordenador> buscarCoreRamDisk(String core, Integer ram, Integer disk);
	
}
