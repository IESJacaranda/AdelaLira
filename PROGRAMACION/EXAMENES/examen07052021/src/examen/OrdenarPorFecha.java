package examen;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Tareas> {
	//ENTIENDO QUE ES POR VA POR AÑOS, LOS MAS PEQUEÑOS ANTES Y LUEGO MAS GRANDES
	//vEMOS QUE SI LA fecha es inferior es -1 si es igual 0 y si es mayor 1. Esto es porque Collections.sort te lo ordena con -1, 0, 1
	//Asi le indicamos el orden que queremos

	@Override
	public int compare(Tareas o1, Tareas o2) {
		int resultado;
		if(o1.getFechaInicio().isBefore(o2.getFechaInicio())) {
			resultado=-1;
		}
		else if(o1.getFechaInicio().isAfter(o2.getFechaInicio())) {
			resultado=0;
		}
		else {
			resultado=0;
		}
		return resultado;
	}

}
