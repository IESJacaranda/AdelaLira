package ficheroLibrosDeTexto;

import java.util.ArrayList;

public class Materia {
	
	private String nombre;
	private ArrayList<Libro> listaLibros;
	
	public Materia(String nombre) {
		this.nombre=nombre;
		this.listaLibros=new ArrayList<Libro>();
	}

	
	
}
