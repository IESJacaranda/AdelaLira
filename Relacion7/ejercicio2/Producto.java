package ejercicio2;

public class Producto {
	
	//static nos permite usarlo en otros metodos dentro de la clase main
	static 
	
	private int codigo;
	private String descripcion;
	private double precio;
	private int IVA=20;
	
	public Producto () {
		
	}
	
	public Producto (int codigo, String descripcion, double precio) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	
	public double calculaPrecio() throws Exception {
		if (this.IVA>0 && this.IVA<100) {
			double calculoIva=(precio*IVA)/100;
			precio = precio + calculoIva;
		}
		else {
			throw new Exception ("IVA incorrecto");
		}
		
		return precio;
	}
	
	
	/**
	 * Con este metodo consultamos todos los datos del producto
	 */
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", IVA=" + IVA
				+ "]";
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		
		if(this==obj) {
			sonIguales=true;
		}
		
		else if (obj!=null && obj instanceof Producto
		&& ((Producto)obj).getCodigo()==(this.codigo)
		&& ((Producto)obj).getDescripcion().equals(this.descripcion)
		&& ((Producto)obj).getPrecio()==(this.precio)
		&& ((Producto)obj).getIVA()==(this.IVA)) {	
		}
		
		return sonIguales;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	
}
