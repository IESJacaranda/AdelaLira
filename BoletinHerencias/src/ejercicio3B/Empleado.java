package ejercicio3B;

public abstract class Empleado {

	private String nombre;
	private int edad;
	private String NIF;
	private double sueldo;
	
	public Empleado(String nombre, int edad, String NIF, double sueldo) {
		this.nombre=nombre;
		this.edad=edad;
		this.NIF=NIF;
		this.sueldo=sueldo;
	}
	
	public abstract double calculaSueldo();
	
}
