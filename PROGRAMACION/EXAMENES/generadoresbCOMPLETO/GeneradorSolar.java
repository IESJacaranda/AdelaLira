package generadoresb;

import java.time.LocalDate;

public class GeneradorSolar extends Generador {
	
	private int numeroPaneles;
	private int metrosCuadrados;
	private TipoGenerador tipo;

	public GeneradorSolar(LocalDate fechaInicio, String localidad, double potencia, TipoGenerador tipo, int numeroPaneles, int metrosCuadrados) {
		super(fechaInicio, localidad, potencia);
		this.numeroPaneles=numeroPaneles;
		this.metrosCuadrados=metrosCuadrados;
		this.tipo=tipo;
	}

	@Override
	public double precio(double precioEnergia) {
		double precioFinal;
		precioFinal=potencia*numeroPaneles*precioEnergia;
		return  precioFinal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", tipo: " + tipo + ", coeficiente solar: " + metrosCuadrados/numeroPaneles;
	}
	
	

}
