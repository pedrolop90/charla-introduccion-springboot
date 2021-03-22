package org.charla.introduccion.springframework.service;

import org.charla.introduccion.springframework.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {

	List<PersonaEntity> listarTodo();

	Long crear(PersonaEntity personaEntity);

	PersonaEntity actualizar(PersonaEntity personaEntity);

	void delete(Long idPersona);
}
