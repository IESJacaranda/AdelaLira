package ejercicio1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private List<GeneradorEolico> listaEolicos;
	private List<GeneradorSolar> listaSolares;
	
	public Empresa (String nombre) {
		this.nombre=nombre;
		this.listaEolicos=new ArrayList<GeneradorEolico>();
		this.listaSolares=new ArrayList<GeneradorSolar>();
	}

	public void addGeneradorEolico(GeneradorEolico generador) {
		LocalDate ld1 = LocalDate.of(2015, 03, 15);
		LocalDate ld2 = LocalDate.of(2018, 11, 02);
		listaEolicos.add(new GeneradorEolico(0,ld1, "Lora del rio", 5, 3));
		listaEolicos.add(new GeneradorEolico(0,ld2, "Sevilla", 5, 3));
		listaEolicos.add(generador);

	}
	
	public void addGeneradorSolar(GeneradorSolar generador){
		listaSolares.add(generador);
	}
	
	public String mostrarGeneradorPorFecha() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaEolicos);
		for(GeneradorEolico e : listaEolicos) {
			sb.append(e+ "\n");
		}
		
		
		return (sb.toString());
		
		
	}
	
	public String mostrarGeneradorPorLocalidad() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(listaEolicos, new OrdenarPorLocalidad());
		for(Generador e : listaEolicos) {
			sb.append(e+ "\n");
		}
		
		return (sb.toString());
	}	
	
	public void mostrarGeneradoresEmpresa() {
		StringBuilder sb = new StringBuilder();
		
		for(GeneradorEolico i : listaEolicos) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public void borrarGenerador(int codigo) {
		if(listaEolicos.contains(GeneradorEolico.getCONTADOR_CODIGO()==codigo)) {
			listaEolicos.remove(GeneradorEolico.codigo);
		}
	}
	
	public double energiaEmpresa() {
		double energiaTotalEmpresa = 0.0;
		for (GeneradorEolico g : listaEolicos) {
			energiaTotalEmpresa=energiaTotalEmpresa+g.getPotencia();
		}
		return energiaTotalEmpresa;
	}
	
	public boolean existeGeneradorLocalidad(String localidad) {
		boolean respuesta = false;
		String localidadMinuscula=localidad.toUpperCase();
		for(GeneradorEolico i: listaEolicos) {
			if(i.localidad.toUpperCase().equals(localidadMinuscula)) {
				respuesta=true;
				System.out.println("Generador en localidad");
			}
		}
		return respuesta;
	}
	
	
	public void listarGeneradoresSolares() {
		StringBuilder sb = new StringBuilder();
		
		for(GeneradorSolar i : listaSolares) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}

	public String listarInstalacionesEnFecha() {
		StringBuilder sb = new StringBuilder();

		for(GeneradorEolico i: listaEolicos) {
			sb.append(i + "\n");
			}
		return (sb.toString());
		}
		
}

