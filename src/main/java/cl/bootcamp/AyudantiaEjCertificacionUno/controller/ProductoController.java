package cl.bootcamp.AyudantiaEjCertificacionUno.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;
import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.CategoriaProductoService;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.ProductoService;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.StockService;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.SucursalService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private final ProductoService productoService;
	private final StockService stockService;
	
	
	
	public ProductoController(CategoriaProductoService categoriaProductoService, ProductoService productoService,
			SucursalService sucursalService, StockService stockService) {
		super();
		this.productoService = productoService;
		this.stockService = stockService;
	}



	@GetMapping("/{idCategoriaProducto}/{idSucursal}")
    public List<Producto> getProductoBySucursal(@PathVariable int idCategoriaProducto, @PathVariable int idSucursal) {
        List<Producto> listado = new ArrayList<>();

        List<Producto> productosQuery = productoService.getAllByCategory(idCategoriaProducto);
        
        // Filtra los productos que tienen stock en la sucursal especificada
        for (Producto p : productosQuery) {
            Stock stock = stockService.getStock(p.getIdProducto(), idSucursal);
            if (stock != null && stock.getStock() > 0) {

            	p.setStock(stock);
                listado.add(p);
            }


    }
		return listado;
	
		
		
		
	}
}


