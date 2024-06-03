package cl.bootcamp.AyudantiaEjCertificacionUno.repository;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;


public interface CategoriaProductoRepository {

	CategoriaProducto getById(int idCategoriaProducto);
	List<CategoriaProducto> getAll();
}
