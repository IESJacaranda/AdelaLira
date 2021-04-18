package ejercicio1c;

public class CuentaJoven extends Cuenta {

	private Bonificacion bonificacion = Bonificacion.CUENTA_JOVEN;
	
	public CuentaJoven(double saldo, Titular titular) {
		super(saldo, titular);
		if(esCuentaValida()) {
			this.titular=titular;
		}
		this.bonificacion=Bonificacion.CUENTA_JOVEN;
		// TODO Auto-generated constructor stub
	}
	
	//CAMBIAR
	public boolean esCuentaValida() {
		boolean valido = false;
		if(this.getTitular().getEdad()>17 && this.getTitular().getEdad()<25) {
			valido=true;
		}
		else {
			valido=false;
		}
		
		return valido;
	}

	
	public void puedeHacerReintegro() throws puedeHacerReintegroException {
		if(esCuentaValida()) {
			try {
				super.hacerReintegro(numeroReintegros);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			throw new puedeHacerReintegroException();
		}
	}
	
	
	@Override
	public String toString() {
		
		String mensaje= "";
		
		if(esCuentaValida()) {
			mensaje = "La cuenta de " + titular.getNombre() + " esta categorizada como "
					+ "Cuenta Joven, con una bonificación de " + Bonificacion.CUENTA_JOVEN.getBonificacion() ;
		}
		else {
			mensaje="La cuenta de " + titular.getNombre() + " no esta categorizada como "
					+ "Cuenta Joven" ;
		}
		
		return mensaje;
	}
	
	
	

}
