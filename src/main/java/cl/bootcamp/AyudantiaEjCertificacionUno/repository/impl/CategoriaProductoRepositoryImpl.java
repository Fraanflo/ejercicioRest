package cl.bootcamp.AyudantiaEjCertificacionUno.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.CategoriaProductoRepository;


@Repository
public class CategoriaProductoRepositoryImpl implements CategoriaProductoRepository {

	private final JdbcTemplate jdbcTemplate;
		
	public CategoriaProductoRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public CategoriaProducto getById(int idCategoriaProducto) {
		String sql = "SELECT * FROM CATEGORIA_PRODUCTO WHERE idCategoriaProducto="+idCategoriaProducto;
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<CategoriaProducto>(CategoriaProducto.class));
	}

	@Override
	public List<CategoriaProducto> getAll() {
		String sql = "SELECT * FROM CATEGORIA_PRODUCTO ORDER BY nombre ASC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<CategoriaProducto>(CategoriaProducto.class));
	}

}
