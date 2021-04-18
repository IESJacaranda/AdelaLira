package ejercicio3B;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fijo extends Empleado {

	private LocalDate añoAlta;

	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate añoAlta) {
		super(nombre, edad, NIF, sueldo);
		this.añoAlta=añoAlta;

	}

	@Override
	public double calculaSueldo() {
		int añosEnEmpresa = 1;
		double sueldoFinal=0.0;

		añosEnEmpresa=(int) ChronoUnit.YEARS.between(this.añoAlta, LocalDate.now());
		sueldoFinal=sueldo+(añosEnEmpresa*20);
		
		return sueldoFinal;
	}
	
	


	
	
	
}
