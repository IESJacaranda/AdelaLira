package ejercicio2;

import java.util.*;

public class Desplazar {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println( crearMatriz());

	}
	

	public static String crearMatriz () {
		int aux=1;
		int [] lista = new int [10];
		
		int [] desplazada = new int [lista.length];
		int movimiento=1;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el número en la posición ("+aux+"/10) ");
			lista[i]=teclado.nextInt();
			aux++;	
		}
		
		for (int i = 0; i < lista.length-1; i++) {
			desplazada[movimiento]=lista[i];
			movimiento++;
		}
		
		desplazada[0]=lista[9];
		
		System.out.println(ImprimirMatrices.printMatrix(desplazada));
		
		return "La lista introducida ha sido" + ImprimirMatrices.printMatrix(lista) + " y la lista desplazada es " 
		+ ImprimirMatrices.printMatrix(desplazada);
	}



}
