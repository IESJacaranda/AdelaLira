package ejercicio3B;

public class Temporal extends Empleado {

	public Temporal(String nombre, int edad, String NIF, double sueldo) {
		super(nombre, edad, NIF, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSueldo() {
		return sueldo;
	}

}
