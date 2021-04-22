package model;

public class Suite extends Habitacion {

	public Suite() {
		super();
		this.CapacidadMaxima=CapacidadMaxima.DOS;
		this.EFactorAlquiler=EFactorAlquiler.SUITE;
	}
	@Override
	public String toString() {
		return "Suite";
	}
}
