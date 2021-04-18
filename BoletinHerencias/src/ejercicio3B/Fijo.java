package ejercicio3B;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fijo extends Empleado {

	private LocalDate a�oAlta;

	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate a�oAlta) {
		super(nombre, edad, NIF, sueldo);
		this.a�oAlta=a�oAlta;

	}

	@Override
	public double calculaSueldo() {
		int a�osEnEmpresa = 1;
		double sueldoFinal=0.0;

		a�osEnEmpresa=(int) ChronoUnit.YEARS.between(this.a�oAlta, LocalDate.now());
		sueldoFinal=sueldo+(a�osEnEmpresa*20);
		
		return sueldoFinal;
	}
	
	


	
	
	
}
