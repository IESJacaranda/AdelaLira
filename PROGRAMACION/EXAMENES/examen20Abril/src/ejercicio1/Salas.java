package ejercicio1;

import java.time.LocalDate;

public abstract class Salas extends Hotel {

	protected int capacidad;
	protected LocalDate fechaInicio;
	
	public Salas(int capacidad, LocalDate fechaInicio) {
		super(capacidad, fechaInicio);
	}
	
}
	

