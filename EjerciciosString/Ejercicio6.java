package EjerciciosString;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(palabraPerdida("shybaoxlna", "hola"));
	}
	
	public static boolean palabraPerdida (String cadena, String palabra) {
		int contador=0;
		if (cadena.length()>=palabra.length()) {
			for (int i=0; i<cadena.length();i++) {
				cadena=cadena.toLowerCase();
				if (contador<palabra.length() && cadena.toLowerCase().charAt(i)==palabra.toLowerCase().charAt(contador)) {
					contador++;
				}
					
			}
		}
		
		return contador==palabra.length();
	}

}
