package ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ejercicio1.Alumno;

public class Historial {

	List<PaginaWeb> listaPaginas;
	
	
	public Historial() {
		this.listaPaginas = new ArrayList<PaginaWeb>();
	}
	
	public void addPagina(PaginaWeb datos) {
		listaPaginas.add(datos);

	}
	
	public void consultaHistorialCompleto() {
		StringBuilder sb = new StringBuilder();
		
		for(PaginaWeb i : listaPaginas) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public void consultaHistorialDia(LocalDate dia) {
		
//		StringBuilder sb = new StringBuilder();
//		
//		for(PaginaWeb i : listaPaginas) {
//			if(dia= )
//			sb.append(i+"\n");
//		}
//		System.out.println(sb.toString());
	}
	
	public void borraHistorial() throws HistorialVacioException{
		
		if(listaPaginas.size()>0) {
			listaPaginas.clear();
		}
		else {
			throw new HistorialVacioException();
		}
		
		
	}
	
	
}
