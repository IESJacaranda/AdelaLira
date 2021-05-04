package ejercicio1;

public class AlumnoYaExisteException extends Exception {
	
	public AlumnoYaExisteException() {
		super("El alumno ya existe dentro del equipo");
	}

}
