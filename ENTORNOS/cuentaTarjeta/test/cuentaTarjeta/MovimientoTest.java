package cuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	private Movimiento mv;

	@BeforeEach
	public void init() {
		this.mv = new Movimiento();
	}
	
	@Test
	void testMovimiento() {
		//MovimientoTest movimiento1 = new MovimientoTest(LocalDate.of(2015, 30, 03));
	}

	@Test
	void testGetImporte() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSetImporte() {
		mv.setImporte(2300);
		assertEquals(2300, mv.getImporte());
	}
	

	@Test
	void testGetConcepto() {
		assertEquals("", mv.getConcepto());
	}

	@Test
	void testSetConcepto() {
		mv.setConcepto("Dinerico");
		assertEquals("Dinerico", mv.getConcepto());
	}

	@Test
	void testGetFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFecha() {
		fail("Not yet implemented");
	}



}
