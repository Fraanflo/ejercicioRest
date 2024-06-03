package cl.bootcamp.AyudantiaEjCertificacionUno.service;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;

public interface ProductoService {

	List<Producto> getAllByCategory(int idCategoria);
}
