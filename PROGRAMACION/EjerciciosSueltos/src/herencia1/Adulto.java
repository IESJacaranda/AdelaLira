package herencia1;

public class Adulto extends Persona {
	
	private boolean carnetConducir;

	public Adulto() {
		super();
	}
	
	public Adulto (String nombre, int edad, double altura, double peso) {
		super(nombre, edad, altura, peso);
	}

	//No modificamos desplazarse porque es igual que el de Persona

	@Override
	public void obtenerHabitos() {
		System.out.println("Pagar facturas, trabajar, hacer deporte, ver la tele");
	}
	
	public void conducir() {
		if(carnetConducir) {
			System.out.println("Se esta desplazando en coche");
		}
	}
	
	public boolean isCarnetConducir() {
		return carnetConducir;
	}
	
	
}
