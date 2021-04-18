package ejercicio3B;

public class Horas extends Empleado {

	private double sueldoPorHoras=8;
	private int numeroHoras=80;
	
	public Horas(String nombre, int edad, String NIF, double sueldo) {
		super(nombre, edad, NIF, sueldo);
	}

	@Override
	public double calculaSueldo() {
		return sueldoPorHoras*numeroHoras;
	}

}
