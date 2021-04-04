package org.charla.introduccion.springframework.repository;

import org.charla.introduccion.springframework.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaEntity, Long> {

	// buscar por nombre
	List<PersonaEntity> findByNombre(String nombre);

	// buscar por %nombre%
	List<PersonaEntity> findByNombreLike(String nombre);

	// buscar por %nombre%
	List<PersonaEntity> findByNombreLikeAndId(String nombre, Long id);

	// buscar por %nombre%
	List<PersonaEntity> findByNombreContaining(String nombre);
}
