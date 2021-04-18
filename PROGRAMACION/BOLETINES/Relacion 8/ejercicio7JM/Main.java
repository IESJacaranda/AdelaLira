package ejercicio7JM;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Clase primeroB = new Clase();
		
		//INTRODUCE ALUMNOS
		primeroB.addAlumno(new Alumno ("Adela","L", "S", 7.0));
		primeroB.addAlumno(new Alumno ("Rafa","C", "S", 7.0));
		primeroB.addAlumno(new Alumno ("Alberto","C", "S", 4.7));
		primeroB.addAlumno(new Alumno ("Enrique","C", "S", 3.0));
		primeroB.addAlumno(new Alumno ("Juan","C", "S", 3.7));
		primeroB.addAlumno(new Alumno ("Carla","C", "S", 9.7));
		
		
		//LLAMA AL COMPARETO (ESTA EN ALUMNOS)
		Collections.sort(primeroB.getAlumnos()); //ORDENA LOS SIGUIENTES METODOS
		
		
		primeroB.getAlumnos().get(primeroB.getAlumnos().size()-1);
		//System.out.println(primeroB);
		
		System.out.println(primeroB.getAlumnosAprobados());
		System.out.println(primeroB.getAlumnosSuspensos());
		System.out.println("La nota media es " + primeroB.getNotaMediaClase());
	}

}
