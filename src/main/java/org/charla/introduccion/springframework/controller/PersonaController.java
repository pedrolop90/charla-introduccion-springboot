package org.charla.introduccion.springframework.controller;

import org.charla.introduccion.springframework.entity.PersonaEntity;
import org.charla.introduccion.springframework.service.PersonaService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personas")
// "/personas"
public class PersonaController {

	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		this.personaService = personaService;
	}

	// "/personas"
	@GetMapping
	public List<PersonaEntity> listarTodo() {
		return personaService.listarTodo();
	}

	// "/personas"
	@PostMapping
	public Long crear(@RequestBody PersonaEntity personaEntity) {
		return personaService.crear(personaEntity);
	}

	// PUT "/personas/40"
	@PutMapping(path = "/{idPersona}")
	public PersonaEntity actualizar(@RequestBody PersonaEntity personaEntity, @PathVariable Long idPersona) {
		personaEntity.setId(idPersona);
		return personaService.actualizar(personaEntity);
	}

	// accion ruta
	// DELETE "localhost:8090/personas/idPersona"
	@DeleteMapping(path = "/{idPersona}")
	public void eliminar(@PathVariable Long idPersona) {
		personaService.delete(idPersona);
	}

	@GetMapping(path = "/nombre/{nombre}")
	public List<PersonaEntity> busquedaPorNombre(@PathVariable String nombre) {
		return personaService.busquedaPorNombre(nombre);
	}

	@GetMapping(path = "/nombre/like/{nombre}")
	public List<PersonaEntity> busquedaPorLike(@PathVariable String nombre) {
		return personaService.busquedaPorLike(nombre);
	}

	@GetMapping(path = "/nombre/id/{nombre}/{id}")
	public List<PersonaEntity> busquedaPorLikeAndId(@PathVariable String nombre, @PathVariable Long id) {
		return personaService.busquedaPorLikeAndId(nombre, id);
	}
}
