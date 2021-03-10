package Ejercicio1;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea() {	
	}
	
	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA=puntoA;
		this.puntoB=puntoB;
	}
	
	public boolean compararLineas() {
		boolean comparativaLineas=false;
		puntoA.equals(puntoB);
		return comparativaLineas;
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	
}
