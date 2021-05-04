package ejercicio1;

import java.util.Comparator;

public class OrdenarPorLocalidad implements Comparator<Generador> {

	@Override
	public int compare(Generador o1, Generador o2) {
		
		int resultado=0;
		
		if(o1.localidad==o2.localidad) {
			resultado=o1.fecha.compareTo(o2.fecha);
		}
		else {
			resultado=o1.localidad.compareTo(o2.localidad);
		}
		
		return resultado;
	}

}
