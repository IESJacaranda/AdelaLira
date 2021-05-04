package ejemploSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ciudades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

		public static Collection <String> creaCiudades(){
			Set <String> ciudades = new HashSet<String>();
			ciudades.add("Madrid");
			ciudades.add("Barcelona");
			ciudades.add("Madrid");
			ciudades.add("Sevilla");

			return ciudades;
	}
		

	public static void pruebaCiudades() {
		List<String> ciudades = List.of("Sevilla" , "Madrid");
	}
	
	public static void recorreCiudades (Collection <String> elementos) {
		for (String c : elementos) {
			System.out.println(c);
		}
		Iterator <String> iterador = elementos.iterator(); //recorre
	
		while(iterador.hasNext()) { //Si hay elemento despues del actual sigue
			String ciudad = iterador.next(); //elemento siguiente
			System.out.println(ciudad);
			
		}
		
	}
}
