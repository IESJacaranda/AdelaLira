package model;

public abstract class Jugador extends Elemento {
	
	protected int fuerza;
	protected int magia;
	protected int velocidad;
	protected int fil;
	protected int col;
	protected int dinero;
	protected int pociones;
	protected int gemas;
	
	public Jugador () {
		super();
	}
	
//	public Jugador (char, int, int) {
//		this();
//	}
	
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
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
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
