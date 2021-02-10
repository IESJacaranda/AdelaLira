package method;

import java.util.*;

public class Ejercicio {
	
	public static final Double PI = 3.14;
	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
				
	int a;
	int b;
	int c;
	
	
	System.out.println("Introduce el primer número");/*Esta linea deberia ir arriba*/
	a=teclado.nextInt();
	
	System.out.println("Introduce el segundo número");/*Esta linea deberia ir arriba*/
	b=teclado.nextInt();
	
	System.out.println("Introduce el tercer número");/*Esta linea deberia ir arriba*/
	c=teclado.nextInt();
	System.out.println("Introduciste los numeros " + a + b +c);

	System.out.println("La función tiene " + numeroSolucionesEcuacionSegundoGrado(a ,b, c) + " soluciones.");
	
	System.out.println("La solución de la suma es " + solucionSumaEcuacionSegundoGrado(a ,b, c));
	
	}
	
	public static int numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {
		
		if (a<0 || b<0 || c<0){
			return (-1);
		}
		
		if ((b*b-4*a*c)==0) {
			return (1);
		}
		
		else if ((b*b-4*a*c)>0) {
			return (2);
		}
		
		return (-1);
	}
	
	public static Double solucionSumaEcuacionSegundoGrado(int a, int b, int c) {
		
		if ((b*b-4*a*c)>0) {
			return (-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
		}
		
		else if ((b*b-4*a*c)==0){
			return (-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
		} 
		
		else {
			return (double)(-1000);
		}
		
	}
	
	
	
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
		
	}	
	
	public static Double areaCirculo(Double r) {
		
	}
	
	public static Double longitudCirculo(Double r) {
		
	}
	
	public static boolean esMultiplo(int a, int b) {
		
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
				
		
	}
	
	public static int maximoComunDivisor(int a, int b) {
		
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		
	}
	
	public static String binario(int num) {
		
	}
	
	public static int decimal(String num) {
		
	}
}
