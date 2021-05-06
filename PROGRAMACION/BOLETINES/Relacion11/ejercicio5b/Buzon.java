package ejercicio5b;

import java.util.ArrayList;
import java.util.List;

public class Buzon {

	private List<Mensaje> buzon;
	
	public Buzon() {
		buzon = new ArrayList<Mensaje>();
	}
	
	public void addMensaje(Persona persona, Mensaje mensaje) {
		buzon.add(mensaje);
	}
	
}
