package enumerados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Prueba {

	public static void main (String [] args) {
		
			Dia dia = Dia.MARTES;
			System.out.println(dia.getDiaSemana());
			System.out.println(Dia.DOMINGO);
			
			
			java.util.Date date;
			
			LocalDate ld = LocalDate.now();
			ld.plusDays(366);
			
			LocalDate ld1 = LocalDate.of(2011,3,3);
			LocalDate ld2 = LocalDate.parse("2018-03-15");
			
			System.out.println(ld1.isAfter(ld2));
			
			
			LocalTime lt = LocalTime.now();
			LocalTime lt1 = LocalTime.of(15,33,12);
			LocalTime lt2 = LocalTime.parse("11:00:59");
			System.out.println(lt1.isAfter(lt2));
			
			
			LocalDateTime ldt;
			

		}
	

	
}
