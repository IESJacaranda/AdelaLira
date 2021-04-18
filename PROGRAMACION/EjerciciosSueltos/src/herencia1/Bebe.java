package herencia1;

public class Bebe extends Persona { //indica que es una herencia de la clase Persona

	public Bebe() {
		super();
	}
	
	public Bebe(String nombre, int edad, double altura, double peso) {
		super(nombre, edad, altura, peso); //si hacemos busqueda con el CTRL nos sale el super con todos los atributos
	}

	//SOURCE > OVERRIDE/IMPLEMENT METHOD
	@Override
	public void desplazarse() {
		System.out.println("Está gateando");
	}

	@Override
	public void obtenerHabitos() {
		System.out.println("Jugar, aprender a controlar los esfínteres");
	}
	
	
	
}
