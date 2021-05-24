package TareasB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Tarea implements Temporizable{

	public static int codigoIncrementador = 1;
	
	private String descripcion;
	protected LocalDate fechaAlta; //= LocalDate.now();
	private LocalDate fechaSolucion;
	private TipoPrioridad prioridad;
	private int codigo;
	
	public Tarea(String descripcion, LocalDate fechaAlta, String prioridad) {
		super();
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.prioridad = TipoPrioridad.valueOf(prioridad.toUpperCase());
		this.codigo = codigoIncrementador++;
	}
	
	
	
	public LocalDate getFechaSolucion() {
		return fechaSolucion;
	}

	public void setFechaSolucion(LocalDate fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public TipoPrioridad getPrioridad() {
		return prioridad;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
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
		Tarea other = (Tarea) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		return true;
	}



	@Override
	public int numDias(LocalDate fecha) {
		int diasTranscurridos=0;
		
		diasTranscurridos=(int)ChronoUnit.DAYS.between(fechaAlta, fecha);
		if(diasTranscurridos<0) {
			diasTranscurridos=0-diasTranscurridos; //Esto lo vuelve positivo si es negativo
		}
		return diasTranscurridos;
	}


	//¿NECESITA FECHA DE SOLUCION?
	@Override
	public String toString() {
		String descripcion = " ";
		if(fechaSolucion==null) {
			descripcion= "Tarea [descripcion=" + descripcion + ", fechaAlta=" + fechaAlta + ", prioridad=" + prioridad + ", codigo=" + codigo + "]";
		}
		else {
			descripcion = "Tarea [descripcion=" + descripcion + ", fechaAlta=" + fechaAlta + ", fechaSolucion=" + fechaSolucion
					+ ", prioridad=" + prioridad + ", codigo=" + codigo + "]";
		}
		
		return descripcion;
	}
	
	
	
	
	
	
	
	
}
