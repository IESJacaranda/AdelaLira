package ejercicio3B;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.of (2015,03,02);
		Fijo pepe = new Fijo("Pepe", 23, "568945H", 956.2, ld1);
		Temporal juan = new Temporal ("Juan", 53, "56584545S" ,600.43);
		Horas lidia = new Horas ("Lidia", 53, "56584545S" ,0);
		
		
		System.out.println(pepe.calculaSueldo());
		System.out.println(juan.calculaSueldo());
		System.out.println(lidia.calculaSueldo());
		
		
	}

}
