package Practica2String;

public class Producto {


	private final int MAXCODIGO=12;
	private final int MINCODIGO=5;
	
	private String codigo;
	private Categoria categoria;


	public Producto() {}
	
	public Producto(String codigo, Categoria categoria) {
		this.codigo=codigo;
		this.categoria=categoria;
	}

	/**
	 * ESTE METODO COMPRUEBA EL CODIGO
	 * @return
	 * @throws Exception
	 */
	public int compruebaCodigo () throws Exception {
		if (this.codigo==null) {
			throw new Exception ("El codigo no debe de ser nulo");
		}
		else if (this.codigo.length()>MAXCODIGO || this.codigo.length()<MINCODIGO) {
			throw new Exception ("El codigo no tiene la longitud adecuada");
		}
		
		int esNumero=0;
		int apto=0;
		
		for (int i = 0; i < codigo.length(); i++) {
			if (Character.isDigit(codigo.charAt(i))) {
				esNumero++;
			}
		}

		if (esNumero>=3) {
			apto=1;
		}
		
		else  {
			throw new Exception ("No es apto");
		}
		return apto;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}
