package ejercicio1;

public class AlumnoNoExisteException extends Exception {

	public AlumnoNoExisteException() {
		super("Este alumno no se encuentra en la base de datos");
	}
	
}
