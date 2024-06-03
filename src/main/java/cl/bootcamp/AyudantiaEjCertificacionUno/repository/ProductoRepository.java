package cl.bootcamp.AyudantiaEjCertificacionUno.repository;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;


public interface ProductoRepository {

	List<Producto> getAllByCategory(int idCategoria);
}
