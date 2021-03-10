package ejercicio1;

public class Profesor extends Personal {
	private String departamento;
	private String modulo;
	private int curso;
	
	public Profesor () {
		super();
	}
	public Profesor(String nombre, int edad, String genero, String horario, String contraseña) {
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
	
	
}
