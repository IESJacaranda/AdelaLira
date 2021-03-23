package InterfaceEjemploPropio;

public class Española implements Comida {

	private final static double PRECIO_ESPAÑOLA= 5;
	private int personas = 8;
	
	
	@Override
	public double hacerCuenta() {
		// TODO Auto-generated method stub
		return (personas*PRECIO_ESPAÑOLA);
	}


}
