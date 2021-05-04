package figura;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Esfera extends AbstractFiguraEspacio {

//	@Override
//	public Double obtenerPeso() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	private Double radio;
	
	public Esfera (double radio, double peso) {
		super();
		this.radio=radio;
		this.peso=peso;
	}
	
	@Override
	public Double calcularVolumen() {
		return (4/3)*PI*pow(this.radio, 3);  //Math.pow eleva el primer numero al segundo
		//Si seleccionamos PI o POW y seleccionamos control+mayus+M se sube arriba y reduce el codigo
	}

	
	/**
	 * PODEMOS BORRARLO PORQUE COMO NO SE VA A MODIFICAR NO TIENE QUE SER ABSTRACTA
	 */
	
	/*@Override
	public Double calcularDensidad() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	/**
	 * PODEMOS BORRARLO PORQUE COMO NO SE VA A MODIFICAR NO TIENE QUE SER ABSTRACTA
	 */
	/*
	@Override
	public Double flotaEnElAgua() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
