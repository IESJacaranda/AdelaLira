package generadoresB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Empresa {
	
	//SE PUEDE USAR LIST YA QUE COMO TIENEN CODIGOS DIFERENTES NUNCA SERAN EL MISMO GENERADOR
	private List<Generadores> listaGeneradores;
	private String nombre;
	
	public Empresa(String nombre) {
		this.nombre=nombre;
		this.listaGeneradores=new ArrayList<Generadores>();
	}
	
	
	public void addGeneradorSolar(GeneradorSolar generador) {
		if(!listaGeneradores.contains(generador)){
			listaGeneradores.add(generador);
		}
		else {
			System.out.println("El generador ya esta en el sistema");
		}
	}
	
	public void addGeneradorEolico (GeneradorEolico generador) {
		if(!listaGeneradores.contains(generador)){
			listaGeneradores.add(generador);
		}
		else {
			System.out.println("El generador ya esta en el sistema");
		}
	}
	
	public String ordenarPorFecha() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaGeneradores, new ordernarPorFechaGeneradores());
		for (Generadores e : listaGeneradores) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	public String ordenarPorLocalidad() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaGeneradores, new ordernarPorLocalidadesGeneradores());
		for (Generadores e : listaGeneradores) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	
	public String listarGeneradoresEolicos() {
		StringBuilder sb = new StringBuilder();
		for (Generadores e : listaGeneradores) {
			if(e instanceof GeneradorEolico) {
				sb.append(e + "\n");
			}
		}
		return sb.toString();
	}
	
	public String listarGeneradores() {
		StringBuilder sb = new StringBuilder();
		for (Generadores e : listaGeneradores) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}

	public void eliminarGenerador(int codigo) throws NoGeneradorException {
		boolean existe=false;
		java.util.Iterator<Generadores> sig = listaGeneradores.iterator();
		
		while(existe==false && sig.hasNext()) {
			Generadores e = sig.next();
			if(e.getCodigo() == codigo) {
				listaGeneradores.remove(e);
				existe=true;
			}
			else {
			throw new NoGeneradorException();
		}
		}
	}
	
	public double totalEnergiaSuministrada() {
		double totalEnergia = 0;
		
		for (Generadores e : listaGeneradores) {
			totalEnergia=e.getPotencia()+totalEnergia;
		}
		
		return totalEnergia;
				
		
	}
	
	
	public boolean existeGenerador(String localidad) {
		boolean existe=false;
		java.util.Iterator<Generadores> sig = listaGeneradores.iterator();
		
		if(existe==false && sig.hasNext()) {
			Generadores e = sig.next();
			if(e.getLocalidad().equals(localidad)) {
				existe=true;
			}
		}
		return existe;
	}
	
	
	
	
	
}
