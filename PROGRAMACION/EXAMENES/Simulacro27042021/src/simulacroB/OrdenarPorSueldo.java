package simulacroB;

import java.util.Comparator;

public class OrdenarPorSueldo implements Comparator <Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int resultado;
		
		if(o1.getSueldo()<o2.getSueldo()) {
			resultado=-1;
		}
		else if(o1.getSueldo()>o2.getSueldo()) {
			resultado=1;
		}
		else {
			resultado=0;
		}
		
		return resultado;
	}
	

}
