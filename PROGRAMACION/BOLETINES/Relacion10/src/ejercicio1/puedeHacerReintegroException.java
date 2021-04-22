package ejercicio1;

public class puedeHacerReintegroException extends Exception {

	public puedeHacerReintegroException() {
		super("No se puede realizar el reintegro, su saldo y credito no es suficiente");
	}
	
	
}
