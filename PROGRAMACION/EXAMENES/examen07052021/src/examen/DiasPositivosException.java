package examen;

public class DiasPositivosException extends Exception {

	public DiasPositivosException() {
		super("La fecha que has introducido es posterior a la fecha de hoy, no es posible realizar esta operación");
	}
}
