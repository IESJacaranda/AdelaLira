package model;


import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

		
		private static Scanner teclado = new Scanner(System.in);
		private static final String MENU_PRINCIPAL = "1. Inicializar hotel\n" + 
														"2. Mostrar la lista de todas las instalaciones\n" + 
														"3. Reservar una habitaci�n/sala\n" + 
														"4. Calcular el total de ingresos obtenidos por las reservas\n" + 
														"5. Mostrar la reserva de instalaciones a partir de una fecha dada\n" + 
														"6. Listar la reserva de instalaciones ordenada por fecha";
		
		
		
		public static void main(String[] args) {
			
			Hotel hotel = new Hotel();
			
			int opcion =1;
			
			while(opcion > 0 && opcion < 7) {
				try {
					
					opcion = seleccionarOpcionMenuPrincipal();
					
					switch (opcion) {
						
						case 1: //inicializar instalaciones del hotel
							hotel.inicializarHotel();
							break;
						
						case 2: //mostrar instalaciones
							hotel.listarInstalaciones();
							break;
						
						case 3: //reservar habitaciones/salas
							hotel.addReserva(reservarInstalacion());
							break;
						
						case 4: //calcular ingresos obtenidos por las reservas
							hotel.calcularIngresosGenerados();
							break;
							
						case 5: //listar reserva de instalaciones por fecha
							hotel.listarInstalacionesEnFecha(obtenerFecha());
							break;
							
						case 6:	//listar de forma ordenada todas las reservas
							hotel.listarReservaInstalaciones();
							break;
							
						default:
							break;
					}
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("Ejecuci�n finalizada. \nI'll see ya in another life, brotha!!");
			
		}
		
		
		//ToDo
		/**
		 * M�todo a completar para reservar instalaciones
		 * @return objeto con la reserva realizada
		 */
		private static Reservas reservarInstalacion() {
			
			String instalacion = seleccionarSubOpcion("hs", "Quiere reservar una habitaci�n (H/h) o sala (S/s):");
			
			if(instalacion.toLowerCase().equals("h")) {
				instalacion = seleccionarSubOpcion("12s", "Quiere reservar una habitaci�n simple (1), doble (2) o suite (s):");
				LocalDate fechaReserva = obtenerFecha();
				
				if(instalacion.contentEquals("1")) {
					
				}else if(instalacion.contentEquals("2")) {
					
				}else {
					
				}
				
			}else {
				instalacion = seleccionarSubOpcion("cr", "Quiere reservar una sala de celebraciones (C/c) o de reuniones (R/r):");
				LocalDate fechaReserva = obtenerFecha();
				
				if(instalacion.contentEquals("c")) {
					
				}else {
					
				}
			}
			
			
			return new Reservas();//ToDo adaptar al tipo de instalaci�n reservada
		}
		
		/**
		 * Solicita el d�a, mes y a�o para crear y devolver un objeto de tipo LocalDate
		 * @return Fecha
		 */
		private static LocalDate obtenerFecha() {

			System.out.println("Introduzca la fecha paso a paso. Introduzca d�a: ");
			int day = Integer.parseInt(teclado.next());
			
			System.out.println("Introduzca mes: ");
			int month = Integer.parseInt(teclado.next());
			
			System.out.println("Introduzca a�o: ");
			int year = Integer.parseInt(teclado.next());
			
			return LocalDate.of(year, month, day);
		}
		
		/**
		 * Muestra el men� principal y solicita una opci�n v�lida
		 * @return opci�n seleccionada
		 */
		private static int seleccionarOpcionMenuPrincipal() {
			mostrarMenuPrincipal();
			System.out.println("Introduzca una opci�n v�lida entre 1 y 6");
			return Integer.parseInt(teclado.next());
		}
		
		
		private static void mostrarMenuPrincipal() {
			System.out.println(MENU_PRINCIPAL);
		}
		
		

		
		
		
		/**
		 * M�todo auxiliar para pedir opciones v�lidas de submen�s hasta la introducci�n de opci�n correcta
		 * @param opcionesValidas cadena con las opciones v�lidas
		 * @param mensaje mensaje petici�n de datos mostrando valores de las opciones correctas
		 * @return opci�n seleccionada por el usuario
		 */
		private static String seleccionarSubOpcion(String opcionesValidas, String mensaje){
			
			System.out.println(mensaje);
			String opcion = teclado.next();
			
			while(!opcionesValidas.toLowerCase().contains(opcion.toLowerCase())) {
				System.out.println(mensaje);
				opcion = teclado.next();
			}
			return opcion.toLowerCase();
		}

	}

