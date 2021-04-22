package model;

public class HabitacionDoble extends Habitacion {

	public HabitacionDoble() {
		super();
		this.CapacidadMaxima=CapacidadMaxima.DOS;
		this.EFactorAlquiler=EFactorAlquiler.DOBLE;
	}
	
	@Override
	public String toString() {
		return "Habitacion Doble";
	}
}
