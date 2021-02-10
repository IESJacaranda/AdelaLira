package EjerciciosString;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="Hola Me LLamo ADELA";
		
		System.out.println(contarMayusculas(cadena));
		}
		
		public static int contarMayusculas(String cadena) {
			int contador=0;
			for (int i=0; i<cadena.length();i++) {
				if (Character.isUpperCase(cadena.charAt(i))) {
					contador++;
				}
			}
			return contador;
		}

}
