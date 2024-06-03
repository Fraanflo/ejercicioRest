package cl.bootcamp.AyudantiaEjCertificacionUno.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;
import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;
import cl.bootcamp.AyudantiaEjCertificacionUno.model.Sucursal;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.CategoriaProductoService;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.StockService;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.SucursalService;

@RequestMapping("/filtro")
@Controller
public class StockController {

	private final StockService stockService;
	private final SucursalService sucursalService;
	private final CategoriaProductoService categoriaProductoService;

	public StockController(StockService stockService, SucursalService sucursalService,
			CategoriaProductoService categoriaProductoService) {
		this.stockService = stockService;
		this.sucursalService = sucursalService;
		this.categoriaProductoService = categoriaProductoService;
	}

	@GetMapping("/stock")
	public String getStock(Model model, @RequestParam(required = false) Integer idSucursal,
			@RequestParam(required = false) Integer idCategoriaProducto) {

		System.out.println("idSucursal: " + idSucursal);
		System.out.println("idCategoriaProducto: " + idCategoriaProducto);

		List<Sucursal> sucursales = sucursalService.listAll();
		List<CategoriaProducto> categoriasProducto = categoriaProductoService.getAll();

		List<Stock> stocks = List.of(); 
		if (idSucursal != null && idCategoriaProducto != null) {
			stocks = stockService.getAll(idSucursal, idCategoriaProducto);
		}


		model.addAttribute("sucursales", sucursales);
		model.addAttribute("categoriasProducto", categoriasProducto);
		model.addAttribute("stocks", stocks);

		return "stock.jsp";
	}
}