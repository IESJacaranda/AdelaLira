package generadoresB;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws NoGeneradorException {
		
		Empresa empresa = new Empresa("Herreria Gonzalez");
		
		LocalDate fecha = LocalDate.now();
		String localidad = "";
		double potencia=0;
		int numeroAspas=0;
		int numeroPaneles=0;
		int metrosCuadrados=0;
		String tipo="";
		
		
		int op = 0;
		do {
			menu();
			op=Integer.parseInt(teclado.nextLine());
			switch(op) {
			case 1:
				fecha=obtenerFecha();
				localidad=leerCadena("Introduce la localidad perteneciente");
				potencia=leerReal("Introduce la potencia");
				numeroPaneles=leerEntero("Introduce el numero de paneles");
				metrosCuadrados=leerEntero("Introduce metros cuadrados por panel");
				tipo=leerCadena("Introduce el tipo del generador. Debe ser FOTOVOLTAICOS, TERMICOS O HIBRIDOS");
				empresa.addGeneradorSolar(new GeneradorSolar(fecha, localidad, potencia, numeroPaneles, metrosCuadrados, tipo));
				System.out.println();
				break;
			case 2:
				fecha=obtenerFecha();
				localidad=leerCadena("Introduce la localidad perteneciente");
				potencia=leerReal("Introduce la potencia");
				numeroAspas=leerEntero("Introduce el numero de aspas");
				empresa.addGeneradorEolico(new GeneradorEolico(fecha, localidad, potencia, numeroAspas));
				System.out.println();
				break;
			case 3:
				System.out.println(empresa.ordenarPorFecha());
				break;
			case 4:
				System.out.println(empresa.ordenarPorLocalidad());
				break;
			case 5:
				System.out.println(empresa.listarGeneradoresEolicos());
				break;
			case 6:
				System.out.println(empresa.listarGeneradores());
				int codigo = leerEntero("Introduce el codigo del generador que desea eliminar");
				empresa.eliminarGenerador(codigo);
				System.out.println(empresa.listarGeneradores());
				
				break;
			case 7:
				System.out.println(empresa.totalEnergiaSuministrada());
				break;
			case 8:
				localidad=leerCadena("Introduce la localidad donde desea buscar");
				System.out.println(empresa.existeGenerador(localidad));
				break;
			case 9:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Ha ocurrido un error");
				break;
			}
			
			
		}while(op<=9);
		
		
		

	}

	public static void menu() {
		System.out.println("1.- A�adir generador solar\n"+
							"2.-A�adir generador e�lico\n"+
							"3.-Mostrar generadores por fecha\n"+
							"4.-Mostrar generadores por localidad\n"+
							"5.-Mostrar generadores e�licos\n"+
							"6.-Borrar generador\n"+
							"7.-Total energ�a\n"+
							"8.-�Existe generador en Localidad? \n"+
							"9.-Salir\n"
				);
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
	
	
	private static LocalDate obtenerFecha() {

		System.out.println("Introduzca la fecha paso a paso. Introduzca dia: ");
		int day = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca mes: ");
		int month = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca a�o: ");
		int year = Integer.parseInt(teclado.nextLine());
		
		return LocalDate.of(year, month, day);
	}
	
	
}
