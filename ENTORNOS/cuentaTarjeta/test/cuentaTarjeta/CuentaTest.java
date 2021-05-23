package cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CuentaTest {
		
	private Cuenta cuenta;
	public CuentaTest(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	@BeforeEach
	public void init() {
		//Numero: ""
		//Titular: ""
		//Movimientos:""
		this.cuenta = new Cuenta("12345","Joaquin");
	}

	@Test
	void testCuenta() {
		
		
	}

	@Test
	void testIngresarDouble() throws Exception {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.ingresar(25);
			assertEquals(saldo+25, cuenta.getSaldo());
			cuenta.ingresar(0);
			fail("No lanza excepción al ingresar 0");
		}
		catch(Exception e) {
			
		}
		try {
			cuenta.ingresar(-1);
			fail("No lanza excepción al ingresar cantidad negativa");
		}
		catch(Exception e) {
			
		}
		
		
		
		
	}

	@Test
	void testRetirarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarStringDouble() throws Exception {
		cuenta.ingresar(25000000);
		double saldo = cuenta.getSaldo();
		cuenta.retirar(100);
		assertEquals(saldo-100, cuenta.getSaldo());
		cuenta.retirar(2499900);
		assertEquals(0, cuenta.getSaldo());
	}
	
	
	@Test
	void testRetirarStringDoubleException() throws Exception {
		cuenta.ingresar(25000000);
		double saldo = cuenta.getSaldo();
		
		try {
			cuenta.retirar(0);
			fail("No lanza excepcion al retirar 0");
		}
		catch(Exception e){
		}
		try {
			cuenta.retirar(-100);
			fail("No lanza excepcion al retirar un numero negsativo");
		}
		catch(Exception e) {	
		}
		try {
			saldo = cuenta.getSaldo();
			cuenta.retirar(saldo+100); //numero mayor al saldo no puede retirarlo
			fail("No lanza excepcion al retirar mas de lo que tengo");
		}
		catch(Exception e) {	
			String mensaje= e.getMessage();
			assertEquals("No se puede retirar una cantidad negativa", mensaje);
		}
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimiento() {
		Cuenta cuenta = new Cuenta("12345","Joaquin");
		int numMovs = cuenta.mMovimientos.size();
		Movimiento mov = new Movimiento();
		cuenta.addMovimiento(mov);		
		assertEquals(numMovs + 1, cuenta.mMovimientos.size());
	}

}
