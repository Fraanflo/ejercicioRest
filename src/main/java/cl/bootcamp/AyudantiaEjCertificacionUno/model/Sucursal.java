package cl.bootcamp.AyudantiaEjCertificacionUno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {

	private int idSucursal;
	private String nombre;
	private String direccion;
	private String comuna;
	private String telefono;
	
}
