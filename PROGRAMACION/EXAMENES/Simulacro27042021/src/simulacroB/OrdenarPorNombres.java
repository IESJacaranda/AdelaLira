package simulacroB;

import java.util.Comparator;

public class OrdenarPorNombres implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int resultado;
		resultado=o1.getNombre().compareTo(o2.getNombre());
		return resultado;
	}

}
