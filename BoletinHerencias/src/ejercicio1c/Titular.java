package ejercicio1c;

public class Titular {
	
	private String nombre;
	private int edad;
	
	public Titular () {
		
	}
	
	public Titular(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	@Override
	public String toString() {
		return "El titular de la cuenta es " + this.nombre + " con una edad de " + edad + " años." ;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	
	
}
