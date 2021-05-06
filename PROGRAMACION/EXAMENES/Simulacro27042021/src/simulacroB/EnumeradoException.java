package simulacroB;

public class EnumeradoException extends Exception {
	
	public EnumeradoException() {
		super("Tiene que ser un valor que este en los enumerados: ADMINISTRATIVO, OPERARIO, CONTABLE");
	}

}
