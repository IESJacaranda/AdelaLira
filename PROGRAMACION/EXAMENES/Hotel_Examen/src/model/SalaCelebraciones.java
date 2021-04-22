package model;

public class SalaCelebraciones extends Sala {

	public SalaCelebraciones() {
		super();
		this.CapacidadMaxima=CapacidadMaxima.OCHENTA;
		this.EFactorAlquiler=EFactorAlquiler.CELEBRACIONES;
	}
	
	@Override
	public String toString() {
		return "Sala de Celebraciones";
	}
	
}
