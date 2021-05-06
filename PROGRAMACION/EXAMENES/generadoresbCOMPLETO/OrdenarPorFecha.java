package generadoresb;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator<Generador>{

	@Override
	public int compare(Generador o1, Generador o2) {
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
