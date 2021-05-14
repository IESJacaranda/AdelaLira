package fichero1;

public class Main {

	public static void main(String[] args) {
		
		try {
			ListaPaises paises = new ListaPaises("./contenedorFicheros/country.txt", "./contenedorFicheros/City.txt","./contenedorFicheros/address2.txt");
			System.out.println(paises);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
