package herenciaAnimales;

public class Hamster extends Animal {
	
	public Hamster() {
		super();
	}
	
	public Hamster( String nombre, double peso, double altura ) {
		super(nombre, peso, altura);
	}

	@Override
	public void necesidades() {
		System.out.println("Comer, jugar con la rueda, dormir");
	}

	@Override
	public void comportamiento() {
		System.out.println("Animal independiente, solo necesita que le den de comer");
	}

	
	
	

}
