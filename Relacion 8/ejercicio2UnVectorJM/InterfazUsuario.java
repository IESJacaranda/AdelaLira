package ejercicio2UnVectorJM;

import java.util.Scanner;

public class InterfazUsuario {

	public final static int MAX_ITERACIONES = 10;
	
	public static void desplazaNumeros() {
		
		Scanner teclado = new Scanner (System.in);
		int [] vector = new int [MAX_ITERACIONES];
		
		
		for (int i = 0; i < MAX_ITERACIONES; i++) {
			System.out.println("Introduce el numero en la posicion ("+ (i+1)+"/"+MAX_ITERACIONES + ")");
			vector[i]=teclado.nextInt();
		}
		System.out.println(ImprimirMatrices.printMatrix(vector));
		System.out.println(ImprimirMatrices.printMatrix(DesplazarVector.desplazarVectorDerecha(vector)));

		
	}

}