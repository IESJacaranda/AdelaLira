package ejercicio1;

public class CuentaCredito extends Cuenta {

	private Double credito = new Double(100);
	private Cuenta cuenta;
	
	public CuentaCredito() {
		
	}
	
	public CuentaCredito (double saldo, Titular titular, double credito) {
		super(saldo, titular);
		this.credito=credito;
	}
	
	
	
	
	public double calcularNumerosRojos() {
		
		double numerosRojos;
		
		numerosRojos=-(this.credito);
		
		return numerosRojos;
	}

	
	public double hacerReintegroCuentaCredito(double reintegro) throws Exception {
		if(reintegro>=calcularNumerosRojos() ) {
			saldo-=reintegro;
		}
		else {
			throw new Exception("La operación no se puede realizar");
		}
		return saldo; 
	}

	
	
	
	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		if(this.credito>0 && this.credito<301) {
			this.credito = credito;
			System.out.println("Cogido");
		}
		else {
			System.out.println("Error");
		}
	}
	
}
