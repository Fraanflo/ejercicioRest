package cl.bootcamp.AyudantiaEjCertificacionUno.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Sucursal;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.SucursalRepository;


@Repository
public class SucursalRepositoryImpl implements SucursalRepository {

	private final JdbcTemplate jdbcTemplate;
	
	
	
	public SucursalRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Sucursal getById(int idSucursal) {
		String sql="SELECT * FROM SUCURSAL WHERE idSucursal="+idSucursal;
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Sucursal>(Sucursal.class));
	}

	@Override
	public List<Sucursal> listAll() {
		String sql="SELECT * FROM SUCURSAL ORDER BY nombre ASC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Sucursal>(Sucursal.class));
	}

}
