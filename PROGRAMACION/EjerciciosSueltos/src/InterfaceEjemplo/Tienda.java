package InterfaceEjemplo;

public class Tienda implements LocalComercial {

	private double largo;
	private double ancho;
	private String actividad;
	
	private int cantidadProducto;

	public Tienda(double largo, double ancho, String actividad) {
		this.largo=largo;
		this.ancho=ancho;
		this.actividad=actividad;
	}
	
	public Tienda (double largo, double ancho, String actividad, int cantidadProducto) {
		super();
		this.cantidadProducto=cantidadProducto;
	}
	@Override
	public double getSuperficieEdificio() {
		return largo*ancho;
	}

	@Override
	public double getPrecioEdificio() {
		return getSuperficieEdificio()*PRECIO_METRO_LOCAL_COMERCIAL;
	}

	@Override
	public String actividadComercial() {
		return this.actividad;
	}

	public int darCantidadProducto () {
		return this.cantidadProducto;
	}

}
