package herenciaAnimales;

public class Felino extends Animal {

	public Felino () {
		super();
	}
	
	public Felino (String nombre, double peso, double altura) {
		super(nombre, peso, altura);
	}

	@Override
	public void necesidades() {
		System.out.println("Comer, jugar, correr");
	}

	@Override
	public void comportamiento() {
		System.out.println("Animales muy limpios, suelen ser independientes pero en ocasiones muy cariñosos, propensos a arañar");
	}
	
	
	
}
