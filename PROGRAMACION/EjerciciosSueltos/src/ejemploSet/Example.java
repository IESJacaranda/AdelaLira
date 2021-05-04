package ejemploSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		
		Set <Integer> enteros = new HashSet();
		enteros.add(3);
		enteros.add(3);
		enteros.add(5);
		enteros.add(5);
		enteros.add(9);
		enteros.add(3);
		System.out.println(enteros);//Imprime una vez los repetidos
		
		List<Integer>listaEnteros = new ArrayList();
		listaEnteros.add(3);
		listaEnteros.add(3);
		listaEnteros.add(5);
		listaEnteros.add(5);
		listaEnteros.add(9);
		listaEnteros.add(3);
		System.out.println(listaEnteros); //Imprime todos los numeros
	
		
		List<String>nombres = new ArrayList<String>();
		nombres.add("JM");
		nombres.add("JC");
		nombres.add("JL");
		nombres.isEmpty();
		nombres.clear();
		Object [] nueva = nombres.toArray();
		
		
		imprime(enteros);
		imprime(listaEnteros);
	}

	
	public static void imprime (Collection <Integer> enteros) {
		for (Integer i : enteros) {
			System.out.println(i);
		}
	}
}
