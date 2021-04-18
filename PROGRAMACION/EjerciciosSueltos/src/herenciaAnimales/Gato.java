package herenciaAnimales;

public class Gato extends Felino {

	public Gato() {
		super();
	}
	
	public Gato (String nombre, double peso, double altura) {
		super(nombre, peso, altura);
	}

	@Override
	public void necesidades() {
		System.out.println("Arenero limpio, alimento, cepillado de pelo, rascador");
	}

	
	
	
}
