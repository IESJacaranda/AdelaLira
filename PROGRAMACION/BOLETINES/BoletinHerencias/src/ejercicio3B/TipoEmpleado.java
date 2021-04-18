package ejercicio3B;

public enum TipoEmpleado {

	TEMPORAL('T'),
	HORAS('H'),
	FIJO('F');
	
	private char simbolo;
	
	TipoEmpleado (char simbolo){
		this.simbolo=simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
