package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;


public  class Hotel {
	
	protected int capacidad;
	protected LocalDate fechaInicio;

	public Hotel() {
		
	}
	
	public Hotel(int capacidad, LocalDate fechaInicio) {
		this.capacidad=capacidad;
		this.fechaInicio=fechaInicio;
	}
	
	double calcularPrecio() {
		return 0;
	}
	
	public String inicializarHotel() {
		LocalDate ld = LocalDate.now();
		Simples reserva1 = new Simples(1, ld);
		Simples reserva2 = new Simples(1, ld);
		Simples reserva3 = new Simples(1, ld);
		Simples reserva4 = new Simples(1, ld);
		Simples reserva5 = new Simples(1, ld);
		Dobles reserva6 = new Dobles(2, ld);
		Dobles reserva7 = new Dobles(1, ld);
		Dobles reserva8 = new Dobles(2, ld);
		Suite reserva9 = new Suite(2, ld);
		Celebraciones reserva10 = new Celebraciones(50, ld);
		Celebraciones reserva11 = new Celebraciones(80, ld);
		Reuniones reserva12 = new Reuniones(5, ld);
		Reuniones reserva13 = new Reuniones(10, ld);
		
		return "Se dispone de estas salas para reservar" + reserva1 +", "+ reserva2+ ", "
				+ reserva3+ ", "+ reserva4 +", "+ reserva5+ ", "+ reserva6+ ", "+ reserva7+ ", "
						+ reserva8+ ", "+ reserva9 +", "+ reserva10+ ", "+ reserva11+ ", "+ reserva12 +", "+ reserva13;

	}
	
	public void listarInstalaciones() {
		LocalDate ld = LocalDate.now();
		Simples reserva1 = new Simples(1, ld);
		Dobles reserva8 = new Dobles(2, ld);
		Suite reserva9 = new Suite(2, ld);
		Celebraciones reserva10 = new Celebraciones(50, ld);
		Reuniones reserva12 = new Reuniones(5, ld);
		System.out.println(reserva1);
		System.out.println(reserva8);
		System.out.println(reserva9);
		System.out.println(reserva10);
		System.out.println(reserva12);
	}


	
	public void listarReservaInstalaciones(){
		
	}
	
	public void calcularIngresosGenerados() {
		
	}
	
	public void listarInstalacionesEnFecha(LocalDate localDate) {
		
		if(reservados.fechaInicio==LocalDate.now()) {
			System.out.println(reservados);
		}
		
	}

	public void addReserva(Reservas reservarInstalacion) {
		Reservas reservados = new Reservas();
		LocalDate ld = LocalDate.now();
		
		reservados.addReserva(new Hotel (1, ld));
		reservados.addReserva(new Hotel (1, ld));
		reservados.addReserva(new Hotel (1, ld));
		reservados.addReserva(new Hotel (1, ld));
		reservados.addReserva(new Hotel (1, ld));
		reservados.addReserva(new Hotel (1, ld));
		
	}

}
