package TareasB;

import java.time.LocalDate;

public class TareaCliente extends Tarea {

	private String nombre;
	private String ciudad;
	
	public TareaCliente(String descripcion, LocalDate fechaAlta, String prioridad, String nombre, String ciudad) {
		super(descripcion, fechaAlta, prioridad);
		this.nombre=nombre;
		this.ciudad=ciudad;
	}

	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "nombre cliente: " + nombre + " nombre ciudad: " + ciudad;
	}
	
}
