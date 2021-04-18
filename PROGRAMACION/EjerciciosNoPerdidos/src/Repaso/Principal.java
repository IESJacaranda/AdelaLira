package Repaso;

import java.util.Scanner;

public class Principal {
	
	public final static String MENU="1. Hacer un reintegro, se pedirá la cantidad a retirar. \n 2. Hacer un ingreso, se pedirá la cantidad a ingresar. \n 3. Consultar el saldo y el número de reintegros e ingresos realizados. \n 4. Finalizar las operaciones. Debe confirmar si realmente desea salir e informar del saldo al final de todas las operaciones.";

	public static void main(String[] args) {
		
		Cuenta Adela = new Cuenta(50.0);
		Scanner teclado = new Scanner (System.in);
		double cantidad;
		int opcion=0;
		
		while (opcion!=4 && opcion<4) {
			mostrarMenu();
			opcion=Integer.parseInt(teclado.nextLine());
			switch (opcion) {
				case 1:
					System.out.println("Cantidad a reintegrar");
					cantidad = Double.parseDouble(teclado.nextLine());
					Adela.reintegro(cantidad);
					break;
				case 2:
					System.out.println("Cantidad a ingresar");
					cantidad = Double.parseDouble(teclado.nextLine());
					Adela.ingreso(cantidad);
					break;
				case 3:
					System.out.println(Adela.getStatus());
					
					break;
				case 4:
					System.out.println("Apagando");
					break;
				default:
					break;	
			}	
		}	
		teclado.close();
	}

	
	public static void mostrarMenu () {
		System.out.println(MENU);
	}
}
