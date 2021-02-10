package relacion6JM;

import java.util.Scanner;

public class Principal {
	
	public final static String MENU="1. Hacer un reintegro, se pedirá la cantidad a retirar. \n 2. Hacer un ingreso, se pedirá la cantidad a ingresar. \n 3. Consultar el saldo y el número de reintegros e ingresos realizados. \n 4. Finalizar las operaciones. Debe confirmar si realmente desea salir e informar del saldo al final de todas las operaciones.";

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta ();

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean finalizar = false;
		
		while (finalizar) {
			mostrarMenu();
			int opcion = Integer.parseInt(teclado.nextLine());
			
			switch (opcion) {
			case 1:
				try {
					System.out.println("¿Que cantidad quiere retirar?");
					double cantidadARetirar = Double.parseDouble(teclado.nextLine());
					cuenta.hacerReintegro(cantidadARetirar);
				}
				catch (Exception e) {
					System.out.println("Se ha producido una excepción");
				}
				break;
			case 2:
				try {
					System.out.println("¿Que cantidad quiere Ingresar?");
					double cantidadAIngresar = Double.parseDouble(teclado.nextLine());
					cuenta.hacerIngreso(cantidadAIngresar);
				}
				catch (Exception e) {
					System.out.println("Se ha producido una excepción");
				}
				break;
			case 3:
				System.out.println(cuenta.getStatus());
				break;
			case 4:
				System.out.println(cuenta.getSaldoFinal());
				System.out.println("¿Quiere finalizar? (y/n)");
				finalizar = (teclado.nextLine()=="y");
				break;
			default:
				break;
			
			}
		}
		
	}
	
	private static void mostrarMenu () {
		System.out.println(MENU);
	}
}
