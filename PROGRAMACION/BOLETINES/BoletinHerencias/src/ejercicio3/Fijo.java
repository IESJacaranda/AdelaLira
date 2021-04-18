package ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fijo extends Empleado {

	private LocalDate fechaAlta;
	

	public Fijo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate fechaAlta) {
		super(nombre, edad, NIF, sueldo);
		this.fechaAlta=fechaAlta;
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcularSueldo() {
		int añosContrato;
		añosContrato=(int) ChronoUnit.YEARS.between(fechaAlta, LocalDate.now());
		return "El sueldo de " + this.nombre + " es " + (añosContrato*20)+this.sueldo;
	}

}
