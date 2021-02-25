package relacionProblemas6;

import java.util.Scanner;

public class main {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int longitud;
		int ancho;
		Rectangulo rectanguloUno= new Rectangulo();
		
		System.out.println("Selecciona ancho");
		ancho=teclado.nextInt();
		rectanguloUno.setAncho(ancho);
		System.out.println("Selecciona largo");
		longitud=teclado.nextInt();
		rectanguloUno.setLongitud(longitud);
	}
	
	

}
