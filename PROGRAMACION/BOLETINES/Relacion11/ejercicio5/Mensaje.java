package ejercicio5;

import java.time.LocalDateTime;

public class Mensaje {

	private Persona persona;
	private String texto;
	private LocalDateTime fecha;
	public Mensaje(Persona persona, String texto, LocalDateTime fecha) {
		this.persona = persona;
		this.texto = texto;
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "de " + persona + " Texto: " + texto + " Fecha y hora: " + fecha + "]";
	}

	
	
	
	
}
