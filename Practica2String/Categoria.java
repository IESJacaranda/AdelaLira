package Practica2String;

public class Categoria {
	
	private final int MAXCODIGO=5;
	private final int MINCODIGO=2;
	
	private String codigo;
	
	public Categoria() {}
	
	public Categoria(String codigo) {
		this.codigo=codigo;
	}

	public int compruebaCodigo () throws Exception {
		if (this.codigo==null) {
			throw new Exception ("El codigo no debe de ser nulo");
		}
		else if (this.codigo.length()>MAXCODIGO || this.codigo.length()<MINCODIGO) {
			throw new Exception ("El codigo no tiene la longitud adecuada");
		}
		
		int noEsVocal=0;
		int apto=0;
		
		if (codigo.charAt(0)=='C' ) {
			for (int i = 1; i < codigo.length(); i++) {	
				if (codigo.toUpperCase().charAt(i)=='A'|| codigo.toUpperCase().charAt(i)=='E' || codigo.toUpperCase().charAt(i)=='I'
					|| codigo.toUpperCase().charAt(i)=='O' || codigo.toUpperCase().charAt(i)=='U') {
					noEsVocal=0;
				}
				else {
					noEsVocal++;
				}
			}	
		}
		
		if (noEsVocal==0) {
			apto=1;
		}

		return apto;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	

}
