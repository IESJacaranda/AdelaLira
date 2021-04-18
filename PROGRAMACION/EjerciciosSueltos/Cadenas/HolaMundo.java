package Ejemplos;
import java.util.Scanner;

public class HolaMundo {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Dar valor a las variables
		int x=23, y=3;
		// TODO Auto-generated method stub
		
		//Leer caracteres
		char c;
		
		//Leer numero
		int num;
		
		//Leer en Double
		double nume;
		
		//Hacer string
		String nombre;
		
		//Imprimir un string (Cadena de texto)
		System.out.println("Hola mundo. El valor de x es " + x + " e y tiene un valor de " + y);
		
		// Leer caracteres
		System.out.println("Introduce un caracter");
		c = teclado.nextLine().charAt(0);
		System.out.println("El caracter leido es " + c);
		
		//Hacer string
		nombre=teclado.nextLine();
		System.out.println("Introduce tu nombre");/*Esta linea deberia ir arriba*/
		System.out.println("Te llamas " + nombre);
		
		//Leer numero
		System.out.println("Introduce un número");/*Esta linea deberia ir arriba*/
		num=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduciste el numero " + num);
		
		//Leer en Double
		System.out.println("Introduce un número");/*Esta linea deberia ir arriba*/
		nume=Double.parseDouble(teclado.nextLine());
		System.out.println("Introduciste el numero " + nume);
	}

}
