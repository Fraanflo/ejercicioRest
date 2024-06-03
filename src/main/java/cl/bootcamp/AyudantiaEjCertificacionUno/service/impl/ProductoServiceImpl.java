package cl.bootcamp.AyudantiaEjCertificacionUno.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.ProductoRepository;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	private final ProductoRepository productoRepository;
	
		
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}



	@Override
	public List<Producto> getAllByCategory(int idCategoriaProducto) {
		return productoRepository.getAllByCategory(idCategoriaProducto);
	}

}
