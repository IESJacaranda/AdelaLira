package ejercicio5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import ejercicio1.Alumno;

public abstract class Persona {
	
	protected String nombre;
	private String DNI;
	HashSet<Mensaje>buzon;
	
	public Persona(String nombre, String DNI) {
		this.nombre=nombre;
		this.DNI=DNI;
		buzon = new HashSet<Mensaje>();
	}
	
	public  void enviarMensajes(Persona destino, String mensaje) {
		buzon.add(new Mensaje(destino, mensaje, LocalDateTime.now()));	
	}
	
	public void leerMensajes() {
		StringBuilder sb = new StringBuilder();
		int contador=1;
		
		for(Mensaje i : buzon) {
			sb.append("Mensaje " +contador+ " " +i+"\n");
			contador++;
		}
		System.out.println(sb.toString());
		
	}
	
	public void leerMensajesOrdenados(String destino) {
		
	}
	
	public void borrarMensaje(String numeroMensaje) {
		
	}

	
	
//	public String contieneFrase(String frase) {
//		 
//		StringBuilder respuesta = new StringBuilder();
//		
//		for(Mensaje mensaje : buzon) {
//			if(mensaje.contains(frase)) {
//				respuesta.append(frase);
//			}
//		}	
//		
//		
//	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", buzon=" + buzon + "]";
	}

}
