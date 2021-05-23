package pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuentas.Movimiento;

class MovimientoTest {
	
	private Movimiento movimiento;
	@BeforeEach
	private void init() {
		movimiento = new Movimiento();
	}

	@Test
	void testGetImporte() {
		assertEquals(0, movimiento.getImporte());
	}

	@Test
	void testGetConcepto() {
		assertEquals(null, movimiento.getConcepto());
	}

	@Test
	void testSetConcepto() {
		Movimiento mov1 = new Movimiento();
		mov1.setConcepto("Nueva zapatillas nike");
		assertEquals("Nueva zapatillas nike", mov1.getConcepto());
	}

	@Test
	void testSetImporte() {
		Movimiento mov1 = new Movimiento();
		mov1.setImporte(20);
		assertEquals(20, mov1.getImporte());
	}

}
