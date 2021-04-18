package EjerciciosString;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra="amarillo";
		System.out.println(buscaVocales(palabra));
	}
		
	public static int buscaVocales (String palabra) {
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		for (int i=0; i<palabra.length();i++) {
			if(palabra.toLowerCase().charAt(i)=='a') {
				contadorA=1;
			}
			else if(palabra.toLowerCase().charAt(i)=='e') {
				contadorE=1;
			}
			else if(palabra.toLowerCase().charAt(i)=='i') {
				contadorI=1;
			}
			else if(palabra.toLowerCase().charAt(i)=='o') {
				contadorO=1;
			}
			else if(palabra.toLowerCase().charAt(i)=='u') {
				contadorU=1;
			}
		}
		
		
		return contadorA+contadorE+contadorI+contadorO+contadorU;
		
	}
	

}
