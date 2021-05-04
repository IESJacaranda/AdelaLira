package ejercicio4;

import java.time.LocalDateTime;

public class PaginaWeb {

	private String url;
	private LocalDateTime fechaHistorial;
	
	
	public PaginaWeb (String url, LocalDateTime fechaHistorial) {
		this.url=url;
		this.fechaHistorial=fechaHistorial;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public LocalDateTime getFechaHistorial() {
		return fechaHistorial;
	}


	public void setFechaHistorial(LocalDateTime fechaHistorial) {
		this.fechaHistorial = fechaHistorial;
	}


	@Override
	public String toString() {
		return "PaginaWeb [url=" + url + ", fechaHistorial=" + fechaHistorial + "]";
	}
	
	
	
}
