package InterfaceEjemploPropio;

public class Espa�ola implements Comida {

	private final static double PRECIO_ESPA�OLA= 5;
	private int personas = 8;
	
	
	@Override
	public double hacerCuenta() {
		// TODO Auto-generated method stub
		return (personas*PRECIO_ESPA�OLA);
	}


}
