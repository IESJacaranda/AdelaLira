package ejercicio5_b;

import java.util.ArrayList;

public class Baraja {

	public final static int NUMERO_MAXIMO = 12;
	public final static int NUMERO_MINIMO = 1;
	
	private int oros;
	private int copas;
	private int espadas;
	private int bastos;
	
	ArrayList cartas = new ArrayList();
	
	public Baraja() {
		
	}
	
	public Baraja(int oros, int copas, int espadas, int bastos) {
		this.oros=oros;
		this.copas=copas;
		this.espadas=espadas;
		this.bastos=bastos;
	}
	
	public void darCartas(int numero) {
		for (int i = 1; i <= numero; i++) {
		    numero = (int) (Math.random() * 12 + 1);
		    if (cartas.contains(numero)) {
		        i--;
		    } else {
		    	cartas.add(numero);
		    }
		} 
	}

	public int getOros() {
		return oros;
	}

	public void setOros(int oros) {
		if(this.oros>=NUMERO_MINIMO && this.oros<=NUMERO_MAXIMO) {
			this.oros = oros;
		}
		
	}

	public int getCopas() {
		return copas;
	}

	public void setCopas(int copas) {
		if(this.copas>=NUMERO_MINIMO && this.copas<=NUMERO_MAXIMO) {
			this.copas = copas;
		}
	
	}

	public int getEspadas() {
		return espadas;
	}

	public void setEspadas(int espadas) {
		if(this.espadas>=NUMERO_MINIMO && this.espadas<=NUMERO_MAXIMO) {
			this.espadas = espadas;
		}
		
	}

	public int getBastos() {
		return bastos;
	}

	public void setBastos(int bastos) {
		if(this.espadas>=NUMERO_MINIMO && this.espadas<=NUMERO_MAXIMO) {
			this.bastos = bastos;
		}
		
	}
	
}
