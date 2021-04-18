package enumerados;

public enum Dia {

	LUNES(1),
	MARTES(2), 
	MIERCOLES(3),
	JUEVES(4), 
	VIERNES(5), 
	SABADO(6), 
	DOMINGO(7); //SIEMPRE EN MAYUS
	
	private int diaSemana;
	
	
	Dia(int dia){
		this.diaSemana=dia;
	}

	//NOS DA LOS DIAS DE LA SEMANA, NO HACE FALTA UN SET
	public int getDiaSemana() {
		return diaSemana;
	}
	
	
}
