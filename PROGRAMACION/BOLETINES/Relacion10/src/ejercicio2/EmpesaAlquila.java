package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Reserva;
import model.iterator;


public class EmpesaAlquila {

	List<Vehiculo> vehiculo;
	List<Alquiler> alquiler;
	
	
	public EmpesaAlquila() {
		vehiculo = new ArrayList<Vehiculo>();
		alquiler = new ArrayList<Alquiler>();
	}
	
	
	public void inicializaVehiculos() {
		vehiculo.add(new Microbus("2511SH"));
		vehiculo.add(new Microbus("5762NU"));
		vehiculo.add(new Coche("1274TY"));
		vehiculo.add(new Coche("28593JL"));
		vehiculo.add(new Furgoneta("3745LK"));
		vehiculo.add(new Furgoneta("3333SH"));

	
		alquiler.add(new Alquiler(LocalDate.now().plusDays(50),LocalDate.now().plusDays(51), vehiculo.get(0)));
		alquiler.add(new Alquiler(LocalDate.now().plusDays(10),LocalDate.now().plusDays(11) , vehiculo.get(0)));
		alquiler.add(new Alquiler(LocalDate.now(),LocalDate.now() , vehiculo.get(0)));
	
	}
	
	public void listarVehiculos() {
		StringBuilder sb = new StringBuilder();
		
		for(Vehiculo i : vehiculo) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
		
	}

	
	public void listarAlquileresEnFecha(LocalDate fechaLimite) {
		
		Iterator iterator = alquiler.iterator();
		while(iterator.hasNext()){
			Alquiler a = new iterator.next();
			if(a.getFechaInicio().isAfter(fechaLimite)) {
				System.out.println(a.getVehiculo());
			}
		}
	}
	
	
	
}
