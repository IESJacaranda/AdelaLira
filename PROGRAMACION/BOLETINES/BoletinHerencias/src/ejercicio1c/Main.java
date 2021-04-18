package ejercicio1c;

public class Main {

	public static void main(String[] args) throws Exception {

		Titular Adela = new Titular ("Adela Lira", 24);
		CuentaJoven cuenta1 = new CuentaJoven (1000, Adela);
		
		Titular Javi = new Titular ("Javi Lira", 17);
		CuentaJoven cuenta2 = new CuentaJoven(200,Javi);
		
		System.out.println(cuenta1.esCuentaValida());
		System.out.println(cuenta1.toString());
		cuenta1.puedeHacerReintegro();
		
		System.out.println(cuenta2.esCuentaValida());
		System.out.println(cuenta2.toString());
		cuenta2.puedeHacerReintegro();
		

	}

}
