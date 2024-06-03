package cl.bootcamp.AyudantiaEjCertificacionUno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	
	private int idProducto;
	private int idSucursal;
	private int stock;
	private int FK_idAdministrador;
	private Producto producto;
	private CategoriaProducto categoriaProducto;
}
