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

	
	public double hacerReintegroCuentaCredito(double reintegro) throws puedeHacerReintegroException {
		if(saldo+credito>reintegro) {
			saldo-=reintegro;
			System.out.println(saldo);
		}
		else {
			throw new puedeHacerReintegroException();
		}
		return saldo; 
	}

	
	
	
	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) throws TamañoCreditoException {
		if(this.credito>0 && this.credito<301) {
			this.credito = credito;
		}
		else {
			throw new TamañoCreditoException();
		}
	}

	@Override
	public String toString() {
		return "El credito de esta cuenta es " + credito + ", el saldo es " + this.saldo + ".";
	}
	
	
}
