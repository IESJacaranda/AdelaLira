package EjerciciosString;

public class Ejercicio10 {
	
	private String frase;

	public Ejercicio10 (String frase) {
		this.frase =frase;
	}
	
	public int contarPalabras () {
		int numeroPalabras=0;
		
		this.frase=this.frase.trim(); //quitamos los espacios iniciales y finales
		while (this.frase!=this.frase.replace("  "," ")) {
			this.frase=this.frase.replace("  "," "); //quitamos los espacios intermedios sobrantes
			//esto lo hacemos en bucle para que se elimine mas de dos espacios
		}
		
		for (int i=0;i<this.frase.length();i++) { //hacemos que en cada espacio cuente una palabra
			if (this.frase.charAt(i)== ' ') {
				numeroPalabras++;
			}
		}
		
		return numeroPalabras+1; //tambien podriamos poner "return this.frase.split(" ").length;
	}
}
	
