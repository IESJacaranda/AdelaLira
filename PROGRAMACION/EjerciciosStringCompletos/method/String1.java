package method;

import java.util.Scanner;

public class String1 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "";
		char caracter;
		int contador=0;
		System.out.println("Escribe una frase");
		cadena=teclado.nextLine();
		System.out.println("Introduce el caracter que desea encontrar");
		caracter=teclado.nextLine();
		arraycadena =cadena.toCharcadena();
		
		for (int i=0; i<cadena.length; i++) {
			caracter=cadena[i];
			contador++;
			}
		
		System.out.println(contador);
		
	}

}
