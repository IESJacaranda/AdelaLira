package Ejercicio1;

import java.util.Scanner;

public class main {
	
	public static final String MENU = "1. Consultar número de mensajes\r\n"
			+ "2. Consultar mensaje\r\n"
			+ "3. Añadir mensaje\r\n"
			+ "4. Borrar todos los mensajes\r\n"
			+ "5. Salir"; 

	public static void main(String[] args) {
		Contestador contestador = new Contestador();
		Scanner teclado = new Scanner (System.in);
		int menu=0;
		int numero=0;
		int opcion=0;
		int borrar=0;
		String nuevo;
		
		while (menu<5) {
			System.out.println(MENU);
			menu=Integer.parseInt(teclado.nextLine());
			try {
				switch (menu) {
				case 1:
					System.out.println(contestador.toString());
					break;
				case 2:
					System.out.println("1. Mensaje 1\r\n"
			+ "2. Mensaje 2\r\n");
					opcion=Integer.parseInt(teclado.nextLine());
					if (opcion==1) {
						System.out.println("1. Oir\r\n"
						+ "2. Borrar\r\n");
						numero=Integer.parseInt(teclado.nextLine());
						if (numero==1) {
							System.out.println(contestador.getMensaje1());
						}
						if(numero==2) {
							System.out.println(contestador.borrarMensajes());
						}
					}
					else if (opcion==2) {
						System.out.println("1. Oir\r\n"
								+ "2. Borrar\r\n");
								numero=Integer.parseInt(teclado.nextLine());
								if (numero==1) {
									System.out.println(contestador.getMensaje2());
								}
								if(numero==2) {
									System.out.println(contestador.borrarMensajes());
								}
					}
					
					break;
				case 3:
					System.out.println("Introduzca el mensaje que desea añadir");
					nuevo = teclado.nextLine();
					contestador.getMensaje2();
					break;
				case 4:
					System.out.println(contestador.borrarMensajes());
					break;
				case 5:
					System.out.println("Saliendo del sistema");
					break;
				default: 
					System.out.println("Ha ocurrido un error");
					break;
			}	
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		teclado.close();
	}

}
