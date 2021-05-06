package empresa;

public class Contable extends EmpleadoBase {

	private SueldoEmpleadosBase sueldoEmpleadosBase;
	private Incremento incremento;
	
	public Contable(String DNI, String nombre, double sueldo) {
		super(DNI, nombre, sueldo);
		this.sueldoEmpleadosBase=SueldoEmpleadosBase.CONTABLE;
		this.incremento=Incremento.EMPLEADO_BASE;
	}
	
	@Override
	public double ActualizableSueldo() {
		double sueldoFinal;
		sueldoFinal= (sueldoEmpleadosBase.getSueldoEmpleado()*incremento.getSubida());
		return sueldoFinal;
	}
}
