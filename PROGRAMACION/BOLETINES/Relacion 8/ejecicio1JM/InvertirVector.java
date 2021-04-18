package ejecicio1JM;

/**
 * EJERCICIO 1 BOLETIN 8
 * Invierte el sentido de los vectores, recorriendo la lista mediante un for e invirtiendo su posición.
 * @author aalir
 *
 */
public class InvertirVector {

	public static void main(String[] args) {
		
		int [] vector= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(ImprimirMatrices.printMatrix(vector));
		System.out.println(ImprimirMatrices.printMatrix(invertirVector(vector)));
	}
	
	/**
	 * Invierte el orden de un vector que recibe como argumento
	 * @param vector vector de enteros original
	 * @return vector de enteros igual que el original, pero con el orden invertido
	 */
	public static int [] invertirVector ( int [] vector) {
		
		int [] vectorInvertido = new int [vector.length];
		
		for (int i = 0; i < vector.length; i++) {
			vectorInvertido[vector.length-1-i]=vector[i];
			//cuando ponemos vector.length nos cuenta hasta la posición 10 al haber 10 numeros, pero realmente nuestro vector llega desde 
			//la posición 0 a la posición 9, por esto tenemos que poner vector.length-1, asi aunque llegue hasta la posición 10 le restamos
			//1 y llega a la posición 9 y no sale de rango. Por ultimo el -i nos hace que vaya de derecha a izquierda del vector.
		}
		
		
		return vectorInvertido;
	}

}
