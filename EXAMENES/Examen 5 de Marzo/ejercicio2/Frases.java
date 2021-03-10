package ejercicio2;

public class Frases {
	
	private static String cadena;
	private static String cadenaComprobar;
	
	public Frases() {
		
	}
	
	public Frases(String cadena, String cadenaComprobar) {
		this.cadena=cadena;
		this.cadenaComprobar=cadenaComprobar;
	}
	
	public static StringBuilder comprobarPalabra() {
		StringBuilder contenedora= new StringBuilder("");
		
		
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < cadenaComprobar.length(); j++) {
				if (cadena.charAt(i)==cadenaComprobar.charAt(j) && cadena.charAt(i)+1==cadenaComprobar.charAt(j)+1) {
					contenedora.append(cadena.charAt(i));
				}				
			}	
		}
		return contenedora;	
	}

}
