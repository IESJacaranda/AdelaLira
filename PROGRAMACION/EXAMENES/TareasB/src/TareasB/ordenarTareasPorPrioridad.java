package TareasB;

import java.util.Comparator;

public class ordenarTareasPorPrioridad implements Comparator <Tarea> {

	@Override
	public int compare(Tarea o1, Tarea o2) {
		int var=0;
		
		if(o1.getPrioridad().getTiempo()>o2.getPrioridad().getTiempo()) {
			var=1;
		}else if(o1.getPrioridad().getTiempo()<o2.getPrioridad().getTiempo()) {
			var=-1;
		}else if(o1.getPrioridad().getTiempo()==o2.getPrioridad().getTiempo()) {
			var=o1.getDescripcion().compareTo(o2.getDescripcion());
		}
	
		return var;
	}

}
