package generadoresB;

import java.util.Comparator;

public class ordernarPorLocalidadesGeneradores implements Comparator <Generadores> {

	@Override
	public int compare(Generadores o1, Generadores o2) {
		int resultado=0;
		
		if(o1.getLocalidad()==(o2.getLocalidad())) {
			resultado=o1.getFechaComienzo().compareTo(o2.getFechaComienzo());
		}
		else {
			resultado=o1.getLocalidad().compareTo(o2.getLocalidad());
		}
		return resultado;
	}

}
