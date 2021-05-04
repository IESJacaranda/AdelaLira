package mapaEjemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimosParesImpares {

	public static void main(String[] args) {
		
		Map <String, List<Integer>> numeros = new HashMap<String, List<Integer>>();
		
		numeros.put("primos", new ArrayList<Integer>());
		
		
		for (int i = 2; i < 101; i++) {
			boolean esPrimo=true;
			//TRANSFORMARLO PARA UQE NO RECORRA TODO CON UN ITERADOR QUE RECORRA UN FOR
			//MIENTRAS ITERADOR.HASNEXT Y SEA PRIMO SIGUE
			for (Integer n : numeros.get("primos")) {
				if(i%n==0) {
					esPrimo=false;
				}
			}
			
			if(esPrimo) {
				numeros.get("primos").add(i);
			}
		}
		
		
		
		
/*
		for (int i = 0; i < 101; i++) {
			if(i%2==0) {
				if(numeros.containsKey("pares")) {
					
				}
				else {
					numeros.put("pares", new ArrayList<Integer>());
					numeros.get("pares").add(i);
				}
				
			}
			else {
				if(numeros.containsKey("impares")) {
					numeros.get("impares").add(i);
				}
				else {
					numeros.put("impares", new ArrayList<Integer>());
					numeros.get("impares").add(i);
				}
			}
		}
*/		
		System.out.println(numeros);
	}

}
