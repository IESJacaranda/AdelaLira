package empresa;

public class Administrativo extends EmpleadoBase {

	private SueldoEmpleadosBase sueldoEmpleadosBase;
	private Incremento incremento;

	public Administrativo(String DNI, String nombre, double sueldo) {
		super(DNI, nombre, sueldo);//¿Se puede quitar sueldo para que sea sueldoFinal?
		this.sueldoEmpleadosBase=SueldoEmpleadosBase.ADMINISTRATIVO;
		this.incremento=Incremento.EMPLEADO_BASE;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double ActualizableSueldo() {
		double sueldoFinal;
		sueldoFinal= (sueldoEmpleadosBase.getSueldoEmpleado()*incremento.getSubida());
		return sueldoFinal;
	}




	
	

}
