package relacion6JM;

public class Rectangulo {

	private double longitud=1.0;
	private double ancho=1.0;
	private double longitudClase;
	
	private double area;
	private double perimetro;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo (double longitud, double ancho) {
		this.longitud=longitud;
		this.ancho=ancho;
		this.area=calcularArea();
		this.perimetro=calcularPerimetro();
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		if (longitud>0 && longitud<21) {
			this.longitud = longitud;
			System.out.println(this.longitud);
		}
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		if (ancho>0 && ancho<21) {
			this.ancho = ancho;
			System.out.println(this.ancho);
		}
	}
	
	/**
	 * *Este método calcula el área de un rectángulo
	 * @return
	 */
	public double calcularArea () {
		return this.ancho*this.longitud;
	}
	
	public double calcularPerimetro () {
		return 2*(this.ancho*this.longitud);
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
	
	@Override
	public String toString () {
		return "La longitud de este rectángulo es "
				+ this.getLongitud () + " y ancho " +
				this.getAncho();
		}
	
}
