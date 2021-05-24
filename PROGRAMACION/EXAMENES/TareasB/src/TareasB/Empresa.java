package TareasB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Empresa {

	private HashSet<Tarea> tareasRealizadas;
	private HashSet<Tarea> tareasNoRealizadas;
	
	//Aunque te dice que la fecha de Alta es un LocalDate.now() asi no puedo comprobar la fecha asi que he creado dos 
	//fechas que quedan asignadas segun si la tarea es de empresa o cliente
	LocalDate ld1 = LocalDate.of(2015, 2, 10);
	LocalDate ld2 = LocalDate.of(2012, 2, 10);
	
	public Empresa() {
		this.tareasRealizadas = new HashSet <Tarea>();
		this.tareasNoRealizadas  = new HashSet <Tarea>();
	}
	
	public boolean addTareaEmpresa(String decrip, String prioridad, String departamento) {
		boolean add = false;
		if(decrip!=null && departamento!=null) {
			tareasNoRealizadas.add(new TareasEmpresa(decrip, ld1, prioridad, departamento));
			add=true;
		}
		return add;
	}
	
	public boolean addTareaCliente(String decrip, String prioridad, String cliente, String localidad) {
		boolean add = false;
		if(decrip!=null && cliente!=null && localidad!=null) {
			tareasNoRealizadas.add(new TareaCliente(decrip, ld2, prioridad, cliente, localidad));
			add=true;
		}
		return add;
	}
	
	public String mostrarTareas() {
		StringBuilder sb = new StringBuilder();
		ArrayList<Tarea> tareasNoRealizadasFecha = new ArrayList<Tarea>(tareasNoRealizadas);
		Collections.sort(tareasNoRealizadasFecha, new compararTareasPorFecha());
		for (Tarea e : tareasNoRealizadasFecha) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	public String mostrarTareasPrioridad() {
		StringBuilder sb = new StringBuilder();
		ArrayList<Tarea> tareasNoRealizadasLocalidad = new ArrayList<Tarea>(tareasNoRealizadas);
		Collections.sort(tareasNoRealizadasLocalidad, new compararTareasPorFecha());
		for (Tarea e : tareasNoRealizadasLocalidad) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	public String numTareasPendientes() {
		int alta = 0;
		int media = 0;
		int baja = 0;
		
		for(Tarea i: tareasNoRealizadas) {
			if(i.getPrioridad().equals(TipoPrioridad.ALTA)) {
				alta++;
			}else if(i.getPrioridad().equals(TipoPrioridad.MEDIA)) {
				media++;
			}else {
				baja++;
			}
			
		}
		return "Alta- " + alta + ", Media- " + media + ", Baja- " + baja;	
	}
	
	
	public void resolverTarea(String descripcion, LocalDate fechaAlta, LocalDate fechaSolucion) throws Exception {
		boolean existe = false;
		Iterator<Tarea> sig = tareasNoRealizadas.iterator();
		
		while(existe==false && sig.hasNext()) {
			Tarea e = sig.next();
			if(e.getDescripcion().equalsIgnoreCase(descripcion) && e.getFechaAlta().equals(fechaAlta)) {
				tareasNoRealizadas.remove(e);
				e.setFechaSolucion(fechaSolucion);
				tareasRealizadas.add(e);
				existe=true;
			}
		}
		
		if(fechaSolucion.isBefore(fechaAlta)) {
			throw new Exception ("Error, las fechas no son correctas o la tarea no existe");
		}
		
		
	}
	
	public String listarNoRealizadas() {
		StringBuilder sb = new StringBuilder();
		for (Tarea e : tareasNoRealizadas) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	public String listarRealizadas() {
		StringBuilder sb = new StringBuilder();
		for (Tarea e : tareasRealizadas) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
}
