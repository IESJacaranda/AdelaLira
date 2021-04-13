package ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Alquiler {

	private Cliente nombre;
	private Cliente DNI;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int posicionAmarre;
	private Barco barco;
	
	public Alquiler() {
		super();
	}
	
	public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, int posicionAmarre) {
		this();
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.posicionAmarre=posicionAmarre;
	}
	
	public void calculaAlquiler() {
		
		int diasAlquilerTotales = 1;
		double precio = 0.0;
		
		diasAlquilerTotales=(int) ChronoUnit.DAYS.between(fechaInicio, fechaFin)+diasAlquilerTotales;
		
		precio = barco.calcularPrecioEspecial();
				
		System.out.println(precio);
		
	}
	
	
}
