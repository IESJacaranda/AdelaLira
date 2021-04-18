package ejercicio1b;

public class CuentaJoven extends Cuenta {

	public CuentaJoven() {
		super();
		this.bonificacion=bonificacion.CUENTA_JOVEN;
	}
	
	public boolean esTitularValido() {
		return this.getTitular() != null && 
				this.getTitular().getEdad()>=18 && 
				this.getTitular().getEdad()<25;
	}
	
}
