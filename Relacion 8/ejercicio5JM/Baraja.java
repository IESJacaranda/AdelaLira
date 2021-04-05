package ejercicio5JM;

public class Baraja {

	private final static int NUMERO_CARTAS = 48;
	private final static int CARTAS_POR_PALO = 12;
	
	private Carta[] cartas = new Carta [NUMERO_CARTAS];
	
	private void inicializaBaraja() {
		for (int i = 0; i < cartas.PALOS.length; i++) {
			for (int J = 0; J < CARTAS_POR_PALO; J++) {
				cartas[index]= new Carta(Carta.PALOS[i], j+1);
				index++;
			}
		}
		
	}
	
	
}
