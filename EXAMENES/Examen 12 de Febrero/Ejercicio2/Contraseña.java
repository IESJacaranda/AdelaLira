package Ejercicio2;

public class Contrase�a {
	
	private String contrase�a;
	
	public Contrase�a () {	}
	
	public Contrase�a(String contrase�a) {
		this.contrase�a=contrase�a;
	}
	
	public StringBuilder comprime () {
		int letraA=0;
		int letraB=0;

		StringBuilder pass = new StringBuilder(); 
		for (int i = 0; i < contrase�a.length(); i++){
			if(contrase�a.charAt(i)==contrase�a.charAt(i)-1) {
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	
	
}
