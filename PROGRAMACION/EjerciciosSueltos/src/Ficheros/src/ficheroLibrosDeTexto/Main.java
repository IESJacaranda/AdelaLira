package ficheroLibrosDeTexto;

import java.util.Scanner;


public class Main {
	
	static Scanner teclado = new Scanner ( System.in);

	public static void main(String[] args) {

		try {
			ListaProvincias provincias = new ListaProvincias(".\\contenedorFicheros2\\gratuidadlibrosdetextoandalucia.csv");
			System.out.println(provincias);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		String editorial= "";
//		
//		int op= 0 ;
//			
//			do {
//				menu();
//				op=Integer.parseInt(teclado.nextLine());
//				switch(op) {
//				case 1:
//					System.out.println("Editorial más usada en cada una de las provincias.");
//					break;
//				case 2:
//					System.out.println("Editorial más usada en una provincia cuyo nombre se pedirá por teclado. ");
//					editorial = leerCadena("¿Que editorial desea consultar?");
//					break;
//				case 3:
//					System.out.println("Editorial más usada en una localidad. Se pedirán los datos de localidad y provincia.");
//					break;
//				case 4:
//					System.out.println("Editorial más usada en una materia (se pedirán los datos de la materia).");
//					break;
//				case 5:
//					System.out.println(" Listado de todos los libros usados en todas las materias en un centro (se pedirá el código del centro).");
//					break;
//				case 6:
//					System.out.println("Listado de todos los libros usados en todas las materias en un centro (se pedirá el nombre del centro).");
//					break;
//				case 7:
//					System.out.println("Listado de todos los libros usados en una materia en una localidad (se pedirá el nombre de la localidad y \"\r\n"
//							+ "				+ \"el nombre de la materia) mostrando el nombre del centro y el libro \"\r\n"
//							+ "				+ \"correspondiente en cada curso que tenga dicha materia.)");
//					break;
//				case 8:
//					System.out.println("Saliendo del sistema");
//					break;
//				default: 
//					System.out.println("Ha ocurrido un fallo");
//					break;
//				
//					
//				
//				}
//			} while(op!=8);
//				
//				
//				

	}

	
	public static void menu() {
		System.out.println("1. Editorial más usada en cada una de las provincias. \n"
				+"2. Editorial más usada en una provincia cuyo nombre se pedirá por teclado.\n"
				+"3. Editorial más usada en una localidad. Se pedirán los datos de localidad y provincia.\n"
				+"4. Editorial más usada en una materia (se pedirán los datos de la materia).\n"
				+"5. Listado de todos los libros usados en todas las materias en un centro (se pedirá el código del centro).\n"
				+"6. Listado de todos los libros usados en todas las materias en un centro (se pedirá el nombre del centro).\n"
				+"7. Listado de todos los libros usados en una materia en una localidad (se pedirá el nombre de la localidad y "
				+ "el nombre de la materia) mostrando el nombre del centro y el libro "
				+ "correspondiente en cada curso que tenga dicha materia.)\n"
				+ "8. Salir.");
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
