package InterfaceEjemplo;

public class Vivienda implements Edificio {

	private double largo;
	private double ancho;
	private int plantas;
	
	private int habitantes;
	
	
	public Vivienda(double largo, double ancho, int plantas) {
		this.largo=largo;
		this.ancho=ancho;
		this.plantas=plantas;
	}
	
	public Vivienda(double largo, double ancho, int plantas, int habitantes) {
		super();
		this.habitantes=habitantes;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return ancho*largo*plantas;
	}

	@Override
	public double getPrecioEdificio() {
		return PRECIO_POR_METRO * getSuperficieEdificio();
	}

	public int getHabitantes() {
		return habitantes;
	}

}
