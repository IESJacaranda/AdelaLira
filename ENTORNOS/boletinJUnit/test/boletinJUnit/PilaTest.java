package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	
	private Pila p1;
	@BeforeEach
	public void init () {
		Pila p1 = new Pila();
		p1.push(1);
		Pila p2 = new Pila();
		p2.push(30);
		p2.top();
		Pila p3 = new Pila();
		p3.push(-3);
		p3.top();
	}

	@Test
	void testPush() {
		assertEquals(1, p1.top());
		
	}

	@Test
	void testPop() {
		Pila pila1 = new Pila(); //numero 1, pila devuelve 1
		assertEquals(1, p1.top());
		Pila pila2 = new Pila(); //numero 0, pila devuelve null
		p1.isEmpty();
		assertEquals(null, p1.top());
		
	}

	@Test
	void testIsEmpty() {
		Pila pila1 = new Pila(); //numero 3
		pila1.isEmpty();
		assertEquals(0, p1.top());
	}

	@Test
	void testTop() {

		assertEquals(1, p1.top());
	}

}
