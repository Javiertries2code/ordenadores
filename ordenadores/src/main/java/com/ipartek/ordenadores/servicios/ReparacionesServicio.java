package com.ipartek.ordenadores.servicios;

import com.ipartek.ordenadores.entidades.Reparacion;

public interface ReparacionesServicio {
	
	
	Iterable<Reparacion> historicoOrdenador(String equipo);

}
