package ejercicio6;

import java.util.Iterator;

public class Frase {
	
	private String frasesita;

	public static final int [] CONTADOR = new int [28];
	public static final char [] ABECEDARIO= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public Frase(String frasesita) {
		this.frasesita=frasesita;
	}
	
	public void contarLetras() {
			
		for (int j = 0; j < ABECEDARIO.length; j++) {
			for (int i = 0; i < frasesita.length(); i++) {
				if(ABECEDARIO[j]==frasesita.charAt(i)) {
					CONTADOR[j]++;
					
				}
			}
		}
		
		//System.out.println(ImprimirMatrices.printMatrix(CONTADOR));
	}
	
	public void letrasYNumeros() {
		
		
		for (int i = 0; i < CONTADOR.length; i++) {
			if(CONTADOR[i]>0) {
				
				String cadenaConFormato = "La letra %s aparece un total de %s veces.";
				System.out.println(String.format(cadenaConFormato, ABECEDARIO[i], CONTADOR[i]));
				//"La letra " +ABECEDARIO[i] + " aparece un total de " + CONTADOR[i] + " veces."
			}
			
		}
		
		
	}
	
	
}
