package generadoresb;

import java.time.LocalDate;

public class GeneradorEolico extends Generador {
	
	private int numeroAspas;

	public GeneradorEolico(LocalDate fechaInicio, String localidad, double potencia, int numeroAspas) {
		super(fechaInicio, localidad, potencia);
		this.numeroAspas=numeroAspas;
	}

	@Override
	public double precio(double precioEnergia) {
		double precioFinal;
		precioFinal=potencia*numeroAspas*precioEnergia;
		return  precioFinal;
	}

	@Override
	public String toString() {
		return super.toString() + ", numero de Aspas: " + numeroAspas;
	}
	
	

}
