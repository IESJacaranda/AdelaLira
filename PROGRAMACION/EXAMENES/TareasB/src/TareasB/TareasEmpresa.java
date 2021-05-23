package TareasB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TareasEmpresa extends Tarea{

	private String departamento;
	
	public TareasEmpresa(String descripcion, LocalDate fechaAlta, String prioridad,String departamento) {
		super(descripcion, fechaAlta, prioridad);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "departamento: " + departamento;
	}

	
	
}
