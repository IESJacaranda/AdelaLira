package generadoresB;

import java.time.LocalDate;

public class GeneradorEolico extends Generadores {

	private int numeroAspas;

	public GeneradorEolico(LocalDate fechaComienzo, String localidad, double potencia,int numeroAspas) {
		super(fechaComienzo, localidad, potencia);
		this.numeroAspas = numeroAspas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " numero de aspas: " + numeroAspas;
	}

	@Override
	public double dinero(double precioEnergia) {
		double precioFinal;
		precioFinal=potencia*numeroAspas*precioEnergia;
		return precioFinal;
	}


	
	
	
	
	
	
	
}
