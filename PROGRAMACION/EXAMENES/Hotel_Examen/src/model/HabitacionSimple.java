package model;

public class HabitacionSimple extends Habitacion {

	public HabitacionSimple() {
		super();
		this.CapacidadMaxima=CapacidadMaxima.UNO;
		this.EFactorAlquiler=EFactorAlquiler.SIMPLE;
	}

	@Override
	public String toString() {
		return "Habitacion Simple";
	}
	
	
}
