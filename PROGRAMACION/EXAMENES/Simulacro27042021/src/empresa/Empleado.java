package empresa;

public class Empleado implements Sueldo {
	
	protected String DNI;
	protected String nombre;
	protected double sueldo;

	public Empleado() {
		super();
	}
	
	public Empleado(String DNI, String nombre, double sueldo) {
		this();
		this.DNI=DNI;
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
	@Override
	public double ActualizableSueldo() {
		return sueldo;
		// TODO Auto-generated method stub
		
	}

}
