package figura;

import static java.lang.Math.pow;

public class Cubo extends AbstractFiguraEspacio {

	private Double radio;
	
	public Cubo (double radio, double peso) {
		super();
		this.radio=radio;
		this.peso=peso;
	}
	
	@Override
	public Double calcularVolumen() {
		return pow(this.radio, 3) ; //El volumen del cubo es ladoxladoxlado
	}

}
