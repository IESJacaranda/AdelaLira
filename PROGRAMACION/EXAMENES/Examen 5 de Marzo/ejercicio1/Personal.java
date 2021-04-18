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
	
	public Personal(String nombre, int edad, String genero, String horario, String contrase�a) {
		this();
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
		this.horario=horario;
		this.contrasena=contrase�a;
	}
	
	@Override
	public int hashCode() { 
		return Objects.hash(nombre,edad,genero,horario,contrasena); 
		}
	
	public boolean comprobarContrasena() throws Exception{
		boolean contrase�aCorrecta=false;
		if(this.contrasena==null) {
			contrase�aCorrecta=false;
			throw new Exception("Esta contrase�a no es valida, es nula");
		}
		else if(this.contrasena.length()>9) {
			int esNumero=0;		
			
			for (int i = 0; i < contrasena.length(); i++) {
				contrase�aCorrecta=true;		
				if (Character.isDigit(contrasena.charAt(i))) {
					esNumero++;
					}
				
				
			}
			if(esNumero>2) {
				contrase�aCorrecta=true;
			}
			else {
				throw new Exception("Esta contrase�a no es valida");
			}

			
		}
		return contrase�aCorrecta;
	}

	
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", horario=" + horario
				+ ", codigo=" + hashCode() + ", contrase�a=" + contrasena + "]";
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

	public String getContrase�a() {
		return contrasena;
	}

	public void setContrase�a(String contrase�a) {
		this.contrasena = contrase�a;
	}
	
}
