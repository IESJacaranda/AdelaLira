package examen;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) throws EnumeradoException {

		Empresa empresa = new Empresa();
		
		String nombre = " ";
		String ciudad = " ";
		String tipito = " ";
		String cliente = " ";
		String localidad = " ";
		String decripcion = " ";
		String departamento = " ";
		TipoPrioridad tipo;
		String descripcion = " ";
		LocalDate fechaAlta;
		int opc;

		do {
			menu();
			opc = leerEntero("Introduzca la opción deseada");
			
			switch (opc) {
			case 1:
				decripcion=leerCadena("Introduce la descripcion");
				departamento=leerCadena("Introduce la departamento");
				fechaAlta=LocalDate.now();
				
				System.out.println("Introduce el tipo de prioridad");
				tipito=teclado.nextLine();
				try {
					tipo = TipoPrioridad.valueOf(tipito.toUpperCase());
				}
				catch (Exception e){
					throw new EnumeradoException();
				}
				
				
				empresa.addTareaEmpresa(new TareaEmpresa(fechaAlta, descripcion, departamento, tipo));

				break;
			case 2:
				decripcion=leerCadena("Introduce la descripcion");
				cliente=leerCadena("Introduce la cliente");
				nombre=leerCadena("Introduce la nombre");
				ciudad=leerCadena("Introduce la ciudad");
				fechaAlta=LocalDate.now();
				
				System.out.println("Introduce el tipo de prioridad");
				tipito=teclado.nextLine();
				try {
					tipo = TipoPrioridad.valueOf(tipito.toUpperCase());
				}
				catch (Exception e){
					throw new EnumeradoException();
				}
				empresa.addTareaCliente(new TareaCliente(fechaAlta, descripcion, nombre, ciudad, tipo));
				break;
			case 3:
				System.out.println("Las tareas que estan pendientes por fecha de creación son ");
				System.out.println(empresa.mostratTareas());
				break;
			case 4:
				//ENTIENDO QUE ES POR VA POR AÑOS, LOS MAS PEQUEÑOS ANTES Y LUEGO MAS GRANDES
				System.out.println("Las tareas que estan pendientes por priodidad son ");
				System.out.println(empresa.mostrarTareasPrioridad());
				break;
			case 5:
				System.out.println("El numero de tareas pendientes es: ");
				System.out.println(empresa.numTareasPendientes());

				break;
			case 6:
				System.out.println("Introduzca los datos solicitados para resolver la tarea: ");
				decripcion=leerCadena("Introduce la descripcion");
				fechaAlta=obtenerFecha();
				LocalDate fechaSolucion=LocalDate.now();
				empresa.resolverTarea(descripcion, fechaAlta, fechaSolucion);
				break;
			case 7:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
			
		}while (opc !=7);
	}
	
	public static void menu() {
		System.out.println("1.- Añadir tarea de empresa\n"+
							"2.-Añadir tarea de cliente \n"+
							"3.-Mostrar tareas por fecha de creacion\n"+
							"4.-Mostrar tareas por prioridad\n"+
							"5.-Mostrar numero de tareas pendientes\n"+
							"6.-Resolver tarea\n"+
							"7.-Salir\n"
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
