package simulacroB;

public class EmpleadoBase extends Empleado {

	private PuestoEmpleado puesto;
	public static final double INCREMENTO_EMPLEADO = 1.025;
	
	public EmpleadoBase(String DNI, String nombre, PuestoEmpleado puesto) {
		super(DNI, nombre);
		this.puesto=puesto;
		this.sueldo=actualizarSueldo();
	}


	@Override
	public double actualizarSueldo() {
		double sueldoFinal;
		sueldoFinal=puesto.getPuesto()*INCREMENTO_EMPLEADO;
		return sueldoFinal;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", puesto " + this.puesto;
	}


	
	

}
