package ejercicio3B;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fijo extends Empleado {

	private LocalDate aņoAlta;

	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate aņoAlta) {
		super(nombre, edad, NIF, sueldo);
		this.aņoAlta=aņoAlta;

	}

	@Override
	public double calculaSueldo() {
		int aņosEnEmpresa = 1;
		double sueldoFinal=0.0;

		aņosEnEmpresa=(int) ChronoUnit.YEARS.between(this.aņoAlta, LocalDate.now());
		sueldoFinal=sueldo+(aņosEnEmpresa*20);
		
		return sueldoFinal;
	}
	
	


	
	
	
}
