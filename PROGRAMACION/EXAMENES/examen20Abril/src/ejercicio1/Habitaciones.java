package ejercicio1;

import java.time.LocalDate;

public abstract class Habitaciones extends Hotel {
	
	protected int capacidad;
	protected LocalDate fechaInicio;
	
	public Habitaciones(int capacidad, LocalDate fechaInicio) {
		super(capacidad, fechaInicio);

	}
	

}
