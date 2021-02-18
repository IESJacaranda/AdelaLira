package Repaso;


import java.util.Scanner;

public class mainRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo= new Rectangulo();
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ancho del rectangulo");
		rectangulo.setAncho(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Longitud del rectangulo");
		rectangulo.setLongitud(Double.parseDouble(teclado.nextLine()));
		

		
		System.out.println(rectangulo.darArea());
		System.out.println(rectangulo.darPerimetro());

	}


}
