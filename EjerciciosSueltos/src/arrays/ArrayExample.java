package arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		trabajandoConArrays();
		
	}	

	public static void trabajandoConArrays() {
		int [] vector = new int [5];
		System.out.println(vector);
		//0 length -1
		System.out.println(vector[vector.length-1]);
		
		int [][] matrix = new int [5][5];
		matrix[0][3]=7;
		System.out.println(matrix[0][3]);
		
		Empleado [][] listaDeEmpleados = new Empleado[3][30];
		for (int i=0; i<listaDeEmpleados.length; i++) {
			for ( int j=0; j<listaDeEmpleados[i].length; j++) {
				listaDeEmpleados[i][j]= new Empleado();
				System.out.println(i + " " + j + " " +listaDeEmpleados[i][j]);
			}
		}	
		
		Empleado[][][] listaDeEmpleados2 = new Empleado[3][3][3];
		for (int i=0; i<listaDeEmpleados2.length; i++) {
			for ( int j=0; j<listaDeEmpleados2[i].length; j++) {
				for (int k=0; k<listaDeEmpleados2[i][j].length; k++) {
					listaDeEmpleados2[i][j][k]= new Empleado();
					System.out.println(i + " " + j + " " + k + " " + listaDeEmpleados2[i][j][k]);
				}
				}
				
		}	
		
		int [][] matrizVariable= {{3,5},{3,6,7,9}};
			for (int i=0; i<matrizVariable.length; i++) {
				for ( int j=0; j<matrizVariable[i].length; j++) {
					System.out.println(matrizVariable[i][j]);
				}
			}
	}
	
	
	

}
