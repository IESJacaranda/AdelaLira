package ejercicio3;

import java.util.Scanner;

public class numeros {

	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		pedirNumeros();

	}
	
	public static int pedirNumeros() {
		
		int media = 0;
		int almacen = 0;
		String respuesta = "S";
		
		while(respuesta=="S") {
			System.out.println("Introduce un número");
			almacen=teclado.nextInt();
			if (almacen>0 && almacen<1001) {
				media=media+almacen;
			}
			else {
				System.out.println("Numero incorrecto");
			}
			System.out.println("¿Desea introducir mas numeros? (Responda S si es un si, y N si es un no)");
			respuesta=teclado.nextLine();

		}
				
		return media;
	}
	
	

}
