package EjerciciosString;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String cadena="Hola me llamo Adela y me gusta jugar a minecraft";
	int contador=0;
	char letrita='A';
	
	cadena=cadena.toUpperCase();
	
	for (int i=0; i<cadena.length(); i++) {
		if (cadena.charAt(i)==letrita) {
			contador++;
		}
	}
	
	System.out.println(contador);
	}

}
