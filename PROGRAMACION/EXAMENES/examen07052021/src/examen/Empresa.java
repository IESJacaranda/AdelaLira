package examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Empresa {
	
	
	List<Tareas> listaTareasARealizar;
	List<Tareas> listaTareasRealizadas;
	
	//Creo que una lista puede ser la mejor opcion para este caso ya que en un momento puede haber mas de una parea que sea igual, tampoco vamos a
	//ningun problema encuanto a repeticiones ya que como cada una tiene un codigo que se asigna de forma automatica nunca tendran el mismo codigo
	//por lo que así, podemos hacer un arrayList sin ningun tipo de problema
	public Empresa() {
		listaTareasARealizar = new ArrayList<Tareas>();
		listaTareasRealizadas = new ArrayList<Tareas>();
	}
	
	
	//Metodo para añadir nuevas tareas de empresa, introduciendole por parametro descripcion, prioridad y departamento.
	public boolean addTareaEmpresa(TareaEmpresa tarea) {
		boolean add=false;
		listaTareasARealizar.add(tarea);
		return add;
		
	}
	
	//Este metodo añade clientes mediante el parametro tarea que recibe del main con los atributos de tareaCliente
	public boolean addTareaCliente(TareaCliente tarea){
		boolean add=false;
		listaTareasARealizar.add(tarea);
		return add;
		
	}
	
	//Este metodo ordena por fechas las diferentes tareas que se han de realizar mediante Collections.sort, al cual le decimos que nos ordene 
	//listaTareasARealizar con la clase OrdenarPorFecha(), esto se hace mediante un ForEach y un StringBuilder donde se iran introduciendo los datos
	//para posteriormente imprimirlos por consola
	//ENTIENDO QUE ES POR VA POR AÑOS, LOS MAS PEQUEÑOS ANTES Y LUEGO MAS GRANDES
	public String mostratTareas() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaTareasARealizar, new OrdenarPorFecha());
		for (Tareas e : listaTareasARealizar) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	//Se que se puede hacer con un Collection.sort creando una clase aparte pero no termina de salirme y tirarme errores por lo que al final no me ha dado tiempo hacerlo
	public String mostrarTareasPrioridad(){	
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaTareasARealizar, new OrdenarPorPrioridad());
		for (Tareas e : listaTareasARealizar) {
			sb.append(e + "\n");
		}
		return sb.toString();
		
	}
	
	//Este metodo se encarga de contar todas los tipos de tarea de cada propiedad que hay
	public String numTareasPendientes() {
		int contadorAltas = 0;
		int contadorMedias = 0;
		int contadorBajas = 0;
		
		for (Tareas e : listaTareasARealizar) {
			if(e.getPrioridad()==TipoPrioridad.ALTA) {
				contadorAltas++;
			}
			else if(e.getPrioridad()==TipoPrioridad.MEDIA) {
				contadorMedias++;
			}
			else if(e.getPrioridad()==TipoPrioridad.BAJA) {
				contadorBajas++;
			}
		}	
		
		return "Alta- " + contadorAltas + ", Medias- " + contadorMedias + ", Bajas- " + contadorBajas;
	}
	
	//En este metodo introducimos una serie de datos, y si encuentra una tarea con los datos que le introducimos por parametro le introduce la 
	//fecha de solucion y despues la añade a la lista de tareas realizadas, eliminandola tambien de las tareas a realizar
	//para que no se pueda cometer ningun tipo de error.
	public void resolverTarea(String descripcion ,LocalDate  fecha, LocalDate fechaSolucion ) {
		
		for (Tareas e : listaTareasARealizar) {
			if(e.getDescripcion()==descripcion && e.getFechaInicio()==fecha) {
				e.setFechaSolucion(fechaSolucion);
				listaTareasRealizadas.add(e);
				listaTareasARealizar.remove(e);
			}
		}
	}
}


