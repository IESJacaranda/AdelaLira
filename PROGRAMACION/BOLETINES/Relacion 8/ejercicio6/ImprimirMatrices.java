package ejercicio6;



public class ImprimirMatrices {

	public static final String CORCHETE_APERTURA = "|";
	public static final String CORCHETE_CIERRE = "|";
	public static final String SEPARADOR = "|";
	public static final String SALTO_DE_LINEA = "\n";

	public static String printMatrix(int[][] tablero) {
		
		StringBuilder sb = new StringBuilder();
		
		if(tablero.length>0) {
			for(int i=0; i< tablero.length; i++) {
				for(int j = 0; j<tablero[i].length; j++) {
					if(j==0) {
						sb.append(CORCHETE_APERTURA);
					}
					sb.append(tablero[i][j]);
					
					if(j==tablero[i].length-1) {
						sb.append(CORCHETE_CIERRE);
					}else {
						sb.append(SEPARADOR);
					}
				}
				sb.append(SALTO_DE_LINEA);
			}
		}
	
		return sb.toString();
	}


	public static String printMatrix(int[] vector) {
		return printMatrix(new int[][] {vector});
		
	}
}
