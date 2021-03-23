package InterfaceEjemploPropio;

public class PatatasBravas implements Tapa {

	private int persona;
	
	public PatatasBravas(int persona) {
		this.persona=persona;
	}

	@Override
	public double hacerCuenta() {
		
		return ((persona*PRECIO_PLATO)*TAMA�O_MENOR);
	}

	@Override
	public double precioPorTapa() {
		// TODO Auto-generated method stub
		return PRECIO_PLATO*TAMA�O_MENOR;
	}

}
