package ejercicio3JM;

public class AritmeticaArrays {
	
	private int [] contadorDigitos = new int [10];

	public AritmeticaArrays() {
		
	}
	
	// 0 1 2 3 4 5 6 7 8 9
	//27
	public void contarDigitos(String numero) {
		if (numero!=null && numero.isBlank()) {
			contadorDigitos[Integer.valueOf(numero.charAt(numero.length()-1))]=
					contadorDigitos[Integer.valueOf(numero.charAt(numero.length()-1))]+1;
		}
	
	}
	
	
	
	
}
