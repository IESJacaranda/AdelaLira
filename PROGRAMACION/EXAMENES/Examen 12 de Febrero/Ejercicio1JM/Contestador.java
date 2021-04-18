package Ejercicio1JM;

public class Contestador {
	
	public final String CADENA_VACIA ="";

	private String mensaje1;
	private String mensaje2;
	private String mensaje3;
	
	public Contestador () {
		borrarTodosLosMensajes();
	}
	
	public boolean isBuzonLleno() {
		return CADENA_VACIA.compareTo(mensaje1)
				+ CADENA_VACIA.compareTo(mensaje2)
				+ CADENA_VACIA.compareTo(mensaje3)==3;
		//return(mensaje1!=CADENA_VACIA && mensaje2!=CADENA_VACIA && mensaje3!=CADENA_VACIA);
	}
	
	public int getNumeroMensajes() {
		int numero=0;
		if (mensaje1!=null && mensaje1!=CADENA_VACIA) {
			numero++;
		}
		if (mensaje2!=null && mensaje2!=CADENA_VACIA) {
			numero++;
		}
		if (mensaje3!=null && mensaje3!=CADENA_VACIA) {
			numero++;
		}
		return numero;
	}
	
	public void addMensaje (String mensaje) throws Exception {
		if(isBuzonLleno()) {
			throw new Exception ("El buz�n esta lleno");
		}
		else if (mensaje==null || mensaje.isEmpty() ){
			throw new Exception ("Debe indicar error");
		}
		else {
			if (getMensaje1()!=null && this.mensaje1==CADENA_VACIA) {
				setMensaje1(mensaje);
			}
			else if (getMensaje2()!=null && this.mensaje2==CADENA_VACIA) {
				setMensaje2(mensaje);
			}
			else if (getMensaje3()!=null && this.mensaje3==CADENA_VACIA) {
				setMensaje3(mensaje);
			}
		}
	}
	
	public void borrarTodosLosMensajes() {
		borrarMensaje1();
		borrarMensaje2();
		borrarMensaje3();
	}

	public void borrarMensaje1 () {
		setMensaje1(CADENA_VACIA);
	}
	
	public void borrarMensaje2 () {
		setMensaje2(CADENA_VACIA);
	}
	
	public void borrarMensaje3 () {
		setMensaje3(CADENA_VACIA);
	}

	public String getMensaje1() throws Exception {
		if (mensaje1==null || mensaje1.isBlank()) {
			throw new Exception("El mensaje solicitado no existe");
		}
		return mensaje1;
	}

	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}

	public String getMensaje2() throws Exception {
		if (mensaje1==null || mensaje2.isBlank()) {
			throw new Exception("El mensaje solicitado no existe");
		}
		return mensaje2;
	}

	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}

	public String getMensaje3() throws Exception {
		if (mensaje1==null || mensaje3.isBlank()) {
			throw new Exception("El mensaje solicitado no existe");
		}
		return mensaje3;
	}

	public void setMensaje3(String mensaje3) {
		this.mensaje3 = mensaje3;
	}
	
	
}
