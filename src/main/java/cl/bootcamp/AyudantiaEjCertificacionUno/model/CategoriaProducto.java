package cl.bootcamp.AyudantiaEjCertificacionUno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProducto {
	
	private int idCategoriaProducto;
	private String nombre;
	private String descripcion;

}
