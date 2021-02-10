package relacionProblemas6;

public class Ej2Cuenta {
	
	private int saldo;
	private int reintegro;
	private int ingreso;
	private int consultas;
	private int confirmacion;
	
	public Ej2Cuenta () {
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
		System.out.println(this.saldo);
	}

	public int getReintegro() {
		return reintegro;
	}

	public void setReintegro(int reintegro) {
		this.reintegro = reintegro;
		System.out.println(this.saldo-this.reintegro);
	}

	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public int getConsultas() {
		return consultas;
	}

	public void setConsultas(int consultas) {
		this.consultas = consultas;
	}

	public int getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(int confirmacion) {
		this.confirmacion = confirmacion;
	}
	
	
	
	
	
}
