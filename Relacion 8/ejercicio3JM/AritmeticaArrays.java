package ejercicio3JM;

import java.util.Scanner;

public class AritmeticaArrays {
	
	public int [] contadorDigitos = new int [10];
	
	private double sumaTotal = 0.0;

	public AritmeticaArrays() {
		
	}
	
	// 0 1 2 3 4 5 6 7 8 9
	//27
	public void contarDigitos(String numero) {
		if (numero!=null && !numero.isBlank()) {
			int number = Integer.parseInt(numero.substring(numero.length()-1));
			contadorDigitos[number]=contadorDigitos[number]+1;
		}
	
	}
	
	
	public void interfaz() {
		Scanner teclado = new Scanner (System.in);
		
		int numero = -1;
		
		while (numero!=0) {
			System.out.println("Introduzca un número entre 1 y 1000:");
			numero=Integer.parseInt(teclado.nextLine());
			if(numero>0 && numero<1001) {
				sumaTotal+=numero;
				contarDigitos(String.valueOf(numero));
			}
		}
		//IMPRIMIMOS TODA LA INFORMACIÓN
		obtenerEstadisticas();
	}
	
	public void obtenerEstadisticas() {
		System.out.println("La media total de los números introducidos es: " + calcularMedia());
		System.out.println("La frecuencia de aparicion de cada digito es: " + printCounterList());
		System.out.println("El numero de digitos en el que han acabado mas numeros es el : " + getDigitMaxOcurrences());
		System.out.println("No ocurrencias: " + getNoOcurrences());
		
	}
	
	
	public double calcularMedia() {
		int totalNumeros=0;
		
		for (int i = 0; i < contadorDigitos.length; i++) {
			totalNumeros+=contadorDigitos[i];
		}
		return sumaTotal/totalNumeros;
	}
	
	
	public String getOcurrences () {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < contadorDigitos.length; i++) {
			sb.append("Ha habido " + contadorDigitos[i]+ " ocurrencias de numerosd terminados en: " + i + "\n");
		}
		return sb.toString();
	}
	
	public String getDigitMaxOcurrences() {
		
		int digitoMayor= contadorDigitos[0];
		int posicion = 0;
		
		for (int i = 0; i < contadorDigitos.length; i++) {
			if (contadorDigitos[i]>digitoMayor) {
				digitoMayor=contadorDigitos[i];
				posicion=i;
			}
		}
		
		return  posicion + " con un total de " + digitoMayor + " ocurrencias";
	}
	
	public String getNoOcurrences() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < contadorDigitos.length; i++) {
			if (contadorDigitos[i]==0) {
				sb.append("No se ha introducido ningun numero terminado en " + i + "\n");	
			}
		}
		return sb.toString();
	}
	
	
	public String printCounterList() {
		return ImprimirMatrices.printMatrix(contadorDigitos);
	}
	
	
	
	
}
