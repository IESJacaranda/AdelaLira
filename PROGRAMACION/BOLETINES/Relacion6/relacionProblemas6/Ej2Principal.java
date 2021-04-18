package relacionProblemas6;

import java.util.Scanner;

public class Ej2Principal {

	public static void main(String[] args) {
	
		int num;
		
		EjCuenta2 cuenta =new Ej2Cuenta2();
		
		System.out.println("Introduzca el saldo incial");
		Scanner teclado = new Scanner (System.in);
		cuenta.setSaldo(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Elija la opción deseada: 1. Hacer un reintegro, se pedirá la cantidad a retirar.\r\n"
				+ "2. Hacer un ingreso, se pedirá la cantidad a ingresar.\r\n"
				+ "3. Consultar el saldo y el número de reintegros e ingresos realizados.\r\n"
				+ "4. Finalizar las operaciones. Debe confirmar si realmente desea salir e\r\n"
				+ "informar del saldo al final de todas las operaciones");
		num=Integer.parseInt(teclado.nextLine());
		switch (num) {
		case 1:{
			System.out.println("Introduzca el reintegro");
			cuenta.setReintegro(Double.parseDouble(teclado.nextLine()));
			break;
		}
		case 2:{
			System.out.println("Introduzca el ingreso");
			cuenta.setIngreso(Double.parseDouble(teclado.nextLine()));
			break;
		}
		
		case 3: {
			System.out.println("Introduzca el ingreso");
			cuenta.setIngreso(Double.parseDouble(teclado.nextLine()));
			break;
		}
		
		case 4:{
			
		}
		
		
		
		}
	

	}

}
