package cl.bootcamp.AyudantiaEjCertificacionUno.service;

import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;

public interface StockService {
	
	Stock getStock(int idProducto,int idSucursal);

	

	List<Stock> getAll(Integer idSucursal, Integer idCategoriaProducto);

}
