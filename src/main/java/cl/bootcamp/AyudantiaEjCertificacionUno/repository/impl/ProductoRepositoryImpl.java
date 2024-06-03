package cl.bootcamp.AyudantiaEjCertificacionUno.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.ProductoRepository;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {

	private final JdbcTemplate jdbcTemplate;	
	
	public ProductoRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public List<Producto> getAllByCategory(int idCategoriaProducto) {
		
		String sql="SELECT * FROM PRODUCTO WHERE FK_idCategoriaProducto="+idCategoriaProducto;
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Producto>(Producto.class));
		
	}

}
