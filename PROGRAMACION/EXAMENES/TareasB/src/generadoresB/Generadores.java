package generadoresB;

import java.time.LocalDate;

public abstract class Generadores implements Monetizable {
	private static int codigoIncrementador=1; //AUTOMATICO
	private LocalDate fechaComienzo;
	private String localidad;
	protected double potencia;
	private int codigo;
	
	
	
	public Generadores(LocalDate fechaComienzo, String localidad, double potencia) {
		super();
		this.fechaComienzo = fechaComienzo;
		this.localidad = localidad;
		this.potencia = potencia;
		this.codigo=codigoIncrementador++;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Generadores other = (Generadores) obj;
		if (codigo != other.codigo)
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
	public LocalDate getFechaComienzo() {
		return fechaComienzo;
	}
	public String getLocalidad() {
		return localidad;
	}
	@Override
	public String toString() {
		return "Generadores [codigo=" + codigo + ", fechaComienzo=" + fechaComienzo + ", localidad=" + localidad
				+ ", potencia=" + potencia + "]";
	}
	@Override
	public double dinero(double precioEnergia) {
		double precioFinal;
		precioFinal=potencia*precioEnergia;
		return precioFinal;
	}
	
	
}

