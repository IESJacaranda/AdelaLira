package ejercicio2;

import java.util.Scanner;

public class Main {
	
	
	public final static String MENU=" 1. Si el IVA asignado por el gobierno no es 20 indiquenos en esta opción. \n 2. Consulta \n 3. Modificación. \n 4. Calcula el precio con IVA. \n 5. Comparar productos \n 6. Salir";
	public final static String MENU_MODIFICACIONES="1. Modificación del código. \n 2. Modificación de la descripción. \n 3. Modificación del precio. \n 4. Modificación del IVA.";

	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		Producto producto = new Producto (23, "Hola",23.5);
		Producto producto2 = new Producto(23, "Hola",23.5);
		int opcion=0;
		int opcion2=0;
		
		while (opcion<5) {
			mostrarMenu();
			opcion= Integer.parseInt(teclado.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("¿Cual es el IVA ACTUAL DEL GOBIERNO?");
				producto.setIVA(Integer.parseInt(teclado.nextLine()));
				System.out.println("Ha introducido que el IVA actual del gobierto es " + producto.getIVA());
				break;
			case 2:
				//METODO DE CONSULTA
				System.out.println(producto.toString());
				break;
			case 3:
				mostrarMenuModificaciones();
				opcion2=Integer.parseInt(teclado.nextLine());
				switch (opcion2) {
				case 1:
					//Modificar codigo
					System.out.println("Introduzca el nuevo código");
					producto.setCodigo(Integer.parseInt(teclado.nextLine()));
					System.out.println("El nuevo codigo es " + producto.getCodigo());
					break;
				case 2:
					//Modificar descripcion
					System.out.println("Introduzca la nueva descripción");
					producto.setDescripcion(teclado.nextLine());
					System.out.println("La nueva descripción del producto es " + producto.getDescripcion());
					break;
				case 3:
					//Modificar precio
					System.out.println("Introduzca el nuevo precio");
					producto.setPrecio(Double.parseDouble(teclado.nextLine()));
					System.out.println("La nuevo precio del producto es " + producto.getPrecio());
					break;
				case 4:
					//Modificar IVA
					System.out.println("Introduzca el nuevo IVA");
					producto.setIVA(Integer.parseInt(teclado.nextLine()));
					System.out.println("Ha introducido que el IVA actual del gobierto es " + producto.getIVA());
					break;
				default: 
					System.out.println("Ha ocurrido un error inesperado");
					break;
				}
				break;
			case 4:
				//Calculo del precio con IVA
				try {
					System.out.println("El precio del producto es " + producto.calculaPrecio());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println(producto.equals(producto2));
				producto.equals(producto2);
				break;
			case 6:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Ha ocurrido un error inesperado");
				break;
			}
			
		}
		

	}
	
	public static void mostrarMenu() {
		System.out.println(MENU);
	}
	
	public static void mostrarMenuModificaciones() {
		System.out.println(MENU_MODIFICACIONES);
	}

}
