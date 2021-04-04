package org.charla.introduccion.springframework.service;

import org.charla.introduccion.springframework.entity.DireccionEntity;
import org.charla.introduccion.springframework.entity.PersonaEntity;

import java.util.List;

public interface DireccionService {

	List<DireccionEntity> listarTodo();

	Long crear(DireccionEntity direccion);

	List<DireccionEntity> busquedaPorNombre(String nombre);


}
