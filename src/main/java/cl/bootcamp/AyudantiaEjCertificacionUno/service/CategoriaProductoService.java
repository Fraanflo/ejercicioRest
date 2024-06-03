package cl.bootcamp.AyudantiaEjCertificacionUno.service;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;

public interface CategoriaProductoService {
	
	CategoriaProducto getById(int idCategoriaProducto);
	List<CategoriaProducto> getAll();

}
