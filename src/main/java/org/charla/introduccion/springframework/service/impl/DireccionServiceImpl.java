package org.charla.introduccion.springframework.service.impl;

import org.charla.introduccion.springframework.entity.DireccionEntity;
import org.charla.introduccion.springframework.repository.DireccionRepositorio;
import org.charla.introduccion.springframework.service.DireccionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionServiceImpl implements DireccionService {

	private DireccionRepositorio direccionRepositorio;

	public DireccionServiceImpl(DireccionRepositorio direccionRepositorio) {
		this.direccionRepositorio = direccionRepositorio;
	}


	@Override
	public List<DireccionEntity> listarTodo() {
		return (List<DireccionEntity>) direccionRepositorio.findAll();
	}

	@Override
	public Long crear(DireccionEntity direccion) {
		direccionRepositorio.save(direccion);
		return direccion.getId();
	}

	@Override
	public List<DireccionEntity> busquedaPorNombre(String nombre) {
		return direccionRepositorio.findByPersonaNombre(nombre);
	}
}
