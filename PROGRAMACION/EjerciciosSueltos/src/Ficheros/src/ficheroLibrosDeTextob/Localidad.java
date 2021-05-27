package ficheroLibrosDeTextob;

import java.util.ArrayList;

public class Localidad {

	private String nombre;
	private ArrayList<Centro> listaCentros;
	
	
	public Localidad(String nombre) {
		this.nombre = nombre;
		this.listaCentros=new ArrayList<Centro>();
	}

	
	public void addCentro(Centro a) {
		if(!this.listaCentros.contains(a)){
			this.listaCentros.add(a);
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
		Localidad other = (Localidad) obj;
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
		sb.append("Localidad [nombre=" + nombre + "]");
		for (Centro a : listaCentros) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
