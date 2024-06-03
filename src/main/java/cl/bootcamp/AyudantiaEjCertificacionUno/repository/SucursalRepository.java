package cl.bootcamp.AyudantiaEjCertificacionUno.repository;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Sucursal;

public interface SucursalRepository {

	Sucursal getById(int id);
	List<Sucursal> listAll();
	
}
