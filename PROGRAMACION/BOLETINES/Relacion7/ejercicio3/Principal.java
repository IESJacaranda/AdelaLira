package ejercicio3;

import java.util.*;

public class Principal {
	

	
	public final static String MENU= "1. Llenar jarra: Se solicitará con la pregunta “¿Qué jarra desea llenar (A/B)?” y\r\n"
			+ "se llenará la jarra correspondiente.\r\n"
			+ "2. Vaciar jarra: Se realizará la pregunta “¿Qué jarra desea vaciar (A/ B)?” y se\r\n"
			+ "vaciará la jarra correspondiente.\r\n"
			+ "3. Volcar jarra A en B .\r\n"
			+ "4. Volcar jarra B en A.\r\n"
			+ "5. Ver estado de las jarras: Se mostrará la capacidad y el agua que contiene, tanto\r\n"
			+ "para la jarra A como para la B.\r\n"
			+ "6. Salir: Cuando salga debe mostrarse un mensaje que indique \"El total de agua\r\n"
			+ "que se ha gastado llenando jarras es XXX litros\".";
	public final static String JARRA= "¿Qué jarra desea llenar (A/B)?";
	public final static String JARRAVACIAR= "¿Qué jarra desea vaciar (A/B)?";
	
	static Scanner teclado=new Scanner (System.in);

	public static void main(String[] args) {

		Jarra jarra =new Jarra();
		
		int opcion=0;
		String opcion2="";
		String opcion3="";
		
		while(opcion<6) {
			mostrarMenu();
			opcion=Integer.parseInt(teclado.nextLine());
			
			switch(opcion) {
			case 1:
				mostrarMenuJarra();
				opcion2=teclado.nextLine();
				if (opcion2.equalsIgnoreCase("A")) {
					//Llenado jarra A
					jarra.llenarJarraA();
					System.out.println("La jarra A tiene un total de " + jarra.getJarraA() + "L");
				}
				else if (opcion2.equalsIgnoreCase("B")) {
					//Llenado jarra B
					jarra.llenarJarraB();
					System.out.println("La jarra B tiene un total de " + jarra.getJarraB() + "L");
				}
				break;
			case 2:
				mostrarMenuJarraVaciar();
				opcion3=teclado.nextLine();
				if(opcion3.equalsIgnoreCase("A")) {
					//Vaciar jarra A
					jarra.vaciarJarraA();
					System.out.println("La jarra A tiene un total de " + jarra.getJarraA() + "L");
				}
				else if (opcion3.equalsIgnoreCase("B")){
					//Vaciar jarra B
					jarra.vaciarJarraB();
					System.out.println("La jarra B tiene un total de " + jarra.getJarraB() + "L");
				}
				break;
			case 3:
				//Vaciar A en B
				try {
					jarra.vaciarAEnB();
					System.out.println(jarra.vaciarAEnB());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				//Vaciar B en A
				try {
					jarra.vaciarBEnA();
					System.out.println(jarra.vaciarBEnA());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println(jarra.getJarraA() + " " + jarra.getJarraB());
				break;
			case 6:
				System.out.println("Saliendo, el total de agua que se ha gastado llenando jarras es XXX litros");
				break;
			}
			
		}
		
	
	}
	
	public static void mostrarMenu() {
		System.out.println(MENU);
	}
	public static void mostrarMenuJarra() {
		System.out.println(JARRA);
	}
	public static void mostrarMenuJarraVaciar() {
		System.out.println(JARRAVACIAR);
	}

}
