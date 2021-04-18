package ejercicio6JM;

public class Frase {

	private String caracteres = "abcdefghijklmnñopqrstuvwxyz";
	private int [] ocurrencias = new int [caracteres.length()];
	
	/**
	 * 
	 */
	public void contarOcurrencias (char c) {
		for (int i = 0; i < caracteres.length(); i++) {
			if(Character.toLowerCase(caracteres.charAt(i))==Character.toLowerCase(c)) {
				ocurrencias[i]++;
			}
		}
	}
	
	public void contarOcurrenciasFrase(String frase) {
		for (int i = 0; i < frase.length(); i++) {
			contarOcurrencias(frase.charAt(i));
		}
	}
	
	public String mostrarOcurrencias () {
		
		StringBuilder mensaje = new StringBuilder();
		
		for (int i = 0; i < ocurrencias.length; i++) {
			if(ocurrencias[i]>0) {
				mensaje.append("La letra " + caracteres.charAt(i) + " ha aparecido un total de " + ocurrencias[i] + (ocurrencias[i]>1 ? " veces" : " vez") +"\n");
			}
		}
		
		
		return mensaje.toString();
		
	}
	
}
