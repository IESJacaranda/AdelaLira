package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	
	Map <String, ArrayList<String>> diccionario;
	public Diccionario() {
		this.diccionario=new HashMap<String, ArrayList<String>>();
	}
	
	
	public void añadirPalabras(String palabra, String definicion) {
		if(diccionario.containsKey(palabra)) {
			 diccionario.get(palabra).add(definicion);
		}
		else {
	        diccionario.put(palabra, new ArrayList<String>());
	        diccionario.get(palabra).add(definicion);
	    }
	}
	
	public String buscarPalabra(String palabra) {
		StringBuilder sb = new StringBuilder();
		
		if(!diccionario.containsKey(palabra)) {
			System.out.println("Exception");
		}
		else {
			for (String e : diccionario.get(palabra)) {
				sb.append("-" + e + "\n");
			}
		}
		

		return sb.toString();
	}
	
	public boolean borrarPalabra(String palabra) {
		boolean existe=false;
		
		if(!diccionario.containsKey(palabra)) {
			System.out.println("Exception");
		}
		else {
			diccionario.remove(palabra);
			existe=true;
		}
		return existe;
	}

	
	public String buscarPalabrasOrdenadas(String cadena) {
		StringBuilder sb = new StringBuilder();
		List<String> lista = new ArrayList<String>();
				  
		for (String e : diccionario.keySet()) {
			if(e.startsWith(cadena)) {
				lista.add(e);
			}
		}
	        Collections.sort(lista);
	        for (String palabra : lista) {
				sb.append(palabra + "\n");
			}
		return sb.toString();
	}


}
