package model;

import java.time.LocalDate;
import java.util.ArrayList;
import com.sun.tools.javac.util.List;

public class Hotel {
	
	List<AbsInstalacion> instalaciones;
	List<Reserva> reservas;
	
	public Hotel() {
		super();
		instalaciones = new ArrayList<AbsInstalacion>();
		reservas = new ArrayList<>();
	}
	
	
	
	
	

	private ArrayList<Habitacion> habitaciones;
	
	public void inicializaHotel() {
		instalaciones.add(new HabitacionSimple());
		instalaciones.add(new HabitacionSimple());
		instalaciones.add(new HabitacionSimple());
		instalaciones.add(new HabitacionSimple());
		instalaciones.add(new HabitacionSimple());
		instalaciones.add(new HabitacionDoble());
		instalaciones.add(new HabitacionDoble());
		instalaciones.add(new HabitacionDoble());
		instalaciones.add(new Suite());
		instalaciones.add(new SalaReuniones());
		instalaciones.add(new SalaReuniones());
		instalaciones.add(new SalaCelebraciones());
		instalaciones.add(new SalaCelebraciones());
	}
	
	
	public void inicializarHotel() {
				
		habitaciones = new ArrayList<Habitacion>();
		
		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		Habitacion h3 = new Habitacion();
		Habitacion h4 = new Habitacion();
		Habitacion h5 = new Habitacion();
		
		habitaciones.add(h1);
		habitaciones.add(h2);
		
	}


	public void listarInstalaciones() {
		StringBuilder sb = new StringBuilder();
		
		for(AbsInstalacion i : instalaciones) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
		
	}


	public void calcularIngresosGenerados() {
		// TODO Auto-generated method stub
		
	}


	public void listarInstalacionesEnFecha(LocalDate obtenerFecha) {
		// TODO Auto-generated method stub
		
	}


	public void listarReservaInstalaciones() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//lista reservas
	
	//lista instalaciones
}
