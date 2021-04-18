package ejercicio5JM;

public class Carta {
	
	public final static String [] PALOS  = {"Oro", "Bastos", "Espadas", "Copas"};

	private String palo;
	private int numero;
	
	
	public Carta(){
		
	}
	
	public Carta(String palo, int numero) {
		super();
		if (esPaloValido) {
			this.palo=palo;
			this.numero=numero;
		}
	
	}

	public boolean esPaloValido(String palo) {
		boolean contiene = false;
		for (int i = 0; i < PALOS.length; i++) {
			if(PALOS[i].contentEquals(palo)) {
				contiene=true;
			}
		}
		return contiene;
	}
	
	
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
