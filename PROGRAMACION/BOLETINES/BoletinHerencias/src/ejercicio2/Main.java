package ejercicio2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ( "Adela", "5684235S");
		
		LocalDate ld1 = LocalDate.of(2021,03,21);
		LocalDate ld2 = LocalDate.of(2021,03,23);
		Alquiler alquiler1 = new Alquiler (ld1, ld2 ,2);
		
		Velero velero1 = new Velero( 32, 3.0, 1996, 2);
		Yate yate1 = new Yate (65,2.0,2003,300.5,11);
		Deportivo deportivo1 = new Deportivo (65,8.0,2003,500.5);
		
		alquiler1.calculaAlquiler();

	}

}
