package Galaxia;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Personaje 1");
		Personajes P1 =new Personajes("Pepe",20.2,"Lluvia de albondigas",1.53,"Chimpance", 56.2);
		
		System.out.println("Personaje 2");
		Personajes P2 =new Personajes("Pepa",35.2,"Lluvia de albondigas",1.63,"Chimpance", 72.2);
		
		System.out.println("Personaje 3");
		Personajes P3 =new Personajes("Antonio",60.2,"Lluvia de albondigas",2.53,"Chimpance", 86.2);
		
		System.out.println("Pelicula");
		Peliculas pelicula = new Peliculas ("Lluvia de albondigas",2008, P1,P2,P3);
		
		
		System.out.println(pelicula.toString());
		System.out.println(pelicula.getP1().toString());
		System.out.println(pelicula.getP2().toString());
		System.out.println(pelicula.getP3().toString());
		
		teclado.close();
	}

}
