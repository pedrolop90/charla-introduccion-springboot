package org.charla.introduccion.springframework.repository;

import org.charla.introduccion.springframework.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaEntity, Long> {
}
