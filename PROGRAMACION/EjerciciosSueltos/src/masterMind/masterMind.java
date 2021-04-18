package masterMind;

import java.util.Scanner;

public class masterMind {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		int contador = 0;
		String codigo = "1234";
		String codigoInvitado ="";
		int numeroCorrecto=0;
		int posicionCorrecta=0;
		
		System.out.println("Bienvenido al juego Master Mind, ahora podra adivinar nuestro numero secreto con un total de 7 intentos, "
				+ "recuerde, el número tiene 4 caracteres solamente. Ahora podra introducir su primer numero");
		
		while (contador!=7 || codigo==codigoInvitado) {
			codigoInvitado=teclado.nextLine();	
			for (int j=0;j<codigoInvitado.length();j++) {
				for (int i=0;i<codigo.length();i++) {
					if (codigoInvitado.charAt(j)==codigo.charAt(i)) {
						numeroCorrecto++;
						if(j==i) {
							posicionCorrecta++;
						}
					}	
				}
			}
			System.out.println("Coinciden " + numeroCorrecto + " digitos y " + posicionCorrecta + " digitos estan en posición correcta");
			contador++;
		}
		
		
		

	}

}
