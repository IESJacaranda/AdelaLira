package empresa;

public enum SueldoEmpleadosBase {
	
	ADMINISTRATIVO(1150),
	OPERARIO(1100),
	CONTABLE(1350);
	
	private int sueldoEmpleado;
	
	SueldoEmpleadosBase(int sueldoEmpleado){
		this.sueldoEmpleado=sueldoEmpleado;
	}

	public int getSueldoEmpleado() {
		return sueldoEmpleado;
	}
	
	

}
