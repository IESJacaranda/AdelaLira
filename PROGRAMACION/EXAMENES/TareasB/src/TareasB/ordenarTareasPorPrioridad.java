package TareasB;

import java.util.Comparator;

public class ordenarTareasPorPrioridad implements Comparator <Tarea> {

	@Override
	public int compare(Tarea o1, Tarea o2) {
		int resultado = 0;
		int prioridad1 = o1.getPrioridad().getTiempo();
		int prioridad2 = o2.getPrioridad().getTiempo();
			if(prioridad1>prioridad2) {
				resultado = -1;
			}
			else if(prioridad1<prioridad2) {
				resultado=1;
			}
			else {
				resultado=o1.getDescripcion().compareTo(o2.getDescripcion());
			}
		return resultado;
	}

}
