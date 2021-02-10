package relacion6JMEjercicio3;

public class MaquinaCafe {
	
	public final static double PRECIO_CAFE=1;
	public final static double PRECIO_CAFE_LECHE=1.5;
	public final static double PRECIO_LECHE=0.80;
	
	
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	
	public MaquinaCafe() {//Esto es el CONSTRUCTOR

	}
	
	public void vaciarMonedero(){
		
	}
	
	public void llenarDeposito(){
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;		
	}
	
	public double darCambio(Double cantidadIntroducida, double precio) throws Exception {
		double cambio=0;
		if(cantidadIntroducida<precio) {
			throw new Exception ("La cantidad introducida es insuficiente");
		}
		else if((cantidadIntroducida-precio)>this.monedero) {
			throw new Exception ("No tenemos suficiente cambio");
		}
		
		else {
			cambio=cantidadIntroducida-precio;
		}

		this.monedero=cambio;
		return cambio;
	
	}
	
	public boolean esPosibleServirCafe() {
		return this.depositoCafe>0 && this.depositoVasos>0;		
	}
	
	public boolean esPosibleServirLeche() {
		return this.depositoLeche>0 && this.depositoVasos>0;	
	}
	
	public boolean esPosibleServirCafeconLeche() {
		return this.depositoCafe>0 && this.depositoLeche && this.depositoVasos>0;	
	}
	
	public void servirCafe() throws Exception{
		if (this.depositoCafe>0 && this.depositoVasos>0) {
			this.depositoCafe--;
			this.monedero+=PRECIO_CAFE;
		}
		else {
			throw new Exception ("Operación no permitida")
		}
	
		
	}
	
	public void servirLeche() {
		if (this.depositoLeche>0 && this.depositoVasos) {
			this.depositoLeche--;
			this.monedero+=PRECIO_LECHE;
		}
	}
	
	public void servirCafeConLeche() throws Exception{
		if (this.depositoCafe>0 && this.depositoLeche>0 && this.depositoVasos>0) {
			this.depositoCafe--;
			this.depositoLeche--;
			this.monedero+=PRECIO_CAFE_LECHE;
		}
		
		else {
			throw new Exception ("Operación no permitida");
		}
	}
	
	/**
	 * Devuelve el estado de la maquina
	 * @return
	 */
	
	public String getStatusMaquina () {
		return " ";
	}
	
	@Override
	public String toString() {
		return "Existen: " + this.depositoLeche + 
				" dosis de leche " + this.depositoCafe + 
				" dosis de cafe " + this.depositoVasos + 
				" deposito de vasos y " + this.monedero + " Euros.";
	}
}
