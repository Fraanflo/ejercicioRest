package cl.bootcamp.AyudantiaEjCertificacionUno.service.impl;

import java.util.List; 

import org.springframework.stereotype.Service;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.CategoriaProductoRepository;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.CategoriaProductoService;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

	private final CategoriaProductoRepository categoriaProductoRepository;
	
	
	
	public CategoriaProductoServiceImpl(CategoriaProductoRepository categoriaProductoRepository) {
		this.categoriaProductoRepository = categoriaProductoRepository;
		
	}

	@Override
	public CategoriaProducto getById(int idCategoriaProducto) {
		// TODO Auto-generated method stub
		return categoriaProductoRepository.getById(idCategoriaProducto);
	}

	@Override
	public List<CategoriaProducto> getAll() {
	    return categoriaProductoRepository.getAll();
	}



}
