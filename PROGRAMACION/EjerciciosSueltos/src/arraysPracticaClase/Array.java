package arraysPracticaClase;

public class Array {
	
	public static void main(String[] args) {

		comprobarVector();
		comprobarMatriz();

	}
	

	public static void comprobarVector () {
		
		int [] vector = new int [2];
		System.out.println(vector);
		//0 length -1
		System.out.println(vector[vector.length-1]);

	}
	public static void comprobarMatriz() {
		
		Persona [][] matriz = new Persona [3][2];
		for (int i=0; i<matriz.length; i++) {
			for ( int j=0; j<matriz[i].length; j++) {
				matriz[i][j]= new Persona();
				System.out.println(i + " " + j + " " +matriz[i][j]);
			}
		}	
	}
}
