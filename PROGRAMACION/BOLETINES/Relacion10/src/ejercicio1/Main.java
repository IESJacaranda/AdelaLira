package ejercicio1;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Titular t1 = new Titular("Adela",25);
		CuentaCredito c1 = new CuentaCredito ();
		
		c1.setCredito(100);
		System.out.println(c1.calcularNumerosRojos());
		c1.hacerReintegroCuentaCredito(300);
		
		

	}
	
}
