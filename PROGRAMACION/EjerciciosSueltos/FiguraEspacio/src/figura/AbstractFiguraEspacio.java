package figura;

public abstract class AbstractFiguraEspacio {
	
	public static final Double DENSIDAD_AGUA = 1.0;

	protected Double peso; //LO HACEMOS PROTECTED PARA PODERLO VER DESDE ESFERA
	
	public  Double obtenerPeso() {
		return peso;
	}
	
	/**
	 * Devuelve el volumen de la figura
	 * @return volumen
	 */
	public abstract Double calcularVolumen();
	
	/**
	 * Calcula la densidad el ojeto que es simepre igual
	 * a la masa o peso dividida por el volumen
	 * @return densidad del objeto
	 */
	public  Double calcularDensidad() {
		return obtenerPeso()/calcularVolumen();
	}
	
	public boolean flotaEnElAgua() {
		return calcularDensidad()<DENSIDAD_AGUA;
	}
	
}
