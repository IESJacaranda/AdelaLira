package InterfaceEjemploPropio;

public class Mexicana implements Comida {

	private final static double PRECIO_MEXICANA= 5;
	private int personas;

	public Mexicana(int personas) {
		this.personas=personas;
	}
	
	@Override
	public double hacerCuenta() {
		// TODO Auto-generated method stub
		return (personas*PRECIO_MEXICANA);
	}

}
