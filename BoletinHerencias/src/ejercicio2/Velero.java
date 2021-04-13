package ejercicio2;

public class Velero extends Barco {

	private int numeroMastiles;
	
	public Velero (int matricula, double eslora, int anioFabricacion,int numeroMastiles) {
		super(matricula, eslora, anioFabricacion);
		this.numeroMastiles=numeroMastiles;
	}

	@Override
	public double calcularPrecioEspecial() {
		double porcentaje = 0.0;
		
		porcentaje = this.numeroMastiles+(eslora*10)*20;
		
		return porcentaje;
		
	}
	

	
}
