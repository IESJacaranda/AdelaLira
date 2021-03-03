package herencia1;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("PERSONA");
		Persona persona1 = new Persona();
		persona1.desplazarse();
		persona1.obtenerHabitos();
		
		System.out.println("BEBE");
		Bebe bebe1 = new Bebe();
		bebe1.desplazarse();
		bebe1.obtenerHabitos();
		
		//Podriamos usar Persona persona = new Bebe(); porque bebe es heredero de persona
		//((Adulto)persona).conducir --> esto convertiria a la clase Persona en Adulto
		System.out.println("ADULTO");
		Adulto adulto1 = new Adulto ();
		adulto1.desplazarse();
		adulto1.obtenerHabitos();
		adulto1.conducir();
		
		System.out.println("ANCIANO");
		Anciano anciano1 = new Anciano();
		anciano1.conducir();
		anciano1.desplazarse();
		anciano1.obtenerHabitos();
	}
}
