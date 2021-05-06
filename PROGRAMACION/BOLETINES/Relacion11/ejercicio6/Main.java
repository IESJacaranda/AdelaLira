package ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String palabra;
		String definicion;
		int op=0;
		
		Diccionario diccionario = new Diccionario();
		
		while(op!=5) {
			menu();
			op=Integer.parseInt(teclado.nextLine());
			switch(op) {
				case 1:
					palabra= leerCadena("Palabra  a introducir:");
					System.out.println("Definición de la anterior palabra");
					definicion=teclado.nextLine();
					diccionario.añadirPalabras(palabra, definicion);
					System.out.println(diccionario.diccionario);
					break;
				case 2:
					palabra= leerCadena("Que palabra desea buscar:");
					System.out.println(diccionario.buscarPalabra(palabra));
					break;
				case 3:
					palabra= leerCadena("Que palabra desea introducir:");
					System.out.println(diccionario.borrarPalabra(palabra));
					break;
				case 4:
					String cadena= leerCadena("¿Porque letra desea la busqueda?");
					System.out.println(diccionario.buscarPalabrasOrdenadas(cadena));
					break;
				case 5: 
					System.out.println("Saliendo");
					break;
				default:
					break;
			}
		}
		
		
		
		
//		MENU:
//			-Añadir palabra. Se solicitará a palabra y su significado. 
//			-Buscar palabra en diccionario:
//			-Borrar una palabra del diccionario
//			-Listado de palabras que empiecen por … Se solicitará una cadena y se mostrará
//			-un listado de palabras ordenado alfabéticamente que comiencen por esa cadena
//			-Salir

	}

	
	Map <String, ArrayList<String>> diccionario = new HashMap<String, ArrayList<String>>();
	
	public void añadirPalabras(String palabra, ArrayList<String> definicion) {
		diccionario.put(palabra, definicion);
	}
	
	
	
	
	
	public static void menu() {
		System.out.println("1. Añade nueva palabra. \n"
				+ "2. Busca una palabra. \n"
				+ "3. Borrar una palabra. \n"
				+ "4. Lista de palabras que empiezan por la letra elegida. \n"
				+ "5. Salir.");
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
}
