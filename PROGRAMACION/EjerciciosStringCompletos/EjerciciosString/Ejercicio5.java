package EjerciciosString;

public class Ejercicio5 {

	public static void main(String[] args) {

	
	System.out.println(esPalindromo("Hola aloh"));
		
	}
	
	public static boolean esPalindromo (String palindromo) {
		palindromo=palindromo.replace(" ","").toLowerCase();
		String cadinversa= new StringBuilder(palindromo).reverse().toString();
		
		return cadinversa.equals(palindromo); 

	}

}
