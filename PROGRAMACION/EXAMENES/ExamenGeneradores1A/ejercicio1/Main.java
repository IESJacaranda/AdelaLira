package ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Empresa empresa = new Empresa ("Generadores Energia S.L.");
		
		int opc;
		do {
			menu();
			opc = leerEntero("Introduzca la opción deseada");
			switch (opc) {
			case 1:

				String localidad = leerCadena("Introduzca localidad");
				Double potencia = leerReal("Introduzca potencia");
				LocalDate fechaCreacion = LocalDate.now();
				String tipo = leerCadena("Introduzca el tipo. Los posibles valores son FOTOVOLCAICO, TERMICO, HIBRIDO");
				int paneles = leerEntero("Introduzca numero de aspas");
				Double metros = leerReal("Introduzca metros cuadrados");
				
				
				empresa.addGeneradorSolar(new GeneradorSolar(0,fechaCreacion,localidad, potencia, paneles,metros,tipo));

				empresa.listarGeneradoresSolares(); //NO LISTA ¿PORQUE?
				
				break;
			case 2:
				String localidada = leerCadena("Introduzca localidad");
				Double potenciaa = leerReal("Introduzca potencia");
				int aspas = leerEntero("Introduzca el nuemro de aspas");
				LocalDate fechaCreaciona = LocalDate.now();

				empresa.addGeneradorEolico(new GeneradorEolico(0,fechaCreaciona,localidada, potenciaa, aspas)); 
				
				empresa.mostrarGeneradoresEmpresa();
				break;
			case 3:
				System.out.println(empresa.listarInstalacionesEnFecha());//COMPROBAR SI FUNCIONA CORRECTO		
				break;
			case 4:
				System.out.println(empresa.mostrarGeneradorPorLocalidad()); //NO TERMINA DE ORDENAR CORRECTAMENTE
				break;
			case 5:
				// TODO
				break;
			case 6:
				empresa.mostrarGeneradoresEmpresa();
				int codigo = leerEntero ("Introduce el codigo del generador que desea eliminar");
				empresa.borrarGenerador(codigo);
				
				System.out.println("El generador con codigo " + codigo + " ha sido eliminado satisfactoriamente");
				empresa.mostrarGeneradoresEmpresa();
				break;
			case 7:
				System.out.println(empresa.energiaEmpresa());
				break;
			case 8:
				String localidadDeseada = leerCadena ("Introduca la localidad donde desea saber si hay algun tipo de generador");
				System.out.println(empresa.existeGeneradorLocalidad(localidadDeseada)); //DA FALSE AUNQUE SEA TRUE
				
				break;
			case 9:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
			
		}while (opc !=9);
	}
	
	public static void menu() {
		System.out.println("1.- Añadir generador solar\n"+
							"2.-Añadir generador eólico\n"+
							"3.-Mostrar generadores por fecha\n"+
							"4.-Mostrar generadores por localidad\n"+
							"5.-Mostrar generadores eólicos\n"+
							"6.-Borrar generador\n"+
							"7.-Total energía\n"+
							"8.-¿Existe generador en Localidad? \n"+
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
		int day = Integer.parseInt(teclado.next());
		
		System.out.println("Introduzca mes: ");
		int month = Integer.parseInt(teclado.next());
		
		System.out.println("Introduzca año: ");
		int year = Integer.parseInt(teclado.next());
		
		return LocalDate.of(year, month, day);
	}

}
