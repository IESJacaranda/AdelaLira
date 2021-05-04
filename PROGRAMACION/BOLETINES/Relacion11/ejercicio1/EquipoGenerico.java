package ejercicio1;

import java.util.HashSet;

public class EquipoGenerico<T>{
	
	private String nombreEquipo;
	private HashSet<T> lista;
	
	public EquipoGenerico() {
		lista = new HashSet<T>();
	}
	
	public EquipoGenerico (String nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
		lista=new HashSet<T>();
	}
	
	//A�adir un alumno (recibe como par�metro el objeto alumno a insertar). Si el
	//alumno ya existe en el equipo debe saltar una excepci�n.
	public void addAlumno(T al) throws AlumnoYaExisteException{
		
		if(lista.contains(al)) {
			throw new AlumnoYaExisteException();
		}
		else {
			lista.add(al);
			System.out.println("El alumno ha sido a�adido");
		}
		
//		SOLUCION INMA
//		boolean encontrado = this.alumnos.add(alumno);
//		if(!encontrado) {
//			throw new Exception("Alumno existente");
//		}
//		return encontrado;

		
	}
	
//	Borrar un alumno (recibe como par�metro el objeto alumno a borrar). Si el
//	alumno no existe en el equipo debe saltar una excepci�n.
	public void removeAlumno(T al) throws AlumnoNoExisteException {
		
		if(lista.contains(al)) {
			lista.remove(al);
			System.out.println("El alumno ha sido eliminado");
		}
		else {
			throw new AlumnoNoExisteException();
		}
		
//		SOLUCION INMA
//		if(!this.alumnos.remove(alumno);) {
//			throw new Exception("Alumno existente");
//		}
//		return encontrado;
	}
	
//	Saber si un alumno pertenece al equipo. Recibe como par�metro el objeto
//	alumno a buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
	public String perteneceEquipo(Alumno alumno) {
		String perteceneAlEquipo;
		if(lista.contains(alumno)) {
			perteceneAlEquipo=alumno.toString();
			System.out.println("El alumno ya esta en el equipo");
		}
		else {
			perteceneAlEquipo= "";
			System.out.println("El alumno no esta en el equipo");
		}
		return perteceneAlEquipo;
	}
	
	//Mostrar en pantalla la lista de personas del equipo.
	public void listarEquipo() {
		
		StringBuilder sb = new StringBuilder();
		
		for(T i : lista) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}
	
//	Uni�n de equipos. El m�todo lo llamar� un equipo y se le pasar� por par�metro
//	el otro equipo con el que se quiere unir. Devuelve un equipo formado por los
//	alumnos de ambos equipos.
	public EquipoGenerico<T> unirEquipos(EquipoGenerico<T>  equipo) throws AlumnoYaExisteException {
		EquipoGenerico<T>  nuevo = new EquipoGenerico<T>();

		for (T alumno : lista) {
			nuevo.addAlumno(alumno);
		}
		
		for (T alumno2 : equipo.lista) {
			nuevo.addAlumno(alumno2);
		}
		
		return nuevo;

	

	}
	
//	Intersecci�n de equipos. Idem al anterior pero devuelve un equipo formado por
//	los alumnos que est�n en los dos equipos
	public EquipoGenerico<T> insertaEquipos(EquipoGenerico<T> e2) throws AlumnoYaExisteException {
		EquipoGenerico<T> nuevo = new EquipoGenerico<T>();
		for (T alumno : lista) {
			if(e2.lista.contains(alumno)) {
				nuevo.addAlumno(alumno);
			}
		}
		return nuevo;
	}

	public int getTotal() {
		int result = 0;
		for (T alumno : lista) {
			result += ((sumable) alumno).getCantidad();
		}
		return result;
	}
	
	
	
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", alumnos=" + lista + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
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
		Equipo other = (Equipo) obj;
		if (nombreEquipo == null) {
			if (other.nombreEquipo != null)
				return false;
		} else if (!nombreEquipo.equals(other.nombreEquipo))
			return false;
		return true;
	}
	
	
	
}
