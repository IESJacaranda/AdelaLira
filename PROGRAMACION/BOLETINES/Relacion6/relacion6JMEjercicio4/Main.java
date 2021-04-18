package relacion6JMEjercicio4;

import java.util.Scanner;

public class Main {
	
	public final static String MENU="1. Sumar complejos: Debe solicitar dos números complejos y mostrar el resultado de la suma\n" + 
	        "2. Restar complejos: Debe solicitar dos número complejos y mostrar el resultado de la resta.\n" + 
	        "3. Compara si los numeros son iguales.\n" + 
	        "4. Salir.\n";

	public static void main(String[] args) {	
		gestionarInterfaz();
	}
	
	static Scanner teclado = new Scanner(System.in); //Se pone fuera con static y asi podemos usarla para todos los metodos
	
	public static void gestionarInterfaz() {
		
		int opcion = 0;
		
		while (opcion<4) {
			try {
				mostrarMenu(); //Nombre del metodo que nos muestra el menu
				opcion=Integer.parseInt(teclado.nextLine());
				
				switch (opcion) {
				case 1:
					Complejo c1 =pedirNumeroComplejo();
					Complejo c2= pedirNumeroComplejo();
					System.out.println(c1.suma(c2));					
					break;
				case 2:
					c1 =pedirNumeroComplejo();
					c2= pedirNumeroComplejo();
					System.out.println(c1.resta(c2));					
					break;
				case 3:
					c1 =pedirNumeroComplejo();
					c2= pedirNumeroComplejo();
					if(c1.equals(c2)) {
						System.out.println("Los numeros son iguales");
					}
					else {
						System.out.println("Los numeros no son iguales");
					}
					break;				
				case 4:
					System.out.println("Apagando");
					break;				
				default:
					break;
				}
			}	
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
		
	public static Complejo pedirNumeroComplejo() throws Exception { //pide los numeros
		Complejo numero =null;
		
		while (numero==null) { //modificar para que solo pida el valor una vez si el otro es correcto
			try { //nos repite la pregunta si hubiera algun fallo
				
				System.out.println("Introduce la parte real del numero complejo");
				double real = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Introduce la parte imaginaria del numero complejo");
				double imaginaria = Double.parseDouble(teclado.nextLine());
			
				numero = new Complejo (real, imaginaria);

			}
			catch (Exception ex){ //si ocurriera el fallo daria este mensaje y se volveria al try
				System.out.println("El valor introducido no se corresponde con un número válido");
			}
		}
		

		return numero;		
	}
		

	public static void mostrarMenu() { //Muestra el menu
		System.out.println(MENU);
	}
}
