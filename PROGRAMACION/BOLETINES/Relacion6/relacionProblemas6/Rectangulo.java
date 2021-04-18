package relacionProblemas6;

import java.util.Scanner;


	public class Rectangulo {
		private int longitud;
		private int ancho;
		
		public Rectangulo () {
			longitud=1;
			ancho=1;
		}

		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			if (longitud<21 && longitud>0) {
				this.longitud=longitud;
				System.out.println("Correcto");
			}
			else {
				System.out.println("Incorrecto");
			}
		}

		public int getAncho() {
			return ancho;
		}

		public void setAncho(int ancho) {
			if (ancho<21 && ancho>0) {
				this.ancho=ancho;
				System.out.println("Correcto");
			}
			else {
				System.out.println("Incorrecto");
			}
		}		
}
