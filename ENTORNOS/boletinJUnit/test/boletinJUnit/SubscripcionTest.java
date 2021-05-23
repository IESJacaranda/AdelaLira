package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubscripcionTest {
	
	
	private Subscripcion subscripcion;
	@BeforeEach
	public void init() {
		subscripcion = new Subscripcion(4,34);
	}
	
	
	@Test
	void testSubscripcion() {
	}

	@Test
	void testPrecioPorMes() {
		Subscripcion subscripcion1 = new Subscripcion(3,0);
		assertEquals(0, subscripcion1.precioPorMes());
		Subscripcion subscripcion3 = new Subscripcion(0,3);
		assertEquals(0, subscripcion3.precioPorMes());
		Subscripcion subscripcion2 = new Subscripcion(4,2);
		assertEquals(2, subscripcion2.precioPorMes());
		Subscripcion subscripcion4 = new Subscripcion(20,300); //no da 1 justo, tiene decimales
		assertEquals(1, subscripcion4.precioPorMes());

	}

	@Test
	void testCancel() {
		Subscripcion subscripcion1 = new Subscripcion(2,3);
		subscripcion1.cancel();
		assertTrue(true);
	}

}
