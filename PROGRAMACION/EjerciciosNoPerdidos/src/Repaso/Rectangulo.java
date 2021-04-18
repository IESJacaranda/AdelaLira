package Repaso;

public class Rectangulo {
	
	private double longitud=1;
	private double ancho=1;
	
	public Rectangulo() {
		
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
		
		if (this.ancho>0 && this.ancho<21 ) {
			this.ancho = ancho;
		}
		else {
			System.out.println("Incorrecto");
		}
		
	}
	
	
	public double darArea () {
		double area=0;
		area=this.ancho*this.longitud;
				
		return area;
	}
	
	public double darPerimetro () {
		double perimetro =0;
		perimetro=2*(this.ancho*this.longitud);
		
		return perimetro;
		
	}
	
	
	
	
	
	

}
