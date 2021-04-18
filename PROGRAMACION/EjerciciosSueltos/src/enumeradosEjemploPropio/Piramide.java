package enumeradosEjemploPropio;

public enum Piramide {
	
	CEREALES(1),
	VERDURAS(2),
	CARNE(3),
	AZUCARES(4);
	
	private int piramide;
	
	Piramide (int alimentos) {
		this.piramide=alimentos;
	}

	public int getPiramide() {
		return piramide;
	}

}
