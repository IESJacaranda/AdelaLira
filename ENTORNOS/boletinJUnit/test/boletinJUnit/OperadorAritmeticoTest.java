package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OperadorAritmeticoTest {

	
	private OperadorAritmetico operadorAritmetico;
	@BeforeEach
	public void init() {
		operadorAritmetico = new OperadorAritmetico();
	}
	
	@Test
	void testSuma() {
		assertEquals(3, operadorAritmetico.suma(2, 1));
	}

	@Test
	void testDivision() throws Exception {
		//a>b
		
			assertEquals(2, operadorAritmetico.division(2, 1));			
		
		//a<b

			assertEquals(0, operadorAritmetico.division(1, 3));			

		//a==b

			assertEquals(1, operadorAritmetico.division(2, 2));			
		//b==0 exception
		try {
			operadorAritmetico.division(2, 0);			
			fail("No se puede dividir entre 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
