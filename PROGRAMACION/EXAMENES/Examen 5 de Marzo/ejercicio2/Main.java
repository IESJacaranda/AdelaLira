package ejercicio2;

public class Main {

	public static void main(String[] args) {

		Frases frase = new Frases("murcielago", "lago");
		System.out.println(frase.comprobarPalabra());
		
		Frases frase2 = new Frases ("perro","rota");
		System.out.println(frase2.comprobarPalabra());

	}

}
