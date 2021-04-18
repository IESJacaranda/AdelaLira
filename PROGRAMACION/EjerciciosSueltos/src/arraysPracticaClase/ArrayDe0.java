package arraysPracticaClase;

public class ArrayDe0 {

	public static void main(String[] args) {
		
		comprobarDe0();
		comprobarDe5();
		
		
	}
	
	public static void comprobarDe0() { //Podriamos introducirle un numero (int numero) y asi en vez de 0 podriamos poner el numero que deseamos
		
		int [][] matriz = new int [4][4];
			
			for (int i=0; i<matriz.length; i++) {
				for ( int j=0; j<matriz[i].length; j++) {
					if (i==j) { //en la diagonal es x=1y=1, x=2y=2, por eso i==j 
						matriz[i][j]=1;
					}
					else {
						matriz[i][j]=0; //matriz[i][j]=numero;
					}
					System.out.println(matriz[i][j]);
				}
				
			}
	}
	
public static void comprobarDe5() {
		
		int [][] matriz = new int [4][4];
			
			for (int i=0; i<matriz.length; i++) {
				for ( int j=0; j<matriz[i].length; j++) {
					if (i==j) { //en la diagonal es x=1y=1, x=2y=2, por eso i==j 
						matriz[i][j]=1;
					}
					else {
						matriz[i][j]=5;
					}
					System.out.println(matriz[i][j]);
				}
				
			}
	}
}
