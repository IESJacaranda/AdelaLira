package examen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class TareaCliente extends Tareas{

	private String nombre;
	private String ciudad;
	protected TipoPrioridad tipo;
	
	public TareaCliente(LocalDate fechaInicio, String descripcion, String nombre, String ciudad, TipoPrioridad tipo) {
		super(fechaInicio, descripcion);
		this.nombre=nombre;
		this.ciudad=ciudad;
		this.tipo=tipo;
	}

	//Este metodo nos devuelve el numero de dias transcurridos entre el dia de creación de la tarea y ahora mediante un ChronoUnit.DAYS.between
	//al que le introducimos una fecha por parametros en el main y el dia de hoy.
	//LA excepcion la he añadido aunque no se pida porque nos dice que el numero de dias debe ser positivo, y asi controlamos la situacion, pues 
		//le decimos que si la fecha que introducimos es anterior a la actual nos lo calcule, y sino que no haga el calculo, pues el ejercicio nos pide
		//que el numero sea positivo
	@Override
	public int numeroDias(LocalDate fecha) throws DiasPositivosException {
		int aux = 0;
		if(fecha.isBefore(LocalDate.now())) {
			aux = (int)ChronoUnit.DAYS.between(fecha, LocalDate.now()); 
		}
		else {
			throw new DiasPositivosException();
		}
		return aux;
	}

	//El toString es necerario para imprimir los atributos en la lista, por ejemplo en el mostrarTareas()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", prioridad: " + prioridad;
	}
	
	
}
