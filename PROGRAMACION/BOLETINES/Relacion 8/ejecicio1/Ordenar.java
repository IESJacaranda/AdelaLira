package ejecicio1;

/**
 *  Realizar un programa que solicite diez números enteros y cuando se
	termine de introducir el último los muestre en el orden inverso al que se
	introdujeron
 * @author aalir
 *
 */



public class Ordenar {
	
	public static void main(String[] args) {
		int [] lista= {1,2,3,4,5,6,7,8,9,10};

		System.out.println(ImprimirMatrices.printMatrix(invertirListas(lista)));
	}


	public static int[] invertirListas(int [] lista) {
		int [] listaInversa = new int [lista.length];
		int aux = 9;
		
		for (int i = 0; i < lista.length; i++) {
				
			listaInversa[i]=lista[aux];
			aux--;
		}
		return listaInversa;
	}
}
