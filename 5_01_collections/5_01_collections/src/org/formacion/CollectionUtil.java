package org.formacion;

import java.util.List;
import java.util.Map;
public class CollectionUtil {

	/**
	 * Modifica la lista orignial de personas eliminando las personas que 
	 * tengan un nombre con un espacio en blanco 
	 */
	public void eliminaNombresConEspacios(List<Persona> original) {
		original.removeIf(it -> it.getNombre().contains(" "));
	}
	
	/**
	 * Modifica la lista con pasando todos los nombres a mayúscula (nombre, primer y segundo apellido)
	 * Id con cuidado con el segundo apellido, que es optional!
	 */
	public void pasarAMayusculas (List<Persona> original) {
		original.replaceAll(persona -> new Persona(persona.getNombre().toUpperCase(), 
													persona.getApellido1().toUpperCase(), 
													persona.getApellido2().map(String::toUpperCase)
													));
	}
	
	
	/**
	 * Devuelve una cadena con el contenido del map
	 * si map es
	 * [ "prod1", 4
	 *   "prod2", 5 ]
	 * El metodo debe devolver "prod1:4,prod2:5," 
	 */
	public String aTexto (Map<String, Integer> factura) {
		StringBuilder sb = new StringBuilder();
		factura.forEach((k, v) -> sb.append(k + ":" + v + ","));
		return sb.toString();
	}
}
