package com.ipartek.ordenadores.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.ordenadores.entidades.Reparacion;
import com.ipartek.ordenadores.repositorios.ReparacionesRepositorio;

import lombok.extern.java.Log;

@Log
@Service
public class ReparacionesServicioImpl implements ReparacionesServicio {
	@Autowired
	ReparacionesRepositorio repoRe;


	@Override
	public Iterable<Reparacion> historicoOrdenador(String equipo) {
		log.info("Se ha pedido una lista del historico de averias de "+ equipo);

		return repoRe.findByNumSerieOrNombreEquipoContains(equipo);
	}

}
