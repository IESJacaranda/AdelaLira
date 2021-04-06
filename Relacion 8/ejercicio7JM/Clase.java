package ejercicio7JM;

import java.util.ArrayList;
import java.util.List;

public class Clase {

	//DECLARO LA LISTA DE ALUMNOS. SI NO INICIALIZO ES NULL
	private List <Alumno> alumnos;
	//private List <> notas;
	
	private static final double NOTA_APROBADO = 5.0;
	
	public Clase () {
		super();
		//INICIALIZO LA LISTA DE CLASE
		alumnos = new ArrayList<Alumno>();
	}
	
	public void addAlumno (Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	
	
	/**
	 * Hace una lista de aprobados
	 * @return
	 */
	public String getAlumnosAprobados() {
		StringBuilder aprobados = new StringBuilder ("Lista de alumnos aprobados: \n");
		
		/**
		 * for (Alumno al : alumnos) {
		 * 		if (al.getNota()>=NOTA_APROBADO){
		 * 			aprobados.appen(al.toString()+"\n");
		 * 		}
		 * }
		 */
		
		for (int i = 0; i <alumnos.size(); i++) {
			Alumno al = alumnos.get(i);
			if (al.getNota()>=NOTA_APROBADO) {
				aprobados.append(al.toString() + "\n");
			}
		}
		return aprobados.toString();
	}
	
		/**
		 * Hace una lista de numeros suspensos
		 * @return
		 */
		public String getAlumnosSuspensos() {
			StringBuilder suspensos = new StringBuilder ("Lista de alumnos suspensos: \n");
			
			/**
			 * for (Alumno al : alumnos) {
			 * 		if (al.getNota()<=NOTA_APROBADO){
			 * 			suspensos.appen(al.toString()+"\n");
			 * 		}
			 * }
			 */
			
			for (int i = 0; i <alumnos.size(); i++) {
				Alumno al = alumnos.get(i);
				if (al.getNota()<=NOTA_APROBADO) {
					suspensos.append(al.toString() + "\n");
				}
			}
		return suspensos.toString();
	}
	
		/**
		 * Da la nota media de la clase
		 * @return
		 */
		public double getNotaMediaClase() {
			double sumaNotas = 0.0;
			double resultado= 0;
			
			for (Alumno alumno : alumnos) {
				sumaNotas+=alumno.getNota();	
			}
			
			if (!alumnos.isEmpty()) { //SI LA LISTA NO ESTA VACIA ENTRA POR EL SIGNO !!!!!!!!!!!!!!!!
				resultado = sumaNotas/alumnos.size();
			}
			return resultado;
		}
}
