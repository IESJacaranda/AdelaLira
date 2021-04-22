package model;

public enum CapacidadMaxima {

	UNO(1),
	DOS(2),
	VEINTE(20),
	OCHENTA(80);
	
	private int capacidad;

	CapacidadMaxima (int capacidad){
		this.capacidad=capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}	
}

