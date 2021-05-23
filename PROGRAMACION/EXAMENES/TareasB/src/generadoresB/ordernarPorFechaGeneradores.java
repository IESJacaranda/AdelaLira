package generadoresB;

import java.util.Comparator;

public class ordernarPorFechaGeneradores implements Comparator<Generadores> {


	@Override
	public int compare(Generadores o1, Generadores o2) {
		int resultado;
		if(o1.getFechaComienzo().isBefore(o2.getFechaComienzo())) {
			resultado= -1;
		}
		else if (o1.getFechaComienzo().isAfter(o2.getFechaComienzo())) {
			resultado=1;
		}
		else {
			resultado=0;
		}
		return resultado;
	}

}
