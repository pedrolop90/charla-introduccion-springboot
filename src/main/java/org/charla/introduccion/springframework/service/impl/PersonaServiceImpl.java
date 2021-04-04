package org.charla.introduccion.springframework.service.impl;

import org.charla.introduccion.springframework.entity.PersonaEntity;
import org.charla.introduccion.springframework.repository.PersonaRepository;
import org.charla.introduccion.springframework.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

	public PersonaRepository personaRepository;

	public PersonaServiceImpl(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	@Override
	public List<PersonaEntity> listarTodo() {
		return (List<PersonaEntity>) personaRepository.findAll();
	}

	@Override
	public Long crear(PersonaEntity personaEntity) {
		personaRepository.save(personaEntity);
		return personaEntity.getId();
	}

	@Override
	public PersonaEntity actualizar(PersonaEntity personaEntity) {
		return personaRepository.save(personaEntity);
	}

	@Override
	public void delete(Long idPersona) {
		personaRepository.deleteById(idPersona);
	}

	@Override
	public List<PersonaEntity> busquedaPorNombre(String nombre) {
		return personaRepository.findByNombre(nombre);
	}

	@Override
	public List<PersonaEntity> busquedaPorLike(String nombre) {
		return personaRepository.findByNombreLike("%" + nombre + "%");
	}

	@Override
	public List<PersonaEntity> busquedaPorLikeAndId(String nombre, Long id) {
		return personaRepository.findByNombreLikeAndId("%" + nombre + "%", id);
	}
}
