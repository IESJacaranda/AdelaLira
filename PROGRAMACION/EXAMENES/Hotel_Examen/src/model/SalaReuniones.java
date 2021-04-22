package model;

public class SalaReuniones extends Sala {

	public SalaReuniones() {
		super();
		this.CapacidadMaxima=CapacidadMaxima.VEINTE;
		this.EFactorAlquiler=EFactorAlquiler.REUNIONES;
	}
	@Override
	public String toString() {
		return "Sala de Reuniones";
	}
}
