package empresa;

import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		int opc;
		Departamento d = new Departamento("Contabilidad");
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opci�n deseada");
			switch (opc) {
			case 1:{
				String dni = leerCadena("Introduzca dni");
				String nombre = leerCadena("Introduzca el nombre");
				String tipo = leerCadena("Introduzca el tipo. Los posibles valores son ADMINISTRATIVO, OPERARIO, CONTABLE");
				d.a�adirEmpleados(); //CON SueldoEmpleadosBase.tipo QUIERO MANDARLE EL VALOR DE TIPO 
																		// Y COMPROBARLO PARA QUE ME DE EL SUELDO QUE ES LO QUE TIENE
																		//  EL CONSTRUCTOR DE EMPLEADO
				d.listarEmpleados(); 
		
				// TODO
			}
				break;
			case 2:
				// TODO
				break;
			case 3:
				System.out.println("El total del sueldo es " + d.obtenerSueldo());
				break;
			case 4:
				System.out.println(d.toString());
				break;
			case 5:
				System.out.println(d.toStringSueldo());
				break;
			case 6:
				System.out.println("Saliendo");
				break;

			default:
				System.out.println("Opci�n no v�lida");
				break;
			}
		}while (opc!=6);
	}


	// Muestra el men�
	public static void mostrarMenu() {
		System.out.println("1.- anadir empleado\n"+
							"2.- anadir jefe\n"+
							"3.- obtener total sueldo departamento\n"+
							"4.- Mostrar departamento ordenado por nombre\n"+
							"5.- Mostrar departamento ordenado por sueldo\n"+
							"6.- Salir\n");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	
	public static double leerReal(String msg) {
		System.out.println(msg);
		return Double.parseDouble(teclado.nextLine());
	}
	
}
