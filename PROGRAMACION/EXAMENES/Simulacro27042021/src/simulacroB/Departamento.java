package simulacroB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.Iterator;

public class Departamento {

	private String nombre;
	private ArrayList<Empleado> listaEmpleados;
	
	public Departamento(String nombre) {
		this.nombre=nombre;
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	public boolean addEmpleados(EmpleadoBase empleado) {
		boolean existe = false;
		if(listaEmpleados.contains(empleado)) {
			System.out.println("Exceptio");
			existe=false;
		}
		else {
			listaEmpleados.add(empleado);
			existe=true;
		}
		
		return existe;
	}
	
	public boolean addJefe(JefeDepartamento empleado) {
		boolean existe = false;
		Iterator<Empleado> sig =listaEmpleados.iterator();
		while(!existe && sig.hasNext()) {
			Empleado e = sig.next();
			if(e instanceof JefeDepartamento) {
				existe=true;
			}
		}
		if(existe=true) {
			System.out.println("Exception");
		}
		else {
			listaEmpleados.add(empleado);
		}

		
		return existe;
	}

	public String ordenarPorSueldito() {
		StringBuilder sb = new StringBuilder();
		
		
		Collections.sort(listaEmpleados, new OrdenarPorSueldo());
		for (Empleado e : listaEmpleados) {
			sb.append(e + "\n");
		}
		
		return sb.toString();
	}
	
	public String ordenarDepartamentosPorNombre() {
		StringBuilder sb = new StringBuilder();
		
		
		Collections.sort(listaEmpleados, new OrdenarPorNombres());
		for (Empleado e : listaEmpleados) {
			sb.append(e + "\n");
		}
		
		return sb.toString();
	}
	
	public String listarEmpleados() {
		StringBuilder sb = new StringBuilder();
		
		for (Empleado e : listaEmpleados) {
			sb.append(e + "\n");
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", listaEmpleados=" + listaEmpleados + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public double obtenerSueldo() {

		double sueltoTotal=0.0;
		
		for (Empleado e : listaEmpleados) {
			sueltoTotal=sueltoTotal+e.getSueldo();
		}
		return sueltoTotal;
	}
	
	
	
}
