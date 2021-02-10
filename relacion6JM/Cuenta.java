package relacion6JM;

public class Cuenta {
	private double saldo;
	private int numeroIngresos;
	private int numeroReintegro;
	
	public Cuenta () {}
	
	public Cuenta (double saldo) {
		this.saldo=saldo;
	}
	
	//Operación 1
	public void hacerReintegro (double reintegro) throws Exception {
		if (saldo>0 && saldo>=reintegro && reintegro>0) {
			numeroReintegro++;
			saldo-=reintegro; //si ponemos saldo=saldo-reintegro es lo mismo
			System.out.println("Reintegro realizado correctamente"); //va en principal
		}
		else {
			throw new Exception ("La operación no se puede realizar");
		}
	}
	
	//Operación 2
	public void hacerIngreso (double ingreso) throws Exception {
		if (ingreso>0) {
			numeroIngresos++;
			saldo+=ingreso;
			System.out.println("Ingresor realizado correctamente");
		}
		else {
			throw new Exception ("La operación no se puede realizar");
		}
	}
	
	//Operación 3
	public String getStatus () {
		return "El saldo es " +this.saldo
				+ ", el número de ingresos es  " + this.numeroIngresos 
				+ " y el numero de reintegro es " + this.numeroReintegro;
		
	}
	
	//Operación 4
	public String getSaldoFinal() {
		return "";	}
	}

	
	
	
