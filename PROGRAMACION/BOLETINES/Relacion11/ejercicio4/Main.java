package ejercicio4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		Historial historial = new Historial();
		
		int opcion = 0;
		
		
		while(opcion<5) {
			menu();
			opcion=Integer.parseInt(teclado.nextLine());
			switch(opcion) {
				case 1:
					LocalDateTime fecha = LocalDateTime.now();
					System.out.println("�En que p�gina desea entrar?");
					String pagina=teclado.nextLine();
					historial.addPagina(new PaginaWeb (pagina, fecha));
					break;
				case 2:
					System.out.println("El historial es: ");
					historial.consultaHistorialCompleto();
					break;
				case 3:
					break;
				case 4:
					try {
						historial.borraHistorial();
						System.out.println("El historial ha sido eliminado");
					} catch (HistorialVacioException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					break;
				case 5:
					System.out.println("Saliendo del sistema");
					break;
				default:
					break;
			}
		}
		
//		historial.addPagina(new PaginaWeb ("Minijuegos", LocalDateTime.now()));
//		historial.addPagina(new PaginaWeb ("Minijuegos", LocalDateTime.now()));
//		historial.addPagina(new PaginaWeb ("Minijuegos", LocalDateTime.now()));
//		historial.addPagina(new PaginaWeb ("Minijuegos", LocalDateTime.now()));
//		
//		historial.borraHistorial(); //BORRA HISTORIAL
//		historial.consultaHistorialCompleto();
		
		
		

//		MENU
//			NUEVA PAGINA
//			CONSULTA HISTORIAL COMPLETO
//			CONSULTA HISTORIAL DIA
//			BORRAR HISTORIAL
//			SALIR

	}
	
	public static void menu() {
		System.out.println("1.- Nueva p�gina consultada\n"+
							"2.-Consultar historial completo\n"+
							"3.-Consultar historial de un d�a\n"+
							"4.-Borrar historial completo.\n"+
							"5.-Salir\n"
				);
	}

}
