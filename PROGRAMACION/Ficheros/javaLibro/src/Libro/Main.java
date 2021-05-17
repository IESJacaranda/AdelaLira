package Libro;

public class Main {

	public static void main(String[] args) {
		try {
			Lista provincias = new Lista(".\\contenedorFicheros2\\gratuidadlibrosdetextoandalucia.csv");
			System.out.println(provincias);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
