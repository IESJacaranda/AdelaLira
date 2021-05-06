package simulacroB;

public enum PuestoEmpleado {
	
	ADMINISTRATIVO(1150),
	OPERARIO(1100),
	CONTABLE(1350);
	
	private int puesto;
	
	PuestoEmpleado (int puesto){
		this.puesto=puesto;
	}

	public int getPuesto() {
		return puesto;
	}
}
