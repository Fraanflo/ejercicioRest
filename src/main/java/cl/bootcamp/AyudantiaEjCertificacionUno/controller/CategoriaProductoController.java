package cl.bootcamp.AyudantiaEjCertificacionUno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.CategoriaProductoService;

@RestController
@RequestMapping("/categoria")
public class CategoriaProductoController {
	
	private final CategoriaProductoService categoriaProductoService;

	public CategoriaProductoController(CategoriaProductoService categoriaProductoService) {
		this.categoriaProductoService = categoriaProductoService;
	}
	
	@GetMapping("/list")
	public List<CategoriaProducto> getAll(){
		return categoriaProductoService.getAll();
	}
	
	@GetMapping("/{idCategoriaProducto}")
	public CategoriaProducto getById(@PathVariable int idCategoriaProducto) {
		return categoriaProductoService.getById(idCategoriaProducto);
	}

}
