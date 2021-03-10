package ejercicio1;

public class PersonalDeAdministracion extends Personal {
	
	private String ubicacion;
	private int numero;
	private String area;
	
	public PersonalDeAdministracion() {
		super();
	}

	public PersonalDeAdministracion (String nombre, int edad, String genero, String horario, String contraseña) {
		super(nombre, edad, genero, horario, contraseña);
	}

	@Override
	public boolean comprobarContrasena() throws Exception {
		// TODO Auto-generated method stub
		return super.comprobarContrasena();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	

	
}
