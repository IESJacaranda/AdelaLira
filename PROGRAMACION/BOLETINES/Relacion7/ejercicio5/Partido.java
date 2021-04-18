package ejercicio5;

public class Partido {
	
	private static String local;
	private static String visitante;
	private static int jornada;
	private static String numeroGoles;
	
		public Partido(String local, String visitante, int jornada, String numeroGoles) {
		this.local=local;
		this.visitante=visitante;
		this.jornada=jornada;
		this.numeroGoles=numeroGoles;
	}

	
	public String ponerResultado() {
		return "";	
	}
	
	//TOSTRING
}
