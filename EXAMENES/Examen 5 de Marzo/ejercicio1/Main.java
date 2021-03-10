package ejercicio1;

import java.util.Scanner;
public class Main {
	
	public final static String MENU=" 1. Profesor. \n 2. Personal de direccion \n 3. Personal de administración. \n 4. Salir.";
	public final static String MENUDOS=" 1. Comprobar contraseña. \n 2. Información \n ";

	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {


		Personal personal = new Personal ("Pepe", 20, "Hombre", "08:00-14:00", "456LInterna");
		Profesor profesor = new Profesor("Antonia", 50, "Mujer", "10:00-15:00", "63amarillo");
		PersonalDeDireccion  perdirecc = new PersonalDeDireccion ("Esther" , 25 , "Mujer", "06:00-12:00","ESTHER1234");
		PersonalDeAdministracion peradmin = new PersonalDeAdministracion ("Lucas",46,"Hombre","11:00-18:00","TORtugas354");
	
		System.out.println(profesor.hashCode());
		System.out.println(perdirecc.hashCode());
		
		int opcion=0;
		int opcion2=0;
		int opcion3=0;
		int opcion4=0;
		int codigo=0;
		
		
		while(opcion<4) {
			mostrarMenu();
			opcion=Integer.parseInt(teclado.nextLine());
			
			
			switch (opcion) {
			case 1:
				mostrarMenucontraseña();
				opcion2=Integer.parseInt(teclado.nextLine());
				
				switch(opcion2) {
				case 1:
					try {
						System.out.println(profesor.comprobarContrasena());
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Introduce tu codigo");
					codigo=Integer.parseInt(teclado.nextLine());
					if (codigo==profesor.hashCode()) {
						System.out.println(profesor.toString());
					}
					else {
						System.out.println("El codigo introducido es incorrecto");
					}
					break;
				}
				
				break;
			case 2:
				mostrarMenucontraseña();
				opcion3=Integer.parseInt(teclado.nextLine());

				switch(opcion3) {
				case 1:
					try {
						System.out.println(perdirecc.comprobarContrasena());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Introduce tu codigo");
					codigo=Integer.parseInt(teclado.nextLine());
					if (codigo==perdirecc.hashCode()) {
						System.out.println(perdirecc.toString());
					}
					else {
						System.out.println("El codigo introducido es incorrecto");
					}
					break;
				}
				codigo=0;
				break;
			case 3:
				mostrarMenucontraseña();
				opcion4=Integer.parseInt(teclado.nextLine());

				switch(opcion4) {
				case 1:
					try {
						System.out.println(peradmin.comprobarContrasena());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					codigo=0;
					break;
					
				case 2:
					System.out.println("Introduce tu codigo");
					codigo=Integer.parseInt(teclado.nextLine());
					if (codigo==peradmin.hashCode()) {
						System.out.println(peradmin.toString());
					}
					else {
						System.out.println("El codigo introducido es incorrecto");
					}
					codigo=0;
					break;
				}
				break;
			case 4:
				System.out.println("Saliendo");
				break;
			default:
				break;
			}
		}

	}
	
	public static void mostrarMenu() {
		System.out.println(MENU);
	}
	public static void mostrarMenucontraseña() {
		System.out.println(MENUDOS);
	}
}


