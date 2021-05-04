package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class Equipo {
	
	String nombreEquipo;
	private HashSet<Alumno> alumnos;
	

	public Equipo(String nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
		this.alumnos=new HashSet<Alumno>();
	}
	
	//Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el
	//alumno ya existe en el equipo debe saltar una excepción.
	public void addAlumno(Alumno alumno) throws AlumnoYaExisteException{
		
		if(alumnos.contains(alumno)) {
			throw new AlumnoYaExisteException();
		}
		else {
			alumnos.add(alumno);
			System.out.println("El alumno ha sido añadido");
		}
		
//		SOLUCION INMA
//		boolean encontrado = this.alumnos.add(alumno);
//		if(!encontrado) {
//			throw new Exception("Alumno existente");
//		}
//		return encontrado;

		
	}
	
//	Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
//	alumno no existe en el equipo debe saltar una excepción.
	public void removeAlumno(Alumno alumno) throws AlumnoNoExisteException {
		
		if(alumnos.contains(alumno)) {
			alumnos.remove(alumno);
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
	
//	Saber si un alumno pertenece al equipo. Recibe como parámetro el objeto
//	alumno a buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
	public String perteneceEquipo(Alumno alumno) {
		String perteceneAlEquipo;
		if(alumnos.contains(alumno)) {
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
		
		for(Alumno i : alumnos) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}
	
//	Unión de equipos. El método lo llamará un equipo y se le pasará por parámetro
//	el otro equipo con el que se quiere unir. Devuelve un equipo formado por los
//	alumnos de ambos equipos.
	public Equipo unirEquipos(Equipo equipo) throws AlumnoYaExisteException {
//		StringBuilder equiposUnidos = new StringBuilder();
//		
//		for (int i = 0; i < alumnos.size(); i++) {
//			equiposUnidos.append(i);
//		}
//		for (int i = 0; i < equipo.; i++) {
//			equiposUnidos.append(i);
//		}
		
		Equipo  nuevo = new Equipo("Giblaltar");

		for (Alumno alumno : alumnos) {
			nuevo.addAlumno(alumno);
		}
		
		for (Alumno alumno : equipo.alumnos) {
			nuevo.addAlumno(alumno);
		}
		
		return nuevo;
		
//		for (Alumno alumno : alumnos) {
//			nuevo.añadirAlumno(alumno);
//		}
	
//		System.out.println(equiposUnidos.toString());
	}
	
//	Intersección de equipos. Idem al anterior pero devuelve un equipo formado por
//	los alumnos que están en los dos equipos
	public void insertaEquipos() {
		//RETAINALL
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", alumnos=" + alumnos + "]";
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
