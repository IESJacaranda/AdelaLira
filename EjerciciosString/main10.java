package EjerciciosString;

public class main10 {

	public static void main(String[] args) {
		
		Ejercicio10 frase = new Ejercicio10 ("He estudiado mucho");
		System.out.println(frase.contarPalabras());
		
		Ejercicio10 frase2 = new Ejercicio10 ("  Que  buen dia  hace hoy  ");
		System.out.println(frase2.contarPalabras());

		//Con lo siguiente puede indicarnos el numero que hay anteriormente al señalado
		String texto="Son las 9 de la mañana";
		System.out.println(texto.indexOf('9'));
		//la funcion substring nos va imprimir despues de ese lugar
		System.out.println(texto.substring(3));
	}

}
