package arrays;

import java.util.*;

public class BoletinArrays {
	
	public static final String CORCHETE_APERTURA="[";
	public static final String CORCHETE_CIERRE="}";
	public static final String SEPARADOR=",";
	public static final String SALTO_DE_LINEA="\n";
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		int [][] matriz2 = {{2,3},{5,6}};
		int [][] matriz3 = {{2,3},{5,6}};
		int v1 []= {3,2};
		int v2 []= {5,15,23};
		int [][] matrizRotar = {{3,1,0},{0,2,4},{0,5,1}};
		int numero=0;
		System.out.println("¿Que número desea introducir para el tamaño de la matriz?");
		numero=teclado.nextInt();
		int numero2=0;
		//System.out.println("¿Que tamaño quieres para las matrices que vas a sumar?");
		//numero2=teclado.nextInt();
		
		int[][] matriz2JM = {{1,2,3},{3,4,7}};
	
		System.out.println("EJERCICIO 1");
		crearMatrices(numero);
		System.out.println("EJERCICIO 2");
		ejercicio2(matriz2);
		System.out.println("EJERCICIO 2 JOSE MANUEL");
		System.out.println(ejercicio2JM(matriz2JM));
		System.out.println("EJERCICIO 3");
		System.out.println(ejercicio2JM(sumarMatrices()));
		System.out.println("EJERCICIO 4");
		System.out.println(ordernarListas(v1, v2));
		System.out.println("EJERCICIO 4 JOSE MANUEL");
		System.out.println(concatenacionJM(v1, v2));
		System.out.println("EJERCICIO 5");
		System.out.println(rotarMatrices(matrizRotar));

	}
	
	
	//EJERCICIO1
	public static void crearMatrices(int numero) {
		
		int [][] matriz1 = new int [numero][numero];
		
		for (int i=0; i<matriz1.length; i++) {
			for ( int j=0; j<matriz1[i].length; j++) {
				if (i==j) { //en la diagonal es x=1y=1, x=2y=2, por eso i==j 
					matriz1[i][j]=1;
				}
				else {
					matriz1[i][j]=0; //matriz[i][j]=numero;
				}
				
				
				System.out.println(matriz1[i][j]);
			}
		}
		System.out.println("-----------------------------------------------------------");
	}
	

	
	public static void ejercicio2(int [][] matriz2) {
		
		StringBuilder cadenaMatriz2= new StringBuilder("");
		
		for (int i=0; i<matriz2.length; i++) {
			for ( int j=0; j<matriz2[i].length; j++) {
				cadenaMatriz2.append(matriz2[i][j]);	
			}
		}
		
		System.out.println(cadenaMatriz2);
		System.out.println("-----------------------------------------------------------");
	}
	
	public static String ejercicio2JM(int[][] matriz2JM) {
		
		StringBuilder sb = new StringBuilder();
			
		if (matriz2JM.length>0) {
			for (int i=0; i<matriz2JM.length; i++) {
				for ( int j=0; j<matriz2JM[i].length; j++) {	
					if(j==0) {
						sb.append(CORCHETE_APERTURA);
					}
					sb.append(matriz2JM[i][j]);
					if(j==matriz2JM[i].length-1) {
						sb.append(CORCHETE_CIERRE);
					}
					else {
						sb.append(SEPARADOR);
					}
				}
				sb.append(SALTO_DE_LINEA);
			}
		}
		return sb.toString();
	}
	
	
	/**
	 * EJERCICIO 3
	 * @return
	 */
	public static int[][] sumarMatrices() {
		
		int [][] matrizPrimera ={{1,0,0},{0,1,0},{0,0,1}};
		int [][] matrizSegunda ={{7,14,23},{3,9,15},{0,7,22}};
		int[][] suma = null;
		
		if(matrizPrimera!=null && matrizSegunda!=null
			&& matrizPrimera.length==matrizSegunda.length
				&& matrizPrimera[0].length==matrizSegunda[0].length) {
			
			suma =new int [matrizPrimera.length][matrizPrimera[0].length];
			
			for (int i=0;i<matrizPrimera.length;i++) {
				for (int j=0;j<matrizPrimera[i].length;j++) {
					suma[i][j]=matrizPrimera[i][j]+matrizSegunda[i][j];
				}
			}
		}
		return suma;
		
	
	}
	
	/**
	 * EJERCICIO 4
	 * @return
	 */
	public static StringBuilder ordernarListas (int cad1 [], int cad2 []) {
	
		StringBuilder cadenadesordenada= new StringBuilder("");
		StringBuilder cadenaordenada= new StringBuilder("");

		for (int i=0; i<cad1.length; i++) {
			cadenadesordenada.append(cad1[i]);
			cadenadesordenada.append(SEPARADOR);
		}
		
		for ( int j=0; j<cad2.length; j++) {	
			cadenadesordenada.append(cad2[j]);
			if(j>cadenadesordenada.length()-1) {
				
			}
			else {
				cadenadesordenada.append(SEPARADOR);
			}
			
		}

		
		return cadenadesordenada;
	}
	
	
	/**
	 * EJERCICIO 4 JOSE MANUEL // NO FUNCIONA
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static int[] concatenacionJM(int [] v1, int [] v2) {
		int [] resultado = null;
		
		if(v1!=null && v2!=null) {
			resultado=new int [v1.length+v2.length];
			
			for (int i=0; i<v1.length;i++) {
				resultado[i]=v1[i];
			}
			for (int i=v1.length-1; i<v2.length;i++) {
				resultado[i]=v2[i];
			}
		}
		
		return resultado;
	}
	
	
	public static int rotarMatrices(int[][] matrizRotar) {
		
		int aux = 0;
		
		for (int i=0;i<matrizRotar.length;i++) {
			for (int j=0;j<matrizRotar[i].length;j++) {
				aux=matrizRotar[i][j];
				matrizRotar[i][j]=matrizRotar[j][i];
			}
		}

		return aux;
	}
	
	
	

}
