package ejercicio1;

import java.time.LocalDate;

public class GeneradorEolico extends Generador {

	private int numeroAspas;
	
	public GeneradorEolico(int codigo, LocalDate fecha, String localidad, double potencia, int numeroAspas) {
		super(codigo, fecha, localidad, potencia);
		this.numeroAspas=numeroAspas;
		this.codigo=CONTADOR_CODIGO;
		CONTADOR_CODIGO++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double dinero() {
		double coste = 0.0;
		coste= potencia * numeroAspas;		
		return coste;
	}

	@Override
	public String toString() {
		
		return super.toString() + " numeroAspas= " + numeroAspas;
	}


	
	

	
	
	
}
