package ejercicio1c;

public enum Bonificacion {
	
	CUENTA_JOVEN(0.25),
	CUENTA_NORMAL(0.0);
	
	private double bonificacion;
	
	Bonificacion(double bonificacion){
		this.bonificacion=bonificacion;
	}

	public double getBonificacion() {
		return bonificacion;
	}

}
