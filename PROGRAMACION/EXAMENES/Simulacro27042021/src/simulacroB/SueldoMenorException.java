package simulacroB;

public class SueldoMenorException extends Exception {

	public SueldoMenorException() {
		super("El sueldo debe ser igual o mayor a 1300");
	}
	
}
