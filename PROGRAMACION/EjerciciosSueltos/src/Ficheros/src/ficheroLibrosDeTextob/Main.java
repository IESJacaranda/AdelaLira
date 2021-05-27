package ficheroLibrosDeTextob;

public class Main {

	public static void main(String[] args) {
		try {
			Listas provincias = new Listas(".\\contenedorFicheros2\\gratuidadlibrosdetextoandalucia.csv");
			System.out.println(provincias);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
