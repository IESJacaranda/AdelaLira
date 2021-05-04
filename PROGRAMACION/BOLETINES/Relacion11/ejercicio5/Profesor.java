package ejercicio5;

public class Profesor extends Persona {

	public Profesor(String nombre, String DNI) {
		super(nombre, DNI);
	}

	@Override
	public String toString() {
		return "Profesor []";
	}

	@Override
	public void enviarMensajes(Persona destino, String mensaje) {
		// TODO Auto-generated method stub
		super.enviarMensajes(destino, mensaje);
	}



	@Override
	public void leerMensajes() {
		// TODO Auto-generated method stub
		super.leerMensajes();
	}

	@Override
	public void leerMensajesOrdenados(String destino) {
		// TODO Auto-generated method stub
		super.leerMensajesOrdenados(destino);
	}

	@Override
	public void borrarMensaje(String numeroMensaje) {
		// TODO Auto-generated method stub
		super.borrarMensaje(numeroMensaje);
	}




	
}
