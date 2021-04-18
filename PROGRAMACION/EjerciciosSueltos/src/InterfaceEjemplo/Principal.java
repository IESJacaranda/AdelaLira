package InterfaceEjemplo;

public class Principal {

	public static void main(String[] args) {

		Edificio casa = new Vivienda (30,10,3,5);
		
		Tienda mediaMarkt = new Tienda(100,50,"Venta de productos de electronica");
		LocalComercial mm = new Tienda(100,50,"Venta de productos de electronica");
		Edificio mmm = new Tienda(100,50,"Venta de productos de electronica");
		
		
		System.out.println(((Tienda)mmm).darCantidadProducto());
		
		System.out.println(casa.getSuperficieEdificio());
		System.out.println(casa.getPrecioEdificio());
		System.out.println(((Vivienda)casa).getHabitantes());
		

	}

}
