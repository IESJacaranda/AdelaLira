package simulacroB;

public class JefeDepartamento extends Empleado {
	
	private int antiguedad;	
	public static final double INCREMENTO_JEFE = 1.10;

	
	public JefeDepartamento(String DNI, String nombre,int antiguedad) throws SueldoMenorException{
		super(DNI, nombre);
		this.antiguedad=antiguedad;
		if(sueldo<1300) {
			throw new SueldoMenorException();
		}
		else {
			super.sueldo=actualizarSueldo();
		}
	}

	@Override
	public double actualizarSueldo() {
		double sueldoFinal;
		double sueldo=1350;
		sueldoFinal=antiguedad*(sueldo*INCREMENTO_JEFE);
		return sueldoFinal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", antiguedad " + this.antiguedad;
	}
	
	

}
