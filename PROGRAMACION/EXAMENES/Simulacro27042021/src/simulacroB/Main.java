package simulacroB;

import java.util.Scanner;


public class Main {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws simulacroB.EnumeradoException, SueldoMenorException {

		int opc;
		PuestoEmpleado tipo;
		String dni;
		String nombre;
		String tipito;
		Departamento d = new Departamento("Contabilidad");
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch (opc) {
			case 1:{
				 dni = leerCadena("Introduzca dni");
				 nombre = leerCadena("Introduzca el nombre");
				System.out.println("Introduzca el tipo. Los posibles valores son ADMINISTRATIVO, OPERARIO, CONTABLE");
				 tipito = teclado.nextLine();
				try {
					tipo = PuestoEmpleado.valueOf(tipito.toUpperCase());
				}
				catch (Exception e){
					throw new EnumeradoException();
				}
				
				d.addEmpleados(new EmpleadoBase(dni, nombre, tipo));
				System.out.println(d.listarEmpleados());
				
			}
				break;
			case 2:
				 dni = leerCadena("Introduzca dni");
				 nombre = leerCadena("Introduzca el nombre");
				 int antiguedad= leerEntero("Introduzca años de antiguedad");
				 d.addJefe(new JefeDepartamento(dni, nombre, antiguedad));
				break;
			case 3:
			System.out.println("El total del sueldo es " + d.obtenerSueldo());
				break;
			case 4:
				System.out.println(d.ordenarDepartamentosPorNombre());
				break;
			case 5:
				System.out.println(d.ordenarPorSueldito());
				break;
			case 6:
				System.out.println("Saliendo");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		}while (opc!=6);
	}


	// Muestra el menú
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
