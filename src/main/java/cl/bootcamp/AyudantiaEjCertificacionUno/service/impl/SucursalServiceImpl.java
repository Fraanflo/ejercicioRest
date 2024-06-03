package cl.bootcamp.AyudantiaEjCertificacionUno.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Sucursal;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.SucursalRepository;
import cl.bootcamp.AyudantiaEjCertificacionUno.service.SucursalService;

@Service
public class SucursalServiceImpl implements SucursalService {

	private final SucursalRepository sucursalRepository;
	
	
	
	public SucursalServiceImpl(SucursalRepository sucursalRepository) {
		this.sucursalRepository = sucursalRepository;
	}

	@Override
	public Sucursal getById(int id) {

		return sucursalRepository.getById(id);
	}

	@Override
	public List<Sucursal> listAll() {

		return sucursalRepository.listAll();
	}

}
