package EjerciciosString;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String cadena="86 veces me cai, y 14 me levante";

	System.out.println(contarNumeros(cadena));
	
	}

	public static int contarNumeros (String cadena) {
		int contador=0;
		for (int i=0; i<cadena.length();i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				contador++;
			}
		}
		return contador;
		
	}
}
