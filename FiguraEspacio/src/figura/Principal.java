package figura;

public class Principal {

	public static void main(String[] args) {
		
		Esfera esfera = new Esfera (3,150);
		
		System.out.println("La densidad de la esfera es: " + esfera.calcularDensidad());
		System.out.println("El volumen de la esfera es : " + esfera.calcularVolumen());
		System.out.println("¿La esfera flota en el agua?: " + esfera.flotaEnElAgua());
	}

}
