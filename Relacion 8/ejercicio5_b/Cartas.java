package ejercicio5_b;

import java.util.Iterator;

public class Cartas {
	
	public static final String [] PALOS = {"bastos", "oros", "copas", "espadas"};


	private int numero;
	
	public Cartas () {
		this.numero=numero;
	}
	
	
	
	public void repartirCartas (int numero, int jugadores) {
		int numeropalo = 0;
		while (jugadores!=0) {
			for (int i = 0; i < numero; i++) {
				numeropalo=(int)(Math.random()*11+1);
				int posicion = (int)(Math.random() * PALOS.length);

	            System.out.println("El jugador numero " + jugadores + " tienes las cartas " + numeropalo + " " +PALOS[posicion]);
	            
			}
			jugadores--;
			
		}
		
		
	}
	
	
	
}
