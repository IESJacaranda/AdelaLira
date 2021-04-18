package ejercicio7JM;

public class Alumno extends Persona implements Comparable<Alumno>{

	private double nota;
	
	public Alumno(String nombre, String apellido1, String apellido2, double nota) {
		super(nombre, apellido1, apellido2);
		this.nota=nota;
	}

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " y su nota es: " + this.nota;
	}




	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}




	@Override
	public int compareTo(Alumno o) {
		int compararResultado = 0;
		if(this.nota>o.getNota()) {
			compararResultado = 1;
		}
		else if (this.nota<o.getNota()) {
			compararResultado = -1;
		}
		return compararResultado;
	}
	
	public int compareToName(Alumno n) {
		int compararResultado = 0;
		if(this.nombre>n.getNombre()) {
			compararResultado = 1;
		}
		else if (this.nombre<n.getNombre()) {
			compararResultado = -1;
		}
		return compararResultado;
	}
	
	
}
