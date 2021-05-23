package TareasB;

import java.util.Comparator;

public class compararTareasPorFecha implements Comparator <Tarea>{

	@Override
	public int compare(Tarea o1, Tarea o2) {
		return o1.getFechaAlta().compareTo(o2.getFechaAlta());
	}

}
