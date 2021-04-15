package model;

public enum TipoElemento {

	ROCA('R'),
	ARBOL('A'),
	DINERO('D'),
	GEMA('G'),
	POCION('P'),
	JUGADOR_X ('X'),
	JUGADOR_Y ('Y'),
	JUGADOR_Z ('Z'),
	JUGADOR_T ('T'),
	JUGADOR_U ('U'),
	JUGADOR_W ('W')	;
	
	private char simbolo;
	
	TipoElemento (char simbolo){
		this.simbolo=simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	
}
