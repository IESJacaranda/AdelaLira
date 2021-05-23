package ejercicio1;

import java.time.LocalDate;

public abstract class Generador implements Dinero, Comparable<Generador>{
	
	public static int CONTADOR_CODIGO = 1;

	protected static int codigo;
	protected LocalDate fecha;
	protected String localidad;
	protected double potencia;
	
	public Generador(int codigo, LocalDate fecha, String localidad, double potencia) {
		this.fecha=fecha;
		this.localidad=localidad;
		this.potencia=potencia;
		this.codigo=codigo;
	}
	
	
	@Override
	public double dinero() {
		return codigo;
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Generador: codigo=" + codigo + ", fecha=" + fecha + ", localidad=" + localidad + ", potencia="
				+ potencia ;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public static int getCONTADOR_CODIGO() {
		return CONTADOR_CODIGO;
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getLocalidad() {
		return localidad;
	}


	@Override
	public int compareTo(Generador o) {
		return this.fecha.compareTo(o.getFecha());
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		long temp;
		temp = Double.doubleToLongBits(potencia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Generador other = (Generador) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (Double.doubleToLongBits(potencia) != Double.doubleToLongBits(other.potencia))
			return false;
		return true;
	}
	
	
	
	

}
