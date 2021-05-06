package ejercicio5b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	
	 static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {


		Profesor ciencias = new Profesor("Jaime",48);
		Alumno alumno = new Alumno ("Guillermo", 19);
		
		LocalDateTime fecha = obtenerFecha();
		
		

	}
	
	
	private static LocalDateTime obtenerFecha() {

		System.out.println("Introduzca la fecha paso a paso. Introduzca dia: ");
		int day = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca mes: ");
		int month = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca año: ");
		int year = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca hora: ");
		int hour = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca minuto: ");
		int min = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca segundo: ");
		int seg = Integer.parseInt(teclado.nextLine());
		
		return LocalDateTime.of(year, month, day, hour, min, seg);
	}


}
