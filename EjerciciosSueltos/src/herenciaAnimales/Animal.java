package herenciaAnimales;

public class Animal {
	
	private String nombre;
	private double peso;
	private double altura;
	
	public Animal() {
		super();
	}
	
	public Animal (String nombre, double peso, double altura) {
		this();
		this.nombre=nombre;
		this.peso=peso;
		this.altura=altura;
	}
	
	public void necesidades () {
		System.out.println("Alimentarse");
	}
	
	public void comportamiento () {
		System.out.println("No consta");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
