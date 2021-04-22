package ejercicio1;

public class TamañoCreditoException extends Exception {

		public TamañoCreditoException() {
			super("El credito debe ser entre 1 y 300, ambos inclusive");
		}

}
