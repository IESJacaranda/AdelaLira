package ejercicio5;

public class Alumno extends Persona {

	private int edad;
	
	public Alumno(String nombre, String DNI, int edad) {
		super(nombre, DNI);
		this.edad=edad;
	}

	



	@Override
	public String toString() {
		return nombre + " ";
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
