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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaHistorial == null) ? 0 : fechaHistorial.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		if (fechaHistorial == null) {
			if (other.fechaHistorial != null)
				return false;
		} else if (!fechaHistorial.equals(other.fechaHistorial))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	
	
}
