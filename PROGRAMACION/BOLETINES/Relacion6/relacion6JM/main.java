package relacion6JM;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo =new Rectangulo (3,5);
		
		
		System.out.println("Introduzca la longitud");
		Scanner teclado = new Scanner (System.in);
		rectangulo.setLongitud(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Introduzca la ancho");
		rectangulo.setAncho(Double.parseDouble(teclado.nextLine()));
		
		System.out.println(rectangulo.getArea());
		System.out.println(rectangulo.getPerimetro());
	}
}
