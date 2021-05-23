package generadoresB;

public class ExceptionFechaAnterior extends Exception {

	public ExceptionFechaAnterior() {
		super("La fecha de la solucion es anterior a la fecha de alta");
	}
	
}
