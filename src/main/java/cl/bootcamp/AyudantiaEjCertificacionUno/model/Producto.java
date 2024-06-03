package cl.bootcamp.AyudantiaEjCertificacionUno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

	private int idProducto;
	private String nombreProducto;
	private String descripcion;
	private int precio;
	private int FK_idCategoriaProducto;
	private Stock stock;
}
