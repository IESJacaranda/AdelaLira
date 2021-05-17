package ficheroLibrosDeTexto;

import java.util.ArrayList;

import fichero1.City;

public class Provincia {

	private String nombre;
	private ArrayList<Localidad> listaLocalidades;
	
	public Provincia(String nombre) {
		this.nombre=nombre;
		this.listaLocalidades=new ArrayList<Localidad>();
	}

	public void addLocalidad(Localidad a) {
		if(!this.listaLocalidades.contains(a)){
			this.listaLocalidades.add(a);
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
		Provincia other = (Provincia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
	
}