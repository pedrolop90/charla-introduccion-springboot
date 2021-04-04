package org.charla.introduccion.springframework.service;

import org.charla.introduccion.springframework.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {

	List<PersonaEntity> listarTodo();

	Long crear(PersonaEntity personaEntity);

	PersonaEntity actualizar(PersonaEntity personaEntity);

	void delete(Long idPersona);

	List<PersonaEntity> busquedaPorNombre(String nombre);

	List<PersonaEntity> busquedaPorLike(String nombre);

	List<PersonaEntity> busquedaPorLikeAndId(String nombre, Long id);

}
