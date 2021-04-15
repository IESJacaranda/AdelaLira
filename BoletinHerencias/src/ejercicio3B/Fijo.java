package ejercicio3B;

import java.time.Duration;
import java.time.LocalDate;

public class Fijo extends Empleado {

	private LocalDate añoAlta;

	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate añoAlta) {
		super(nombre, edad, NIF, sueldo);
		this.añoAlta=añoAlta;

	}

	@Override
	public double calculaSueldo() {
		int añosEnEmpresa = 1;

		añosEnEmpresa=((int)Duration.between(this.añoAlta, LocalDate.now()));
		
		return 0;
	}
	
	


	
	
	
}
