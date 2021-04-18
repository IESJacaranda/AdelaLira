package ejercicio1;

public class PersonalDeDireccion extends Profesor {
	
	private String ubicacion;
	private String competencias;

	
	public PersonalDeDireccion () {
		super();
	}
	
	public PersonalDeDireccion (String nombre, int edad, String genero, String horario, String contraseña) {
		super(nombre, edad, genero, horario, contraseña);
	}

	@Override
	public boolean comprobarContrasena() throws Exception  {
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

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	
	
	
}
