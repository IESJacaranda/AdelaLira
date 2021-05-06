package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Departamento implements Comparable<Empleado>{
	
	public final static int MAXIMO_NUM_JEFE_DEPARTAMENTO = 1;
	
	private String nombre;
	
	List<EmpleadoBase> empleados;
	List<JefeDepartamento> jefeDepartamento;
	
	public Departamento(String nombre) {
		this.nombre=nombre;
		empleados = new ArrayList<EmpleadoBase>();
		jefeDepartamento = new ArrayList<JefeDepartamento>();
	}

	
	public void añadirEmpleados() {
		empleados.add(new Administrativo("4852345F", "Benito", 0));
		empleados.add(new Operario("5951755Y", "Veronica", 0));
		empleados.add(new Contable("54326787L", "Juan", 0));
	}

	public void añadirJefe() {
			jefeDepartamento.add(new JefeDepartamento("5689465G","Paco",1400));
			//NECESITA UNA EXCEPCION QUE NO PERMITA QUE HAY MAS DE UNO
	}

	public void listarEmpleados() {
		StringBuilder sb = new StringBuilder();
		
		for(Empleado i : empleados) {
			sb.append(i+"\n");
		}
		System.out.println(sb.toString());
		
	}

	public String obtenerSueldo() {
		// TODO Auto-generated method stub
		return null;
	}

	


	@Override
	public String toString() {		
		
		return "Departamento []";
		
	}



	public char[] toStringSueldo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int ordenarPorNombre(Empleado e) {
		return this.nombre.compareToIgnoreCase(e.nombre);
		//HAY QUE ORDENAR CON SORT
	}


	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		//ORDENAR SUELDOS
		return 0;
	}

	

}
