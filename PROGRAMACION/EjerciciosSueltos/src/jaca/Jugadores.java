package jaca;

public class Jugadores extends Elemento {
	
	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private double dinero;
	private int pociones;
	private int gemas;
	
	//CONSTRUCTOR
	
	//JUGADOR (CHAR,INT,INT)????
	
	//NEXTLCOL ??? NEXTFIL???
	
	@Override
	public String toString() {
		return "Jugadores [fuerza=" + fuerza + ", magia=" + magia + ", velocidad=" + velocidad + ", fil=" + fil
				+ ", col=" + col + ", dinero=" + dinero + ", pociones=" + pociones + ", gemas=" + gemas + "]";
	}
	
	//HASHCODE 
	
	//EQUALS
	
	
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getFil() {
		return fil;
	}
	public void setFil(int fil) {
		this.fil = fil;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public int getPociones() {
		return pociones;
	}
	public void setPociones(int pociones) {
		this.pociones = pociones;
	}
	public int getGemas() {
		return gemas;
	}
	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	
	
	
	
	
}
