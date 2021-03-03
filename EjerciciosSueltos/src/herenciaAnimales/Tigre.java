package herenciaAnimales;

public class Tigre extends Felino {

	public Tigre () {
		super();
	}
	
	public Tigre (String nombre, double peso, double altura) {
		super(nombre, peso, altura);
	}

	@Override
	public void necesidades() {
		System.out.println("Comer carne en grandes cantidade, jugar, cazar");
	}

	
	
	
}
