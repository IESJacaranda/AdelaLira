package ejerciciosUnitarias;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VideojuegoTest {

	private Videojuego videojuego;
	@BeforeEach
	public void init() {
		//Titulo: ""
		//Horas Estimadas: 0
		//Genero:""
		//Compañia: ""

		videojuego = new Videojuego();
	}
	
	@Test
	void testGetTitulo() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		assertEquals("Stardew Valley", videojuego1.getTitulo());
		
	}
	

	@Test
	void testSetTitulo() {
		Videojuego videojuego3 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		videojuego3.setTitulo("The last of us");
		assertEquals("The last of us", videojuego3.getTitulo());
	}

	@Test
	void testGetHorasEstimadas() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		assertEquals(200, videojuego1.getHorasEstimadas());
		
	}

	@Test
	void testSetHorasEstimadas() {
		Videojuego videojuego3 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		videojuego3.setHorasEstimadas(500);
		assertEquals(500, videojuego3.getHorasEstimadas());
	}

	@Test
	void testGetGenero() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		assertEquals("Simulador de granjas", videojuego1.getGenero());
	}

	@Test
	void testSetGenero() {
		Videojuego videojuego3 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		videojuego3.setGenero("Supervivencia");
		assertEquals("Supervivencia", videojuego3.getGenero());
	}

	@Test
	void testGetcompania() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		assertEquals("Chucklefish Games", videojuego1.getcompania());
		
	}

	@Test
	void testSetcompania() {
		Videojuego videojuego3 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", " Chucklefish Games");
		videojuego3.setcompania("Bugisoft");
		assertEquals("Bugisoft", videojuego3.getcompania());
	}

	@Test
	void testEntregar() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley","Chucklefish Games"); 
		videojuego1.entregar();
		assertTrue(videojuego1.isEntregado());
	}

	@Test
	void testDevolver() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley","Chucklefish Games");
		videojuego1.devolver();
		assertEquals(false,videojuego1.isEntregado());
	}

	@Test
	void testIsEntregado() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		assertEquals(true,videojuego1.isEntregado());
	}

	@Test
	void testCompareTo() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		Videojuego videojuego2 = new Videojuego("Minecraft", 160, "Supervivencia", " Mojang");
		
		 Assertions.assertEquals(1, videojuego1.compareTo(videojuego2), "videojuego1 tiene mas horas estimadas que videojuego2");
	}

	@Test
	void testToString() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		
		String patron="Informacion del videojuego: \n" +
			          "\tTitulo: Stardew Valley\n" +
			          "\tHoras estimadas: 200\n" +
			          "\tGenero: Simulador de granjas\n" +
			          "\tcompaÃ±ia: Chucklefish Games";
				//solo se puede poner una palabra?

			//System.out.println(persona.toString());
			//System.out.println(patron);
		
			assertTrue(videojuego1.toString().matches(patron));
	}

	@Test
	void testEqualsVideojuego() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", "Chucklefish Games");
		Videojuego videojuego2 = new Videojuego("Stardew Valley", "Chucklefish Games");
		Videojuego videojuego3 = new Videojuego("Stardew Valley", "Nintendo");
		Videojuego videojuego4 = new Videojuego("Animal Crossing", "Chucklefish Games");
		//titulo y compañia iguales
		assertTrue(videojuego1.equals(videojuego2));
		//titulo iguales y compañia diferentes
		assertFalse(videojuego1.equals(videojuego3));
		//titulo diferentes y compañia iguales
		assertFalse(videojuego1.equals(videojuego4));
		//titulo y compañia diferentes
		assertFalse(videojuego3.equals(videojuego4));
		
	}

	@Test
	void testVideojuego() {
		assertEquals("", videojuego.getTitulo());
		assertEquals(100, videojuego.getHorasEstimadas());
		assertEquals("", videojuego.getGenero());
		assertEquals("", videojuego.getcompania());
	}

	@Test
	void testVideojuegoStringString() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		assertEquals("Stardew Valley", videojuego1.getTitulo());
		assertEquals("Chucklefish Games", videojuego1.getcompania());
	}

	@Test
	void testVideojuegoStringIntStringString() {
		Videojuego videojuego1 = new Videojuego("Stardew Valley", 200, "Simulador de granjas", "Chucklefish Games");
		assertEquals("Stardew Valley", videojuego1.getTitulo());
		assertEquals(200, videojuego1.getHorasEstimadas());
		assertEquals("Simulador de granjas", videojuego1.getGenero());
		assertEquals("Chucklefish Games", videojuego1.getcompania());
	}

}
