package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

	private Serie serie;
	@BeforeEach
	public void init() {
		//Titulo: ""
		//Temporadas: 0
		//Genero:""
		//Creador: ""

		serie = new Serie();
	}
	
	
	@Test
	void testGetTitulo() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals("Juego de Tronos", serie1.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Serie serie3 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		serie3.setTitulo("Aqui no hay quien viva");
		assertEquals("Aqui no hay quien viva", serie3.getTitulo());
		
	}

	@Test
	void testGetnumeroTemporadas() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals(8, serie1.getnumeroTemporadas());
	}

	@Test
	void testSetnumeroTemporadas() {
		Serie serie3 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		serie3.setnumeroTemporadas(35);
		assertEquals(35, serie3.getnumeroTemporadas());
	}

	@Test
	void testGetGenero() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals("fantasía medieval", serie1.getGenero());
	}

	@Test
	void testSetGenero() {
		Serie serie3 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		serie3.setGenero("Accion");
		assertEquals("Accion", serie3.getnumeroTemporadas());
	}

	@Test
	void testGetcreador() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals("George R. R. Martin", serie1.getcreador());
	}

	@Test
	void testSetcreador() {
		Serie serie3 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		serie3.setcreador("Antonio Banderas");
		assertEquals("Antonio Banderas", serie3.getcreador());
	}

//	@Test
//	void testEntregar() {
//		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
//		assertEquals(true,serie1.isEntregado());
//	}
//
//	@Test
//	void testDevolver() {
//		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
//		assertEquals(false,serie1.isEntregado());
//	}

	@Test
	void testIsEntregado() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals(true,serie1.isEntregado());
	}

	@Test
	void testCompareTo() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		Serie serie2 = new Serie("The Big Bang Theory", 12, "sitcom", "Chuck Lorre");
		
		 Assertions.assertEquals(-1, serie1.compareTo(serie2), "Serie1 tiene menos temporadas que serie2");
	}

	@Test
	void testToString() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		
		String patron="Informacion de la Serie: \n" +
		                "\tTitulo: Juego de Tronos\n" +
		                "\tNumero de temporadas: 8\n" +
		                "\tGenero: fantasía medieval\n" +
		                "\tCreador: George R. R. Martin";
				//solo se puede poner una palabra?

			System.out.println(serie1.toString());
			System.out.println(patron);
		
			assertTrue(serie1.toString().matches(patron));
	}

	@Test
	void testEqualsSerie() {
		fail("Not yet implemented");
	}

	@Test
	void testSerie() {
		assertEquals("", serie.getTitulo());
		assertEquals(3, serie.getnumeroTemporadas());
		assertEquals("", serie.getGenero());
		assertEquals("", serie.getcreador());
	}

	@Test
	void testSerieStringString() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals("Juego de Tronos", serie1.getTitulo());
		assertEquals("George R. R. Martin", serie1.getcreador());
	}

	@Test
	void testSerieStringIntStringString() {
		Serie serie1 = new Serie("Juego de Tronos", 8, "fantasía medieval", "George R. R. Martin");
		assertEquals("Juego de Tronos", serie1.getTitulo());
		assertEquals(8, serie1.getnumeroTemporadas());
		assertEquals("fantasía medieval", serie1.getGenero());
		assertEquals("George R. R. Martin", serie1.getcreador());
	}

}
