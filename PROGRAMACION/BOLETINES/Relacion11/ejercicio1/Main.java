package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws AlumnoYaExisteException, AlumnoNoExisteException {
		
		Equipo equipo = new Equipo("Madrid");
		Alumno alumno4 = new Alumno("Leticia","24657244s");
		
		equipo.addAlumno(new Alumno("Paco","248757257H"));
		equipo.addAlumno(new Alumno("Antonia","24857257744t"));
		equipo.addAlumno(new Alumno("Sara","2785722144g"));
		equipo.listarEquipo();
		equipo.perteneceEquipo(new Alumno("Paco","248757257H")); //¿porque no lo coge?
		equipo.removeAlumno(new Alumno("Antonia","24857257744t"));
		System.out.println(equipo);
//		equipo.listarEquipo();
		
		Equipo equipo2 = new Equipo("Barcelona");
		Alumno alumno5 = new Alumno("Tonny","2424242144g");
		Alumno alumno6 = new Alumno("Tomas","244248144y");
		Alumno alumno7 = new Alumno("Pedro","2486799744p");
		Alumno alumno8 = new Alumno("Juan","5445412144o");
		Alumno alumno9 = new Alumno("Cintia","24875988434j");
		
		
		ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
		
		alumnos2.add(alumno5);
		alumnos2.add(alumno6);
		alumnos2.add(alumno7);
	
		equipo2.unirEquipos(equipo2);

		System.out.println("------------------EQUIPO GÉNERICO-------------------");
		EquipoGenerico<Alumno>equipo3 = new EquipoGenerico<Alumno>("Manchester");
		EquipoGenerico<Alumno>equipo4 = new EquipoGenerico<Alumno>("Sevilla");
		
		equipo3.addAlumno(new Alumno("Paco","248757257H"));
		equipo3.addAlumno(new Alumno("Antonia","24857257744t"));
		equipo3.addAlumno(new Alumno("Sara","2785722144g"));
		equipo3.listarEquipo();
		equipo3.perteneceEquipo(new Alumno("Paco","248757257H")); //¿porque no lo coge?
		equipo3.removeAlumno(new Alumno("Antonia","24857257744t"));
		System.out.println(equipo);
		

	}

	
}
