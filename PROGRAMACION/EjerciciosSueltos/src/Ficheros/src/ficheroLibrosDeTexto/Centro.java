package ficheroLibrosDeTexto;

import java.util.ArrayList;

public class Centro {

	private TipoCentro tipoCentro;
	private String codigoCentro;
	private String nombreCentro;
	private ArrayList<Curso> listaCursos;
	
	public Centro(TipoCentro tipoCentro, String codigoCentro, String nombreCentro) {	
		this.tipoCentro=TipoCentro.valueOf(tipoCentro);
		this.tipoCentro=tipoCentro;
		this.codigoCentro=codigoCentro;
		this.nombreCentro=nombreCentro;
		this.listaCursos=new ArrayList<Curso>();
	}

	public void addCurso(Curso a) {
		if(!this.listaCursos.contains(a)){
			this.listaCursos.add(a);
		}
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCentro == null) ? 0 : codigoCentro.hashCode());
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
		if (codigoCentro == null) {
			if (other.codigoCentro != null)
				return false;
		} else if (!codigoCentro.equals(other.codigoCentro))
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

	
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("Centro [tipoCentro=" + tipoCentro + ", codigoCentro=" + codigoCentro + ", nombreCentro=" + nombreCentro
				+ "]");
		for (Curso a : listaCursos) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}


	
	
	
	
}
