package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Titular cliente = new Titular("Adela", 23);
		
		CuentaJoven cuenta = new CuentaJoven(200.3);
		
		System.out.println(cuenta.getBonificacion());
		
		
	}

}
