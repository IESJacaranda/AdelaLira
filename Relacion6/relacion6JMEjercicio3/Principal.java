package relacion6JMEjercicio3;

import java.util.Scanner;

public class Principal {
	
	
	public static final String MENU = "Servir café solo (1 euro)\r\n"
			+ "2. Servir leche (0,8 euros)\r\n"
			+ "3. Servir café con leche (1,5 euros)\r\n"
			+ "4. Consultar estado máquina. Aparecen los datos de los depósitos y del\r\n"
			+ "monedero\r\n"
			+ "5. Apagar máquina y salir";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int opcion = 0;
		MaquinaCafe maquina =new MaquinaCafe();
		
		while (opcion!=5) {
			try {	
				mostrarMenu();
				opcion=Integer.parseInt(teclado.nextLine());
				
				switch (opcion) {
				case 1:
					//servir cafe
					if (maquina.esPosibleServirCafe()) {
						System.out.println("Introduzca la cantidad " + MaquinaCafe.PRECIO_CAFE);
						double cantidad = Double.parseDouble(teclado.nextLine());
						maquina.darCambio(cantidad, MaquinaCafe.PRECIO_CAFE);
						maquina.servirCafe();
					}
					else {
						System.out.println("No hay suficiente cantidad de café");
					}
				case 2:
					//servir leche
					if (maquina.esPosibleServirLeche()) {
						System.out.println("Introduzca la cantidad " + MaquinaCafe.PRECIO_LECHE);
						double cantidad = double.parseDouble(teclado.nextLine()));
						maquina.darCambio(cantidad, MaquinaCade.PRECIO_LECHE);
						maquina.servirLeche();
					}
					else {
						System.out.println("No hay suficiente cantidad de leche");
					}
					break;
				case 3:
					//servir cafe con leche
					if (maquina.esPosibleServirCafeConLeche()) {
						System.out.println("Introduzca la cantidad " + MaquinaCade.PRECIO_CAFE_LECHE);
						double cantidad = Double,parseDouble(teclado.nextLine());
						maquina.darCambio(cantidad, MaquinaCade.PRECIO_CAFE_LECHE);
						maquina.servirCafeconLeche();
					}
					else {
						System.out.println("No hay suficiente cantidad de café ni de leche");
					}
					
				break;
				case 4:
				System.out.println(maquina);
					break;
				default:
					break;
				}
			}
		
				
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void mostrarMenu() {
		System.out.println(MENU);
	}
	
}
