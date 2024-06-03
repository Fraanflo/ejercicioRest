package cl.bootcamp.AyudantiaEjCertificacionUno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Sucursal;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.SucursalService;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
	
	private final SucursalService sucursalService;	
	
	public SucursalController(SucursalService sucursalService) {
		this.sucursalService = sucursalService;
	}


	@GetMapping
	public List<Sucursal> listAll(){
		return sucursalService.listAll();
	}
	
	@GetMapping("/{id}")
	public Sucursal getSucursal(@PathVariable int id) {
		return sucursalService.getById(id);
	} 

}
