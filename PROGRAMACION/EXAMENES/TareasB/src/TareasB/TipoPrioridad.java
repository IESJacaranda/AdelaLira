package TareasB;

public enum TipoPrioridad {
	
	ALTA(24), MEDIA(72), BAJA(168);
	
	private int tiempo;
	
	TipoPrioridad(int tiempo) {
		this.tiempo=tiempo;
	}

	public int getTiempo() {
		return tiempo;
	}
	
	
	
	
}
