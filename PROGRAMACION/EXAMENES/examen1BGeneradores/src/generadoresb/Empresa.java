package generadoresb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Empresa {

	private String nombre;
	List <Generador>listaGeneradores;
	
	public Empresa(String nombre) {
		this.nombre=nombre;
		listaGeneradores=new ArrayList<Generador>();
	}
	
	//Este metodo agrega nuevos generadores solares a la lista
	public void addGeneradorSolar(GeneradorSolar generador) {
		listaGeneradores.add(generador);
		
		
	}
	
	//Este metodo agrega nuevos generadores eolicos a la lista
	public void addGeneradorEolico(GeneradorEolico generador) {
		listaGeneradores.add(generador);
	}
	
	//Este metodo muestra todos los generadores pero ordenador por fecha
	public String generadoresOrdenadosPorFecha() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaGeneradores, new OrdenarPorFecha());
		for (Generador e : listaGeneradores) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	//Este metodo muestra todos los generadores ordenador por localidad
	public String generadoresOrdenadosPorLocalidad() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaGeneradores, new OrdenarPorLocalidad());
		for (Generador e : listaGeneradores) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	//Este metodo muestra los generadores eolicos de la empresa
	public String listarGeneradoresEolicos() {
		StringBuilder sb = new StringBuilder();
		for (Generador e : listaGeneradores) {
			if(e instanceof GeneradorEolico) {
				sb.append(e + "\n");
			}
		}
		return sb.toString();
	}
	
	public String listarGeneradoresSolares() {
		StringBuilder sb = new StringBuilder();
		for (Generador e : listaGeneradores) {
			if(e instanceof GeneradorSolar) {
				sb.append(e + "\n");
			}
		}
		return sb.toString();
	}
	
	//Este metodo elimina los generadores eolicos segun el codigo que indiquemos
	public boolean removeGenerador(int codigo) {
		boolean existe=false;
		Iterator<Generador> sig = listaGeneradores.iterator();

		while (existe == false && sig.hasNext() ){
			Generador e = sig.next();
			if(e.getCodigo()==codigo) {
				listaGeneradores.remove(e);
				existe=true;
			}
		}
		return existe;
	}
	
	//Este metodo muestra la energia total de todos los generadores, es decir la suma de la potencia de todos ellos
	public double totalEnergia() {
		double energiaTotalEmpresa=0.0;
		for (Generador e : listaGeneradores) {
			energiaTotalEmpresa=energiaTotalEmpresa+e.getPotencia();
		}
		return energiaTotalEmpresa;
	}
	
	//Este metodo busca si en la localidad indicada existen generadores
	public boolean existeGeneradorLocalidad(String localidad) {
		boolean existe=false;
		Iterator<Generador> sig = listaGeneradores.iterator();

		while (existe == false && sig.hasNext() ){
			Generador e = sig.next();
			if(e.getLocalidad().equals(localidad)) {
				existe=true;
			}
		}
		return existe;
	}
	
	
	
	
	
}
