package cl.bootcamp.AyudantiaEjCertificacionUno.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.StockRepository;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.StockService;

@Service
public class StockServiceImpl implements StockService {
	
	private final StockRepository stockRepository;
	
	
	public StockServiceImpl(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}


	@Override
	public Stock getStock(int idProducto, int idSucursal) {
		  return stockRepository.getStock(idProducto, idSucursal);
	       
	}


	@Override
	public List<Stock> getAll(Integer idSucursal, Integer idCategoriaProducto){
		   try {
		        return stockRepository.getAllStock(idSucursal, idCategoriaProducto);
		    } catch (Exception ex) {
		      
		        ex.printStackTrace();
		        return null;
		    }
	}


	
	
}
