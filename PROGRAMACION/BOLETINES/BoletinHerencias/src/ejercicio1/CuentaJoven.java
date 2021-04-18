package ejercicio1;

public class CuentaJoven extends Cuenta {
	
	private double bonificacion = 0.3;
	
	

	public CuentaJoven(double cantidad) {
		super(cantidad);
	}
	

	
	
	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
}
