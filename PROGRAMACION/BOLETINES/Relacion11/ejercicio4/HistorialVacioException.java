package ejercicio4;

public class HistorialVacioException extends Exception {
	
	public HistorialVacioException() {
		super("No puedes eliminar el historial, ya esta vacio");
	}

}
