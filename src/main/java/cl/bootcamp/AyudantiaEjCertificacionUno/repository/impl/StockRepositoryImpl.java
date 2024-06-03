package cl.bootcamp.AyudantiaEjCertificacionUno.repository.impl;



import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.bootcamp.AyudantiaEjCertificacionUno.model.CategoriaProducto;
import cl.bootcamp.AyudantiaEjCertificacionUno.model.Producto;
import cl.bootcamp.AyudantiaEjCertificacionUno.model.Stock;
import cl.bootcamp.AyudantiaEjCertificacionUno.repository.StockRepository;

@Repository
public class StockRepositoryImpl implements StockRepository {

	private final JdbcTemplate jdbcTemplate;		
	
	public StockRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Stock getStock(int idProducto, int idSucursal) {
		 String sql = "SELECT * FROM stock WHERE idProducto = ? AND idSucursal = ?";
	        try {
	            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Stock.class), idProducto, idSucursal);
	        } catch (EmptyResultDataAccessException ex) {

	        	return null; 
	        }
	}
	@Override
	public List<Stock> getAllStock(Integer idSucursal, Integer idCategoriaProducto) {
		 String sql = "SELECT s.idSucursal, s.idProducto, p.nombreProducto, cp.nombre, s.stock " +
                 "FROM `stock` s " +
                 "JOIN `producto` p ON s.idProducto = p.idProducto " +
                 "JOIN `categoria_producto` cp ON p.`FK_idCategoriaProducto` = cp.idCategoriaProducto " +
                 "WHERE s.idSucursal = ? AND p.`FK_idCategoriaProducto` = ?";
    try {
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Stock stock = new Stock();
            Producto p = new Producto();
            CategoriaProducto cp = new CategoriaProducto();

            stock.setIdProducto(rs.getInt("idProducto"));
            stock.setIdSucursal(rs.getInt("idSucursal"));
            stock.setStock(rs.getInt("stock"));
            p.setNombreProducto(rs.getString("nombreProducto"));
            cp.setNombre(rs.getString("nombre"));

            stock.setProducto(p);
            stock.setCategoriaProducto(cp);
            
            return stock;
        }, idSucursal, idCategoriaProducto); 
    } catch (EmptyResultDataAccessException ex) {
        System.out.println("nope");
        return null; 
    }
}
}