package ejercicio1;

public enum Tipo {

	FOTOVOLCAICO(1),
	TERMICO(2),
	HIBRIDO(3);
	
	private int tipo;
	
	Tipo (int tipo){
		this.tipo=tipo;
	}

	public int getTipo() {
		return tipo;
	}

	
	
}
