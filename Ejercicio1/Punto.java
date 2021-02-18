package Ejercicio1;

public class Punto {

	private double coordX;
	private double coordY;
	
	public Punto() {}
	
	public Punto (double coordX, double coordY) {
		this.coordX=coordX;
		this.coordY=coordY;
	}
	
	public double moverArriba (double movimiento) {
		coordY=coordY+movimiento;
		return coordY;
	}
	
	public double moverAbajo(double movimiento) {
		coordY=coordY-movimiento;
		return coordY;
	}
	
	public double moverDerecha(double movimiento) {
		coordX=coordX+movimiento;
		return coordX;
	}
	
	public double moverIzquierda(double movimiento) {
		coordX=coordX-movimiento;
		return coordX;
	}
	
	
}
