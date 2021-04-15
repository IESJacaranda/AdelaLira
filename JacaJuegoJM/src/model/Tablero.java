package model;

import util.Constantes;

public class Tablero {
	public final static int LONGITUD = 10;
	private Elemento [][] tablero;
	
	public Tablero () {
		super();
		tablero = new Elemento[LONGITUD][LONGITUD];
		tablero[3][7]= new Roca();
		tablero [3][5] = new Elfo(TipoElemento.JUGADOR_T);
	}
	
	public void imprimirTablero() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tablero.length; i++) {
			sb.append(Constantes.CELL_HORIZONTAL_SEP);
			for (int j = 0; j < tablero[0].length; j++) {
				sb.append((tablero[i][j]!= null? tablero[i][j] : " ")+ Constantes.CELL_HORIZONTAL_SEP);
			}
			sb.append(Constantes.LINE_SEPARATOR);
		}
		sb.append(Constantes.LINE_SEP);
		System.out.println(sb.toString());
	}
	
	protected void crearRocas() {
		
	}
}
