package method;

public class Ejercicio4 {

	public static void main (String [] args) {
		System.out.println(numbersInString("Hola, son las 09:14 horas"));
	}
		
	static int numbersInString(String cadena) {
		int contador = 0;
		for (int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isDigit(c)) {
				contador++;
			}
		}
		
		return contador;
	}

}
