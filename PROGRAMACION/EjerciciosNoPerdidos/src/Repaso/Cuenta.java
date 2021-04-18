package Repaso;

public class Cuenta {

	private double saldo;
	private int numReintegros;
	private int numIngresos;
	

	public Cuenta () {}
	
	public Cuenta (double saldo) {
		this.saldo=saldo;
	}

	public void reintegro(double cantidad) {
		if (this.saldo>0 && saldo>cantidad) {
			saldo=saldo-cantidad;
			numReintegros++;
		}
		else {
			System.out.println("No tiene saldo suficiente");
		}
	}
	
	public void ingreso (double cantidad) {
		saldo=saldo+cantidad;
		numIngresos++;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getStatus() {
		return "El saldo de la cuenta es " + this.saldo + " el numero de ingresos es " + this.numIngresos + 
				" y el numero de reintegros es " + this.numReintegros;
	}
	
	
	
	
}
