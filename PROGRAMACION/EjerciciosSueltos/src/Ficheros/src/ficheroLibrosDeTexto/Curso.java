package ficheroLibrosDeTexto;

import java.util.ArrayList;

public class Curso {
	
	private String nombre;
	private ArrayList<Materia> listaMaterias;
	
	public Curso(String nombre) {
		this.nombre=nombre;
		this.listaMaterias=new ArrayList<Materia>();
	}
	
	
	public void addMateria(Materia a) {
		if(!this.listaMaterias.contains(a)){
			this.listaMaterias.add(a);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("Curso [nombre=" + nombre + "]");
		for (Materia a : listaMaterias) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}


	
	
	
	
	
}
