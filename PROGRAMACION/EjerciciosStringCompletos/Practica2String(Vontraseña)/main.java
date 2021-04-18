package Practica2String;



public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categoria categoria = new Categoria ("Ceeaa");
		Producto producto = new Producto ("112233", categoria);
			
		
		try {
			System.out.println((producto.compruebaCodigo()));
			System.out.println(producto.getCategoria().compruebaCodigo());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

	
		
	

}
