package ejercicio2UnVector;

import java.util.*;

public class Dezplazar {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
	
		int [] lista = new int [10];
		
		System.out.println(ImprimirMatrices.printMatrix(crearMatriz(lista)));
		System.out.println(ImprimirMatrices.printMatrix(desplazarMatriz(lista)));
		
	}

	public static int[] crearMatriz (int [] lista) {
		int aux=1;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el número en la posición ("+aux+"/10) ");
			lista[i]=teclado.nextInt();
			aux++;	
		}
		
		return lista;
	}
	
	
	public static int [] desplazarMatriz(int [] lista) {
		
		int movimiento=1;
		
		lista[0]=lista[9];
		
		while (movimiento<9) {
			for (int i = 1; i < lista.length-1; i++) {
				lista[lista.length]=lista[i];
				movimiento++;
			}
		}
		
		
		
		
		return lista;
	}
}
