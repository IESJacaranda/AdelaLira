package Repaso;

public class Cafetera {
	
	public final static double PRECIO_CAFE=1.0;
	public final static double PRECIO_LECHE=0.8;
	public final static double PRECIO_CAFECONLECHE=1.5;
	
	private int cafe;
	private int leche;
	private int vasos;
	private double monedero;

	public Cafetera() {}
	
	public void llenarDeposito() {
		this.monedero=50;
		this.cafe=50;
		this.leche=50;
		this.vasos=80;
	}

	public double cambio (double precio, double dinero) {
		if (precio<=dinero) {
			return dinero-precio;
		}
		else {
			System.out.println("No hay suficiente dinero");
		}		
		return dinero;
	}
	
	
	
	
	
	
}