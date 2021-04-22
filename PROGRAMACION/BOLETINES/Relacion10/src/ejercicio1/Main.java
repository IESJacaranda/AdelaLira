package ejercicio1;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Titular t1 = new Titular("Adela",25);
		CuentaCredito c1 = new CuentaCredito (300,t1,100.0);
	
		System.out.println(c1.toString());
		c1.hacerReintegroCuentaCredito(100); //REINTEGRO
		
	
		
		

	}
	
}
