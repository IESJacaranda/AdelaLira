package ejercicio2;

public enum PrecioAlquiler {

	GAMA_BAJA(30),
	GAMA_MEDIA(40),
	GAME_ALTA(50);
	
	private double precio;
	
	public double getPrecio() {
		return precio;
	}

	PrecioAlquiler ( double precio) {
		this.precio=precio;
	}
	
	
}
