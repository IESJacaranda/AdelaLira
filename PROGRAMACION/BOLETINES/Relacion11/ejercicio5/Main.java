package ejercicio5;

public class Main {

	public static void main(String[] args) {

		Profesor profesor = new Profesor("Dolores","5845135K");
		
		
		
		profesor.enviarMensajes(new Alumno("Dimitri", "284658H", 20), "Tienes un 5");
		profesor.enviarMensajes(new Alumno ("Beniito","845167H",16), "Tienes un 7");
		profesor.enviarMensajes(new Alumno ("Isidoro","845167H",16), "Tienes un 7");
		profesor.leerMensajes();
		

	}

}
