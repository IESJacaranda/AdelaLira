package ejercicio2;

import java.time.LocalDate;
import java.util.List;



public class Alquiler{

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Vehiculo vehiculo; 
	List<Cliente> clientes;
	
	public Alquiler() {
		super();
	}
	
	public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, Vehiculo vehiculo) {
		this();
		this.fechaFin=fechaFin;
		this.fechaInicio=fechaInicio;
		this.vehiculo=vehiculo;
	}
	
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "La fecha de inicio del alquiler es " + fechaInicio + ", el final del alquiler es " + fechaFin + 
				", con el vehiculo " + vehiculo;
	}

	

	

	
}
