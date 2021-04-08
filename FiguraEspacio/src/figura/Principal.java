package figura;

public class Principal {

	public static void main(String[] args) {
		
		Esfera esfera = new Esfera (3,150);
		
		System.out.println("La densidad de la esfera es: " + esfera.calcularDensidad());
		System.out.println("El volumen de la esfera es : " + esfera.calcularVolumen());
		System.out.println("¿La esfera flota en el agua?: " + esfera.flotaEnElAgua());
		
		
		
		Cubo cubo = new Cubo (2,20);
		
		System.out.println("La densidad del cubo es: " + cubo.calcularDensidad());
		System.out.println("El volumen del cuboa es : " + cubo.calcularVolumen());
		System.out.println("¿El cubo flota en el agua?: " + cubo.flotaEnElAgua());
	}

}
