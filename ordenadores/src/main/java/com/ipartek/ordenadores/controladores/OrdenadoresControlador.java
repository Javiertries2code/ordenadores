package com.ipartek.ordenadores.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipartek.ordenadores.entidades.Ordenador;
import com.ipartek.ordenadores.entidades.Ordenador.TipoAlmacenamiento;
import com.ipartek.ordenadores.servicios.OrdenadoresServicioImpl;
import com.ipartek.ordenadores.servicios.ReparacionesServicioImpl;

@Controller
@RequestMapping("/ordenadores")
public class OrdenadoresControlador {
	@Autowired
	private OrdenadoresServicioImpl servicioOR;

	@Autowired
	private ReparacionesServicioImpl servicioRe;

	@PostMapping("/buscar")
	public String busquedaEspecificaciones(@RequestParam Model modelo,
			Integer disk, Integer gbRam, String core, Ordenador ordenador) {
//		Iterable<Ordenador> ordenadores;
		
		//hare una busqueda por equipos esten disponibles
//
//		if(tipoAlmacenamiento != null) {
//			inmuebles = servicio.alquilerVentaOTodas(tipo);
//			ordenadores = servicioOR.
//		} else if(min != null && max != null) {
//			inmuebles = servicio.rangoDePrecio(min, max);
//		} else if(texto != null) {
//			inmuebles = servicio.nombreODireccion(texto);
//		} else {
//			inmuebles = servicio.alquilerVentaOTodas(null);	
//		}

		modelo.addAttribute("listabusqueda", servicioOR.buscarCoreRamDisk(core, gbRam, disk));
		return "paginaBusqueda";
	

}}
