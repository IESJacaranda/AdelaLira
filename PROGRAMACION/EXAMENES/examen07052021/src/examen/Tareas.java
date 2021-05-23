package examen;

import java.time.LocalDate;

public abstract class Tareas implements Temporizable {

	//Con este codigoGenerador creamos un codigo automatico y secuencial, pues cuando se crea una nueva tarea le suma un numero mas al codigo anterior
	//despues en el constructor le decimos que el codigo es codigoGenerador++ para incrementarlo.
	protected static int codigoGenerador =1;
	protected int codigo;
	protected LocalDate fechaInicio;
	protected String descripcion;
	protected TipoPrioridad prioridad;
	protected LocalDate fechaSolucion;

	public Tareas(LocalDate fechaInicio, String descripcion) {
		this.fechaInicio = fechaInicio;
		this.descripcion = descripcion;
		this.codigo=codigoGenerador++;
	}

	public TipoPrioridad getPrioridad() {
		return prioridad;
	}






	
	//El hashCode y el Equals se han realizado para poder compara los elementos, ya que nos dice el enunciado que dos elementos son iguales si tienen 
	//la misma descripcion y fecha de inicio, por eso de ambos he eliminado el codigo, pues el codigo siempre es distinto.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
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
		Tareas other = (Tareas) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		return true;
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	@Override
	public int numeroDias(LocalDate fecha) throws DiasPositivosException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	//El toString es necerario para imprimir los atributos en la lista, por ejemplo en el mostrarTareas()
	@Override
	public String toString() {
		return "Codigo: " + codigo + ", fechaInicio: " + fechaInicio + ", descripcion: " + descripcion;
	}

	public LocalDate getFechaSolucion() {
		return fechaSolucion;
	}

	public void setFechaSolucion(LocalDate fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}




	
	
	
	
	
	
}
