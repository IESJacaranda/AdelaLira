package EjerciciosString;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String cadena="Hola Me LLamo ADELA";
	
	System.out.println(contarMinusculas(cadena));
	}
	
	public static int contarMinusculas(String cadena) {
		int contador=0;
		for (int i=0; i<cadena.length();i++) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}
}
