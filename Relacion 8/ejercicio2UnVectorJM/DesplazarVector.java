package ejercicio2UnVectorJM;

import ejercicio2UnVector.ImprimirMatrices;

public class DesplazarVector {

	public static void main(String[] args) {
		
		int [] vector= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("DESPLAZAR A LA DERECHA");
		System.out.println(ImprimirMatrices.printMatrix(desplazarVectorDerecha (vector)));
		System.out.println("-----------------------------------------------------------");
		System.out.println("DESPLAZAR A LA IZQUIERDA");
		System.out.println(ImprimirMatrices.printMatrix(desplazarVectorIzquierda ()));
		InterfazUsuario.desplazaNumeros();
	}

	
	public static int [] desplazarVectorDerecha ( int [] vector) {
		
		int ultimoValor=vector[vector.length-1];
		for (int i = vector.length-1; i > 0; i--) {
			vector[i]=vector[i-1];
		}
		vector[0]=ultimoValor;
		return vector;
	}
	
	
	public static int [] desplazarVectorIzquierda () {
		
		int [] vector2= {1,2,3,4,5,6,7,8,9,10};
		int primerValor=vector2[0];
		for (int i =0; i < vector2.length-1; i++) {
			vector2[i]=vector2[i+1];
		}
		vector2[vector2.length-1]=primerValor;
		return vector2;
	}
	
	
}
