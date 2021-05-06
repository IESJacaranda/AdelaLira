package generadoresb;

import java.util.Comparator;

public class OrdenarPorLocalidad implements Comparator<Generador> {

	@Override
	public int compare(Generador o1, Generador o2) {
		int resultado;
		if(o1.getLocalidad()==o2.getLocalidad()) {
			resultado= o1.getFechaInicio().compareTo(o2.getFechaInicio());
		}
		else {
			resultado=o1.getLocalidad().compareTo(o2.getLocalidad());
		}

		return resultado;
	}

	
}
