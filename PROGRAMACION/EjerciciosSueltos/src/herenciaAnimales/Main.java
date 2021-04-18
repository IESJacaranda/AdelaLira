package herenciaAnimales;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----ANIMAL----");
		Animal animal = new Animal ();
		animal.comportamiento();
		animal.necesidades();
		
		System.out.println("----FELINO----");
		Felino felino = new Felino ();
		felino.comportamiento();
		felino.necesidades();
		
		System.out.println("----GATO----");
		Gato gato = new Gato ();
		gato.comportamiento();
		gato.necesidades();
		
		System.out.println("----HAMSTER----");
		Hamster hamster = new Hamster ();
		hamster.comportamiento();
		hamster.necesidades();
		
		System.out.println("----TIGRE----");
		Tigre tigre = new Tigre ();
		tigre.comportamiento();
		tigre.necesidades();
		
		
		
		
		
		
	}
}
