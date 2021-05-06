package empresa;

public class Operario extends EmpleadoBase {
	
	private SueldoEmpleadosBase sueldoEmpleadosBase;
	private Incremento incremento;

	public Operario(String DNI, String nombre, double sueldo) {
		super(DNI, nombre, sueldo);
		this.sueldoEmpleadosBase=SueldoEmpleadosBase.OPERARIO;
		this.incremento=Incremento.EMPLEADO_BASE;
	}
	
	
	
	@Override
	public double ActualizableSueldo() {
		double sueldoFinal;
		sueldoFinal= (sueldoEmpleadosBase.getSueldoEmpleado()*incremento.getSubida());
		return sueldoFinal;
	}



	

}
