package Ejercicio1JM;

import java.util.*;

public class main {
	
	public static final String MENU = "1. Consultar número de mensajes\r\n"
			+ "2. Consultar mensaje\r\n"
			+ "3. Añadir mensaje\r\n"
			+ "4. Borrar todos los mensajes\r\n"
			+ "5. Salir";
	
	public static final String MENU_MENSAJES = "1. Mensaje número 1\r\n"
			+ "2. Mensaje número 2\r\n"
			+ "3. Mensaje número 3";

	public static final String OPCIONES_MENSAJES="1. Oir\r\n"
			+ "2. Borrar";
	
	private static Scanner teclado =new Scanner (System.in);
	
	public static void main(String[] args) {

		showMainMenu();
		int opcionMenu = Integer.parseInt(teclado.nextLine());
			
		Contestador contestador = new Contestador ();
		
		while (opcionMenu!=5) {
			contestador.setMensaje1("mensaje1");
			contestador.setMensaje2("mensaje2");
			contestador.setMensaje3("mensaje3");			
		
			switch (opcionMenu) {
			case 1:
				System.out.println("Existen "+ contestador.getNumeroMensajes() + " mensajes creados");
				break;
			case 2:
				subMenu(contestador);
				break;
			case 3:
				System.out.println("Introduzca el mensaje que quiere guardar");
				String mensaje =teclado.nextLine();
				try {
					contestador.addMensaje(mensaje);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				contestador.borrarTodosLosMensajes();
				break;
			default:
				break;
			}
		}
			
		
	}

	
	public static void showMainMenu() {
		System.out.println(MENU);
	}
	

	public static void subMenu(Contestador contestador) {
		System.out.println("¿Que mensaje desea consultar?");
		System.out.println(MENU_MENSAJES);
		int numMensaje = Integer.parseInt(teclado.nextLine());
		int opcion= 0;
		
		if (numMensaje >0 && numMensaje<=3) {
			System.out.println(OPCIONES_MENSAJES);
			switch (numMensaje) {
			case 1:
				opcion=Integer.parseInt(teclado.nextLine());
				if(opcion==1) {
					try {
						System.out.println(contestador.getMensaje1());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (opcion==2) {
					contestador.borrarMensaje1();
				}
				break;
			case 2:
				opcion=Integer.parseInt(teclado.nextLine());
				if(opcion==1) {
					try {
						System.out.println(contestador.getMensaje2());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (opcion==2) {
					contestador.borrarMensaje2();
				}
				break;
			case 3:
				opcion=Integer.parseInt(teclado.nextLine());
				if(opcion==1) {
					try {
						System.out.println(contestador.getMensaje3());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (opcion==2) {
					contestador.borrarMensaje3();
				}
				break;
			}
		}
	}
	
}
