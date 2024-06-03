package cl.bootcamp.AyudantiaEjCertificacionUno.repository;


import java.util.List;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;

public interface StockRepository {
	
	Stock getStock(int idProducto,int idSucursal);

	List<Stock> getAllStock(Integer idSucursal, Integer idCategoriaProducto);



	

}
