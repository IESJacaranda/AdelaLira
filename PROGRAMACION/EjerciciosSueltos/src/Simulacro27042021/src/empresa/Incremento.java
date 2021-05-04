package empresa;

public enum Incremento {

	JEFE_DEPARTAMENTO(1.10),
	EMPLEADO_BASE(1.25);
	
	private double subida;
	
	Incremento(double subida){
		this.subida=subida;
	}

	public double getSubida() {
		return subida;
	}


}
