package generadoresb;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws EnumeradoException {
		int opc;
		String localidad;
		LocalDate fecha;
		Double potencia=0.0;
		int numeroPaneles;
		int metrosCuadrados;
		int numeroAspas;
		Empresa empresa = new Empresa("Deportes S.L.");
		TipoGenerador tipo;

		
		do {
			opc = leerEntero("Introduzca la opción deseada");
			menu();
			switch (opc) {
			case 1:
				localidad=leerCadena("Introduce la localidad");
				fecha=obtenerFecha();
				potencia=leerReal("Introduce la potencia");
				numeroPaneles=leerEntero("Introduce el numero de paneles");
				metrosCuadrados=leerEntero("Introduce el numero de metros cuadrados");
				System.out.println("Introduce el tipo de generador");
				String tipito=teclado.nextLine();
				try {
					tipo = TipoGenerador.valueOf(tipito.toUpperCase());
				}
				catch (Exception e){
					throw new EnumeradoException();
				}
				
				
				empresa.addGeneradorSolar(new GeneradorSolar(fecha, localidad, potencia, tipo, numeroPaneles, metrosCuadrados));
				System.out.println(empresa.listarGeneradoresSolares());
				
				break;
			case 2:
				localidad=leerCadena("Introduce la localidad");
				fecha=obtenerFecha();
				potencia=leerReal("Introduce la potencia");
				numeroAspas=leerEntero("Introduce el numero de paneles");

				empresa.addGeneradorEolico(new GeneradorEolico(fecha, localidad, potencia, numeroAspas));
				empresa.listarGeneradoresEolicos();
				break;
			case 3:
				System.out.println(empresa.generadoresOrdenadosPorFecha());
				break;
			case 4:
				System.out.println(empresa.generadoresOrdenadosPorLocalidad());
				break;
			case 5:
				System.out.println("Generador Eolicos" + empresa.listarGeneradoresEolicos());
				System.out.println("Generadores Solares" + empresa.listarGeneradoresSolares());

				break;
			case 6:
				System.out.println("Generador Eolicos" + empresa.listarGeneradoresEolicos());
				System.out.println("Generadores Solares" + empresa.listarGeneradoresSolares());
				int codigoEmpresa = leerEntero("Introduce el codigo del generador que quieras eliminar");
				empresa.removeGenerador(codigoEmpresa);
				System.out.println("El generador ha sido eliminado, estos son los que siguen activos: ");
				System.out.println("Generador Eolicos" + empresa.listarGeneradoresEolicos());
				System.out.println("Generadores Solares" + empresa.listarGeneradoresSolares());
				break;
			case 7:
				System.out.println(empresa.totalEnergia());
				
				break;
			case 8:
				String localidadBuscada = leerCadena("Introduce la localidad donde desea saber si existe un generador");
				System.out.println(empresa.existeGeneradorLocalidad(localidadBuscada));
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
		int day = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca mes: ");
		int month = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca año: ");
		int year = Integer.parseInt(teclado.nextLine());
		
		return LocalDate.of(year, month, day);
	}

}