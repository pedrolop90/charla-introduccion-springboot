package org.charla.introduccion.springframework.controller;

import org.charla.introduccion.springframework.entity.DireccionEntity;
import org.charla.introduccion.springframework.service.DireccionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/direccion")
public class DireccionController {

	private DireccionService direccionService;

	public DireccionController(DireccionService direccionService) {
		this.direccionService = direccionService;
	}

	@GetMapping
	public List<DireccionEntity> listarTodo() {
		return direccionService.listarTodo();
	}

	@PostMapping
	public Long crear(@RequestBody DireccionEntity direccion) {
		return direccionService.crear(direccion);
	}

	@GetMapping(path = "/persona-nombre/{nombre}")
	public List<DireccionEntity> listarTodo(@PathVariable String nombre) {
		return direccionService.busquedaPorNombre(nombre);
	}
}
