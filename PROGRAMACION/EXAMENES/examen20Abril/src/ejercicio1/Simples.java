package ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Simples extends Habitaciones {
	
public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.of (2021,03,15);
		Simples reserva1 = new Simples (1, ld1);
		
		System.out.println(reserva1.calcularPrecio());
		
		
}

	private final static int MAXIMOAFORO=1;
	


	public Simples(int capacidad, LocalDate fechaInicio) {
		super(capacidad, fechaInicio);
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


	public String toString() {
		return "La capacidad es " + capacidad  + "  y comienza en la fecha " + fechaInicio;
	}



	
}
