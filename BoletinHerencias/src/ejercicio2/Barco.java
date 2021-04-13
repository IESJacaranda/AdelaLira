package ejercicio2;

public abstract class Barco {

	private int matricula;
	protected double eslora;
	private int anioFabricacion;
	
	public Barco() {
		super();
	}
	
	public Barco (int matricula, double eslora, int anioFabricacion) {
		this();
		this.matricula=matricula;
		this.eslora=eslora;
		this.anioFabricacion=anioFabricacion;
		
	}

	public abstract double calcularPrecioEspecial();
	
}
