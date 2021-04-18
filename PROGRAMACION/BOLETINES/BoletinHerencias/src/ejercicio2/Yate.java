package ejercicio2;

public class Yate extends Barco {

	private double potencia;
	private int camarotes;
	
	public Yate (int matricula, double eslora, int anioFabricacion,double potencia, int camarotes) {
		super(matricula, eslora, anioFabricacion);
		this.potencia=potencia;
		this.camarotes=camarotes;
	}
	
	@Override
	public double calcularPrecioEspecial() {
		double porcentaje = 0.0;
		
		porcentaje = this.camarotes+this.potencia+(eslora*10)*20;
		
		return porcentaje;
		
	}	
}
