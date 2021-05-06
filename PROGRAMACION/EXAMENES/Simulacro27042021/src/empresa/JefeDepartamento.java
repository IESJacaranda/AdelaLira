package empresa;

public class JefeDepartamento extends Empleado {
	
	private int antiguedad;

	public JefeDepartamento(String DNI, String nombre, double sueldo) {
		super(DNI, nombre, sueldo);
		this.antiguedad=antiguedad; 
	}

	@Override
	public double ActualizableSueldo() throws JefeDepartamentoSueldoException {
		double sueldoFinal=0.0;
		if(sueldo>=1300) {
			sueldoFinal=(sueldo*(1.10*antiguedad));
		}
		else {
			throw new JefeDepartamentoSueldoException();
		}
		return sueldoFinal;
	}
	
	
	
}
