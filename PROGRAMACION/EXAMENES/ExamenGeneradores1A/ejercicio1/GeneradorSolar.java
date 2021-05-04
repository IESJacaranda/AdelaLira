package ejercicio1;

import java.time.LocalDate;

public class GeneradorSolar extends Generador {
	
	private int numeroPaneles;
	private double metros;
	private Tipo tipo;

	public GeneradorSolar(int codigo, LocalDate fecha, String localidad, double potencia, int numeroPaneles, double metros, String tipo) {
		super(codigo, fecha, localidad, potencia);
		this.numeroPaneles=numeroPaneles;
		this.metros=metros;

		tipo.toUpperCase();
		if(tipo == "FOTOVOLCAICO") {
			this.tipo=Tipo.FOTOVOLCAICO;
		}else if(tipo == "TERMICO") {
			this.tipo=Tipo.TERMICO;
		}else if(tipo == "HIBRIDO") {
			this.tipo=Tipo.HIBRIDO;
		}
		
		this.codigo=CONTADOR_CODIGO;
		CONTADOR_CODIGO++;
		// TODO Auto-generated constructor stub
	}


	@Override
	public double dinero() {
		double coste = 0.0;
		coste= potencia * numeroPaneles;		
		return coste;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "numeroPaneles=" + numeroPaneles + ", metros=" + metros + ", tipo=" + this.tipo +
				"coeficiente solar: " + metros/numeroPaneles; 
	}



	
	
	
}
