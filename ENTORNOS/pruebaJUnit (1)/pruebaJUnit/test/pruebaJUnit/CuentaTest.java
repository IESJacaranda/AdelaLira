package pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuentas.Cuenta;
import cuentas.IngresoNegativoException;
import cuentas.Movimiento;
import cuentas.SaldoInsuficienteException;

class CuentaTest {
	
	private Cuenta cuenta;
	@BeforeEach
	public void init() {
		this.cuenta=new Cuenta("20213","Alfonso");
	}
	

	@Test
	void testIngresar() throws Exception {
		
		Cuenta saldo = new Cuenta("1234","Veronica");
		try { //INGRESAMOS NUMERO POSITIVO Y COMPROBAMOS QUE SE INGRESA
			saldo.ingresar("Ingreso de dinero", 50.0);
			assertEquals(50.0, saldo.getSaldo());
		}
		catch(Exception e) {
		}
		try { //INTENTAMOS INGRESAR NUMERO NEGATIVO PERO ESTE NO ES VALIDO
			saldo.ingresar("Ingreso de dinero negtivo", -4.0);
			throw new Exception ("No se puede ingresar una cantidad negativa");
		}
		catch(Exception e) {
		
		}
	}

	@Test
	void testRetirar() {
		Cuenta saldo = new Cuenta("1234","Veronica");
		try{ //INTENTAR RETIRAR DINERO TENIENDO DE SOBRA
			saldo.ingresar("Ingreso piso", 200.0);
			saldo.retirar("MERCADONA", 20.0);
			assertEquals(180.0, saldo.getSaldo());
		}
		catch (Exception e) {
			
		}
		try{ // INTENTA RETIRAR DINERO SIN TENER EN EL BANCO
			saldo.ingresar("CASI NUMEROS ROJOS", 0.0);
			saldo.retirar("MERCADONA", 20.0);
			throw new Exception("Saldo insuficiente");
		}
		catch (Exception e) {			
		}
		try{ // INTENTA RETIRAR NUMERO NEGATIVO
			saldo.ingresar("Ingreso alquiler", 500.0);
			saldo.retirar("Sudadera Zara",-20.0);
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		catch (Exception e) {			
		}
		
	}

	@Test
	void testGetSaldo() throws IngresoNegativoException, SaldoInsuficienteException {
		cuenta.ingresar("Ingreso1", 10.0);
		cuenta.retirar("Retiro1", 2.0);
		cuenta.ingresar("Ingreso2", 60.0);
		assertEquals(68.0, cuenta.getSaldo());
	}

	@Test
	void testAddMovimiento() {
		Cuenta cuenta1 = new Cuenta("26","Leo");
		Movimiento m1 = new Movimiento();
		
		m1.setImporte(200);
		assertEquals(200, m1.getImporte());
		
		
		//assertEquals(1, cuenta1.addMovimiento(1));
	}

}
