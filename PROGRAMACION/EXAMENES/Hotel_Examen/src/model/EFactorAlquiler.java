package model;

public enum EFactorAlquiler {
	
	SIMPLE(1.15),
	DOBLE(1.15),
	SUITE (1.9),
	REUNIONES(1),
	CELEBRACIONES(2.15);
	
	private double factor;
	
	EFactorAlquiler(double factor) {
		this.factor=factor;
	}

	public double getFactor() {
		return factor;
	}
	
}
