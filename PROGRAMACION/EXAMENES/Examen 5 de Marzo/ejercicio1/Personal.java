package ejercicio1;

import java.util.Objects;

public class Personal {
	
	private String nombre;
	private int edad;
	private String genero;
	private String horario;
	private int codigo;
	private String contrasena;
	
	public Personal(){
		super();
	}
	
	public Personal(String nombre, int edad, String genero, String horario, String contraseña) {
		this();
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
		this.horario=horario;
		this.contrasena=contraseña;
	}
	
	@Override
	public int hashCode() { 
		return Objects.hash(nombre,edad,genero,horario,contrasena); 
		}
	
	public boolean comprobarContrasena() throws Exception{
		boolean contraseñaCorrecta=false;
		if(this.contrasena==null) {
			contraseñaCorrecta=false;
			throw new Exception("Esta contraseña no es valida, es nula");
		}
		else if(this.contrasena.length()>9) {
			int esNumero=0;		
			
			for (int i = 0; i < contrasena.length(); i++) {
				contraseñaCorrecta=true;		
				if (Character.isDigit(contrasena.charAt(i))) {
					esNumero++;
					}
				
				
			}
			if(esNumero>2) {
				contraseñaCorrecta=true;
			}
			else {
				throw new Exception("Esta contraseña no es valida");
			}

			
		}
		return contraseñaCorrecta;
	}

	
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", horario=" + horario
				+ ", codigo=" + hashCode() + ", contraseña=" + contrasena + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getContraseña() {
		return contrasena;
	}

	public void setContraseña(String contraseña) {
		this.contrasena = contraseña;
	}
	
}
