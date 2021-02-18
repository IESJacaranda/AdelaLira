package Ejercicio2JM;

public class Compresor {
	
	
	
	public Compresor() {
		// TODO Auto-generated constructor stub
	}

	
	/** 
	 * METODO PARA COMPRIMIR
	 * @param cadena
	 * @return
	 */
	public String encriptar (String cadena) {
		StringBuilder sb =new StringBuilder();
		if (cadena!=null &&cadena.length()>0) {
			int contador = 1 ;
			char a =cadena.charAt(0);
			for (int i=1;i<cadena.length();i++) {
				if (a==cadena.charAt(i)) {
					contador++;
				}
				else {
					sb.append(a).append(contador);
					a=cadena.charAt(i);
					contador=1;
				}
			}
		}
		
		return sb.toString();
	}
	
	public String desencriptar (String cadena) {
		if(cadena!=null && !cadena.isBlank() && cadena.isEmpty() &&cadena.length()>=2) {
			char caracterArepetir = cadena.charAt(0);
			
			for (int i=1;i<cadena.length();i++) {
				String veces="";
				if( Character.isDigit(cadena.charAt(i))) {
					veces+=cadena.charAt(i);
				}
				else {
					int vecesNum =Integer.parseInt(veces);
					for (int j=0;i<vecesNum.length();j++) {
						resultado.append(caracterARepetir);
					}
				}
			}
		
		
		}
		return "";
	}
}
