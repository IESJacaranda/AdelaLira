package ejercicio2;

public class Deportivo extends Barco {

	private double potencia;
	
	public Deportivo (int matricula, double eslora, int anioFabricacion,double potencia) {
		super(matricula, eslora, anioFabricacion);
		this.potencia=potencia;
	}
	

	@Override
	public double calcularPrecioEspecial() {
		double porcentaje = 0.0;
		
		porcentaje = this.potencia+(eslora*10)*20;
		
		return porcentaje;
		
	}
	
}
