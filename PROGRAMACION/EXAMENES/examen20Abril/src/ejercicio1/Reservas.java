package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


public class Reservas {
	
public static void main(String[] args) {
		
		
		
}



	private List <Hotel> hoteles;
	
	
	private String fechaInicio;
	private String fechaFin;
	private String nombre;
	private String apellido;
	private String DNI;
	
	public Reservas () {
		
	}
	
	public Reservas(String fechaInicio, String fechaFin, String nombre, String apellido, String DNI) {
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=DNI;
		hoteles = new ArrayList<Hotel>();
	}

	public void addReserva (Hotel hotel) {
		this.hoteles.add(hotel);
	}

	public List<Hotel> getHotel() {
		return hoteles;
	}
	
	
	
	@Override
	public String toString() {
		String reservaDatos = "Se ha realizado una reserva a nombre de %s,  apellido %s, DNI %s, fecha de inicio %s y fecha de fin %s";
		return String.format(reservaDatos, nombre, apellido, DNI, fechaInicio, fechaFin);
	}

	
}
