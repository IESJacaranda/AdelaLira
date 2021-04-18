package EjerciciosString;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reemplazaPalabra("Hola caracola", "caracola", "holiwis"));
		
	}
	
	public static String reemplazaPalabra (String cadena, String palabra, String nuevaPalabra) {
		return cadena.replace(palabra, nuevaPalabra);
	}
	
	
	
}
