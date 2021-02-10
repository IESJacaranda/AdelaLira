package orientacionObjetos;

public class Estudiante extends Persona {

	private int nota;
	public Estudiante() {
		
	}

	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public String toString(){
		return this.getNombre(); 
	}
}
