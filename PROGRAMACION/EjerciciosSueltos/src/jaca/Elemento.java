package jaca;

public class Elemento {
	
	private char simbolo;
	
	public Elemento() {
		super();
	}
	
	
	public Elemento (char simbolo) {
		this();
		this.simbolo=simbolo;
	}


	@Override
	public String toString() {
		return "Elemento [simbolo=" + simbolo + "]";
	}
	
	
	
}
