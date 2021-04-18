package ejercicio3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//String nombre, int edad, String NIF, double sueldo, LocalDate fechaAlta
		LocalDate ld1 = LocalDate.of(2018,03,23);
		Fijo fijo = new Fijo("Adela", 23, "4569884", 800.65, ld1);
		System.out.println(fijo.calcularSueldo());
		
		
	}

}
