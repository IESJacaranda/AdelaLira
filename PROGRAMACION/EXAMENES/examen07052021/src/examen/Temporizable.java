package examen;

import java.time.LocalDate;

public interface Temporizable {

	//LA excepcion la he añadido aunque no se pida porque nos dice que el numero de dias debe ser positivo, y asi controlamos la situacion
	public int numeroDias(LocalDate fecha) throws DiasPositivosException;
	
}
