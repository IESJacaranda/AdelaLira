package ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dobles extends Habitaciones {
	
	private final static int MAXIMOAFORO=2;

	public Dobles(int capacidad, LocalDate fechaInicio) {
		super(capacidad, fechaInicio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		int diasReservados;
		diasReservados=(int) ChronoUnit.DAYS.between(this.fechaInicio, LocalDate.now());
		
		double precioReserva = 1;
		if(this.capacidad==MAXIMOAFORO) {
			precioReserva=((10.75*(this.capacidad* diasReservados))*1.15);
		}
		else {		
			System.out.println("No es posible realizar la reserva");
		}
		
		return precioReserva;
	}

	

}
