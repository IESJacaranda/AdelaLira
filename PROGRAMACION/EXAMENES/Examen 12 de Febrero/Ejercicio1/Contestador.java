package Ejercicio1;

public class Contestador {
	
	private String mensaje1="Hola, ¿Como estas hoy?, recorde que ayer fuiste al médico";
	private String mensaje2;
	
	public Contestador() {}
	
	
	public String borrarMensajes () {
		mensaje1.replace(mensaje1, "");
		mensaje2.replace(mensaje2, "");
		return "Mensaje borrado";

	}
	
	public String añadirMensaje (String mensaje) {
		StringBuilder mensaje2= new StringBuilder("");
		mensaje2.append(mensaje);
		return "Mensaje añadido";
	}
	
	

	public String getMensaje1() {
		return mensaje1;
	}

	public void setMensaje1(String mensaje1) throws Exception {
		if (mensaje1!="") {
			this.mensaje1 = mensaje1;
			System.out.println(mensaje1);
		}
		else if (mensaje1=="") {
			throw new Exception ("No existe");
		}
		
	}

	public String getMensaje2() {
		return mensaje2;
	}

	public void setMensaje2(String mensaje2) throws Exception {
		if (mensaje2!="") {
			this.mensaje2 = mensaje2;
			System.out.println(mensaje2);
		}
		else if (mensaje2==null) {
			throw new Exception ("No existe");
		}
	}

	public int consulta () {
		int numero=0;
		if (mensaje1=="" && mensaje2=="") {
			numero=0;
		}
		else if (mensaje1!="" && mensaje2=="") {
			numero=1;
		}
		if (mensaje1!="" && mensaje2!="") {
			numero=0;
		}
		return numero;
	}


	@Override
	public String toString() {
		return "mensaje1=" + mensaje1 + ", mensaje2=" + mensaje2 + "]";
	}
	
	
}
