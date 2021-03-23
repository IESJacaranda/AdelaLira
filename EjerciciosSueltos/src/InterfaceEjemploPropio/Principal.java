package InterfaceEjemploPropio;

public class Principal {

	public static void main(String[] args) {
		Comida tacos = new Mexicana(3);
		
		PatatasBravas papas = new PatatasBravas(8);
		Tapa tapita = new PatatasBravas(3);
		Comida bravas = new PatatasBravas(19);
		
		System.out.println(((PatatasBravas)bravas).hacerCuenta());

	}

}
