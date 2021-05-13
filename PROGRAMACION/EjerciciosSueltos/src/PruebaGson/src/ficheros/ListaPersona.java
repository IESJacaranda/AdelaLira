package ficheros;

import java.util.ArrayList;

public class ListaPersona {

	private ArrayList<Persona> lista;

	public ListaPersona() {
		this.lista = new ArrayList<Persona>();
	}

	public void addPersona(String nombre, String appelido, int edad) {
		lista.add(new Persona(nombre, appelido, edad));
	}
	
	
	
	
	
}
