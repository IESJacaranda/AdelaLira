package ejercicio2;

public abstract class  Vehiculo {
	
	protected String matricula;
	
	protected PrecioAlquiler precioAlquiler;
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String matricula) {
		this.matricula=matricula;
	}
	
	
	public Double getMultiplicadorInstalacion() {
		return precioAlquiler.getPrecio();
	}

}

