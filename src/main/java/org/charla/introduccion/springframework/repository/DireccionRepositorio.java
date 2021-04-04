package org.charla.introduccion.springframework.repository;

import org.charla.introduccion.springframework.entity.DireccionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepositorio extends CrudRepository<DireccionEntity, Long> {

	List<DireccionEntity> findByPersonaNombre(String nombre);

}
