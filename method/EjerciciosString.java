package method;

import java.util.*;

public class EjerciciosString {
	
	public static void main(String[] args) {
		System.out.println(charactersInString("Hola mundo", 'o'));
		System.out.println(upperCaseInString("Hola mundo"));
		System.out.println(lowerCaseInString("Hola mundo"));
		
	}
		/**
		 * Este metodo devuelve el <b>numero de orurrencias<b> de una letra
		 * @param Cadena cadena de texto a comprobar
		 * @param car carracter a buscar
		 * @return numero de ocurrencias
		 */
		
		static int charactersInString (String Cadena, char car) {
			int cont=0;
			Cadena = Cadena.toLowerCase();
			car = Character.toLowerCase(car);
			
			for(int i=0; i<Cadena.length(); i++) {
				if (Cadena.charAt(i)==car) {
					cont++;
				}
			}	
			return cont;
		}
		static int CaseInString (boolean upper, String Cadena) {
			int matches = 0;
			
			for(int i=0; i<Cadena.length(); i++) {
				if (upper && Character.isUpperCase(Cadena.charAt(i))) {
					matches++;
				}
				if (!upper && Character.isLowerCase(Cadena.charAt(i))) {
					matches++;					
				}
			}	return matches;				
		}
		static int upperCaseInString (String Cadena) {
			return CaseInString(true, Cadena);
		}
		static int lowerCaseInString (String Cadena) {
			return CaseInString(false, Cadena);
		}
		static int ocurrenciasDeUnCaracter () {
			return 0;
		}
		
		public static void main (String [] args) {
			StringBuilder sb = new StringBuilder();
			sb.append("cadena de texto");
			
			String cadena = "nueva cadena de texto";
			
			for (int i=0; i<cadena.length(); i++) {
				System.out.println(cadena.charAt(index));
			}
			
			//System.out.println(cadena.charAt(0));
			//Character.isLowerCase('c');
			
			//System.out.println(ocurrenciaDeUnCaracter);
		}
		
		
		
}