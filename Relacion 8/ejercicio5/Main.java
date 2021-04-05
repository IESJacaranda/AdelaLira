package ejercicio5;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Cartas cartas = new Cartas();
		int numero=0;
		int jugadores=0;
		
		System.out.println("¿Cuantos jugadores tendra la partida?");
		jugadores=teclado.nextInt();
		System.out.println("Introduce el numero de cartas que desea obtener");
		numero=teclado.nextInt();
		cartas.repartirCartas(numero, jugadores);

	}

}
