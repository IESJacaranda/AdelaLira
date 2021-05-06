package ejercicio5b;

import java.time.LocalDateTime;

public class Mensaje {

	private String remitente;
	private String texto;
	private LocalDateTime hora;
	
	public Mensaje(String remitente, String texto, LocalDateTime hora) {
		this.remitente=remitente;
		this.texto=texto;
		this.hora=hora;
	}

	@Override
	public String toString() {
		return "Mensaje X: De: " + remitente + ", Texto: " + texto + ", Fecha y hora: " + hora;
	}
	


	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	
	
}
