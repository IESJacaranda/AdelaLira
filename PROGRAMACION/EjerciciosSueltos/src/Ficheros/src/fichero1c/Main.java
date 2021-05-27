package fichero1c;

public class Main {

	public static void main(String[] args) {
		try {
			Listas lista = new Listas(".\\ContenedorFicheros\\country.txt", ".\\ContenedorFicheros\\city.txt", ".\\ContenedorFicheros\\address2.txt");
			System.out.println(lista);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
