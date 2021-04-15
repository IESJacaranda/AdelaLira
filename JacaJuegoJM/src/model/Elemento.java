package model;

public abstract class Elemento {

	protected TipoElemento tipoElemento;
	

	@Override
	public String toString() {
		return "" + tipoElemento; //Convierte en String
	}
	
	
}
