package generadoresB;

import java.time.LocalDate;

public class GeneradorSolar extends Generadores {

	private int numeroPaneles;
	private int metrosCuadrados;
	private TipoGenerador tipo;
	
	
	public GeneradorSolar(LocalDate fechaComienzo, String localidad, double potencia, int numeroPaneles, int metrosCuadrados, String tipo) {
		super(fechaComienzo, localidad, potencia);
		this.numeroPaneles = numeroPaneles;
		this.metrosCuadrados = metrosCuadrados;
		this.tipo = TipoGenerador.valueOf(tipo.toUpperCase());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " tipo: " + tipo + " coeficiente solar: " + metrosCuadrados/numeroPaneles;
	}

	@Override
	public double dinero(double precioEnergia) {
		double precioFinal;
		precioFinal=potencia*numeroPaneles*precioEnergia;
		return precioFinal;
	}
	

	
	
	
	
}
