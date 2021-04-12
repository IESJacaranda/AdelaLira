package EjercicioPrueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AritmeticaTest {

	private Aritmetica aritmetica;
	@BeforeEach
	public void init() {
		Aritmetica aritmetica = new Aritmetica();
	}
	
	@Test
	void testSuma() {
		
		assertEquals(2, aritmetica.suma(1, 1));
	}

	@Test
	void testResta() {
		assertEquals(2, aritmetica.resta(4, 2));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(2, aritmetica.multiplicacion(2, 1));
	}

	@Test
	void testDivision() {
		assertEquals(2, aritmetica.division(4, 2));
	}

	@Test
	void testGetUltimaResultado() {
		aritmetica.suma(1, 1);
		assertEquals(2,aritmetica.getUltimaResultado());
	}

}
