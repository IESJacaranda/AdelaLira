package method;

import java.util.Scanner;

public class Ejercicio {
	
	public static final Double PI = 3.14;
	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
				
	int a;
	int b;
	int c;
	double r;
	int hora1;
	int min1;
	int seg1;
	int hora2;
	int min2;
	int seg2;
	
	
	System.out.println("Introduce el primer número");/*Esta linea deberia ir arriba*/
	a=teclado.nextInt();
	
	System.out.println("Introduce el segundo número");/*Esta linea deberia ir arriba*/
	b=teclado.nextInt();
	
	System.out.println("Introduce el tercer número");/*Esta linea deberia ir arriba*/
	c=teclado.nextInt();
	
	System.out.println("Introduce el radio");/*Esta linea deberia ir arriba*/
	r=teclado.nextInt();
	
	System.out.println("Introduce primera hora");/*Esta linea deberia ir arriba*/
	hora1=teclado.nextInt();
	System.out.println("Introduce primeros minutos");/*Esta linea deberia ir arriba*/
	min1=teclado.nextInt();
	System.out.println("Introduce priemros segundos");/*Esta linea deberia ir arriba*/
	seg1=teclado.nextInt();
	System.out.println("Introduce el segunda hora");/*Esta linea deberia ir arriba*/
	hora2=teclado.nextInt();
	System.out.println("Introduce el segundos minutos");/*Esta linea deberia ir arriba*/
	min2=teclado.nextInt();
	System.out.println("Introduce el segundos segundos");/*Esta linea deberia ir arriba*/
	seg2=teclado.nextInt();
	
	
	System.out.println("Introduciste los numeros " + a + b +c);

	System.out.println("La función tiene " + numeroSolucionesEcuacionSegundoGrado(a ,b, c) + " soluciones.");
	
	System.out.println("La solución de la suma es " + solucionSumaEcuacionSegundoGrado(a ,b, c));
	
	System.out.println("La solución de la suma es " + solucionRestaEcuacionSegundoGrado(a ,b, c));
	
	System.out.println("El area del círculo es " + areaCirculo(r));
	
	System.out.println("El longitud del círculo es " + longitudCirculo(r));
	
	System.out.println("¿" + a + "  y " + b + "es múltiplo?:"+ esMultiplo(a,b));
	
	System.out.println("Es mayor: "+ horaMayor (hora1, min1, seg1, hora2, min2, seg2));
	
	
	
	
	
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
			return ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
		}
		
		else if ((b*b-4*a*c)==0){
			return ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
		} 
		
		else {
			return (double)(-1000);
		}
		
	}
	
	
	
	public static Double solucionRestaEcuacionSegundoGrado(int a, int b, int c) {
		
		if ((b*b-4*a*c)>0) {
			return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		}
		
		else if ((b*b-4*a*c)==0){
			return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		} 
		
		else {
			return (double)(-1000);
		}
	}	
	
	public static Double areaCirculo(Double r) {
	
		if (r>=0) {
			return (PI*(r*r));
		}
		return (PI*(r*r));
	}
	
	public static Double longitudCirculo(Double r) {
		if (r>0) {
			return (2*PI*r);
		}
		return (2*PI*r);
	}
	
	public static boolean esMultiplo(int a, int b) {
		if (a==0 || b==0) {
			return (false);
		}
		
		else if (a%b==0) {
			return (true);
		}
		
		return (false);
	}
	
	public static int horaMayor(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
				
		if (hora1>hora2) {
			return (hora1);
		}
		
		else if (hora2>hora1) {
			return (hora2);
		}
		
		else if (hora2==hora1);{
			if (min1>min2) {
				return (hora1);
			}
			
			else if (min2>min1) {
				return (hora2);
			}
			
			else if (min2==min1) {
				if (seg1>seg2) {
					return (hora1);
				}
				
				else if (seg1<seg2) {
					return (hora2);
				}
				
				else {
					return ();
				}
			}
		}
			
		
	}
	
	public static int segundosEntre(int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
				
		
	}
	
	public static int maximoComunDivisor(int a, int b) {
		
	}
	
	public static int minimoComunMultiplo(int a, int b) {
		
	}
	
	public static String binario(int num) {
		double resultado;
		
		while (num>1)
		{	if (num%2==0) {
				resultado=0;
			}
			
			else if (num%2!=0) {
				resultado=1;
			}
		
		
	}
	
	public static int decimal(String num) {
		
	}
}
