package ejercicio3B;

import java.time.Duration;
import java.time.LocalDate;

public class Fijo extends Empleado {

	private LocalDate a�oAlta;

	public Fijo(String nombre, int edad, String NIF, double sueldo, LocalDate a�oAlta) {
		super(nombre, edad, NIF, sueldo);
		this.a�oAlta=a�oAlta;

	}

	@Override
	public double calculaSueldo() {
		int a�osEnEmpresa = 1;

		a�osEnEmpresa=((int)Duration.between(this.a�oAlta, LocalDate.now()));
		
		return 0;
	}
	
	


	
	
	
}
