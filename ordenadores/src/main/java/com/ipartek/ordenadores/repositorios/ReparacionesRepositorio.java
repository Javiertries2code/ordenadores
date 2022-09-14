package com.ipartek.ordenadores.repositorios;



import org.springframework.data.repository.CrudRepository;

import com.ipartek.ordenadores.entidades.Reparacion;

public interface ReparacionesRepositorio extends CrudRepository<Reparacion, Long> {

	Iterable<Reparacion>	findByNumSerieOrNombreEquipoContains(String equipo);
}
