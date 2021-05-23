package examen;

import java.util.Comparator;

public class OrdenarPorPrioridad implements Comparator <Tareas> {

	//ESTE METODO NO FUNCIONA
	//Mi idea era que si era prioridad baja fuera -1, si era media 0 y si era alta 1 para que asi me lo ordenara correctamente.
	//Me tira error por el enumerado, pero no termino de saber como sacarlo, se me ha ocurrido ponerle que cada uno contenga un valor String con su 
	//nombre para poder llamarlos desde aqui y otras funciones pero no me ha dado tiempo, creo que asi quizas si podria haberlo ordenado correctamente

	@Override
	public int compare(Tareas o1, Tareas o2) {
		int resultado;
		resultado=o1.getPrioridad().compareTo(o2.getPrioridad());
		return 0;
	}

}
