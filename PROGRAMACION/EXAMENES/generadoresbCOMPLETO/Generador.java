package generadoresb;

import java.time.LocalDate;

public abstract class Generador implements Monetizable{
	
	public static int codigoGenerador =1;
	
	protected int codigo;
	protected LocalDate fechaInicio;
	protected String localidad;
	protected double potencia;
	
	
	public Generador(LocalDate fechaInicio, String localidad, double potencia) {
		this.fechaInicio = fechaInicio;
		this.localidad = localidad;
		this.potencia = potencia;
		this.codigo=codigoGenerador++;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
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
		if (codigo != other.codigo)
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
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



	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}



	public int getCodigo() {
		return codigo;
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public String getLocalidad() {
		return localidad;
	}


	@Override
	public String toString() {
		return "Generador [codigo=" + codigo + ", fechaInicio=" + fechaInicio + ", localidad=" + localidad
				+ ", potencia=" + potencia + "]";
	}	
	
	
	

}
