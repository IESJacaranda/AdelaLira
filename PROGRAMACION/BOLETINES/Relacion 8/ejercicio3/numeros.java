package ejercicio3;

import java.util.Scanner;

public class numeros {

	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("La media es " + pedirNumeros());

	}
	
	public static int pedirNumeros() {
		
		int media = 0;
		int almacen = 0;
		int respuesta = 1;
		int contador=0;
		
		while(respuesta!=2) {
			System.out.println("Introduce un número");
			almacen=teclado.nextInt();
			if (almacen>0 && almacen<1001) {
				media=media+almacen;
				contador++;
			}
			else {
				System.out.println("Numero incorrecto");
			}
			System.out.println("¿Desea introducir mas numeros? (Responda S si es un si, y N si es un no)");
			respuesta=teclado.nextInt();

		}
				
		return media/contador;
	}
	
	public static int [] pedirNumerosLista() {
		
		int [] listaNumeros = null;
		int respuesta=1;
		int numero = 0;
		
		while(respuesta!=2) {
			System.out.println("Introduce un número");
			numero=teclado.nextInt();
		
			

		}
		
		
		
		return null;
	}
	
	

}
