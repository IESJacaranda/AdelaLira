package Ejercicio2;

public class Contraseña {
	
	private String contraseña;
	
	public Contraseña () {	}
	
	public Contraseña(String contraseña) {
		this.contraseña=contraseña;
	}
	
	public StringBuilder comprime () {
		int letraA=0;
		int letraB=0;

		StringBuilder pass = new StringBuilder(); 
		for (int i = 0; i < contraseña.length(); i++){
			if(contraseña.charAt(i)==contraseña.charAt(i)-1) {
				letraA=letraA+1;
				pass.append(letraA);
				}
			else {
				letraB=letraB+1;
				pass.append(letraB);
			}
			}
		
		return pass;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	
}
