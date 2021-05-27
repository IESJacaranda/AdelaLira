package ficheroLibrosDeTextob;

public class Centro {

	private TipoCentro tipoCentro;
	private int codigoCentro;
	private String nombreCentro;
	
	
	
	
	public Centro(String tipoCentro, int codigoCentro, String nombreCentro) { //AQUI TIPOCENTRO DEBE SER STRING
		super();
		this.tipoCentro = TipoCentro.valueOf(tipoCentro.toUpperCase());
		this.codigoCentro = codigoCentro;
		this.nombreCentro = nombreCentro;
		//FALTA LA LISTA
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCentro;
		result = prime * result + ((nombreCentro == null) ? 0 : nombreCentro.hashCode());
		result = prime * result + ((tipoCentro == null) ? 0 : tipoCentro.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centro other = (Centro) obj;
		if (codigoCentro != other.codigoCentro)
			return false;
		if (nombreCentro == null) {
			if (other.nombreCentro != null)
				return false;
		} else if (!nombreCentro.equals(other.nombreCentro))
			return false;
		if (tipoCentro != other.tipoCentro)
			return false;
		return true;
	}

	
//	@Override
//	public String toString() {
//		StringBuilder sb  = new StringBuilder();
//		sb.append("Centro [tipoCentro=" + tipoCentro + ", codigoCentro=" + codigoCentro + ", nombreCentro=" + nombreCentro
//				+ "]");
//		for (Curso a : listaCurso) {
//			sb.append(a.toString() +"\n");
//		}
//		return sb.toString();
//	}
	
	
}
