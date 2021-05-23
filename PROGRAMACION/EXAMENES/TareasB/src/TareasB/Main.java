package TareasB;

import java.time.LocalDate;
import java.util.Scanner;

import generadoresB.GeneradorEolico;
import generadoresB.GeneradorSolar;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		Empresa empresa = new Empresa();
		
		String departamento = "";
		String decrip = "";
		String cliente = "";
		String prioridad = "";
		String localidad = "";
		LocalDate fechaAlta = LocalDate.now();
		LocalDate fechaSolucion;
				
		
		int op = 0;
		do {
			menu();
			op=Integer.parseInt(teclado.nextLine());
			switch(op) {
			case 1:
				decrip=leerCadena("Introduce descripcion");
				prioridad=leerCadena("Introduce la prioridad");
				departamento = leerCadena("Introduce departamento");
				
				empresa.addTareaEmpresa(decrip, prioridad, departamento);
				System.out.println(empresa.listarNoRealizadas());
				break;
			case 2:
				decrip=leerCadena("Introduce descripcion");
				prioridad=leerCadena("Introduce la prioridad");
				cliente = leerCadena("Introduce nombre cliente");
				localidad = leerCadena("Introduce localidad del cliente");
				empresa.addTareaCliente(decrip, prioridad, cliente, localidad);
				System.out.println(empresa.listarNoRealizadas());
				break;
			case 3:
				System.out.println(empresa.mostrarTareas());
				break;
			case 4:
				System.out.println(empresa.mostrarTareasPrioridad());
				break;
			case 5:
				System.out.println(empresa.numTareasPendientes());
				System.out.println(empresa.listarNoRealizadas());
				break;
			case 6:
				decrip=leerCadena("Introduce descripcion");
				fechaAlta = LocalDate.now();
				fechaSolucion = obtenerFecha();
				empresa.resolverTarea(decrip, fechaAlta, fechaSolucion);
				System.out.println(empresa.listarNoRealizadas());
				System.out.println(empresa.listarRealizadas());
				System.out.println(empresa.listarNoRealizadas());
				break;
			case 7:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Ha ocurrido un error");
				break;
			}
		}while(op<=7);
		

	}
	
	
	public static void menu() {
		System.out.println("1.- A�adir tarea de empresa\n"+
							"2.-A�adir tarea de cliente\n"+
							"3.-Mostrar tareas por fecha\n"+
							"4.-Mostrar tareas por prioridad\n"+
							"5.-Mostrar tareas pendientes\n"+
							"6.-Resolver tarea\n"+
							"7.-Salir"
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
