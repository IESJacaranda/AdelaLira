package pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import empleado.Empleado;


class EmpleadoTest {

	private Empleado empleado;
	@BeforeEach
	private void init() {
		this.empleado=new Empleado();
	}
	
	

	static Stream<Arguments> parametros(){
		return Stream.of(
				Arguments.of("Benito", "Jimenez", 30, 2500,false), 
				Arguments.of("Santiago", "Perez", 50, 3500,true)
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros")	
	void testPlus(String nombre, String apellido, int edad, double sueldo, boolean verdad){
		Empleado empleado1 = new Empleado(nombre, apellido, edad, sueldo);
		assertEquals(verdad, empleado1.plus(edad));

	}



	static Stream<Arguments> parametros2(){
		Empleado empleado1 = new Empleado("Benito", "Jimenez", 30, 2500);	
		Empleado empleado2 = new Empleado("Santiago", "Perez", 50, 3500);
		return Stream.of(
				Arguments.of(empleado1,empleado2, false), 
				Arguments.of(empleado1,empleado1, true)
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros2")	
	void testEqualsEmpleado(Empleado empleado, Empleado empleado1, boolean verdad){
		assertEquals(verdad, empleado.equals(empleado1));
	}


	static Stream<Arguments> parametros3(){
		Empleado empleado1 = new Empleado("Benito", "Jimenez", 16, 0);	
		Empleado empleado2 = new Empleado("Santiago", "Perez", 50, 3500);
		Empleado empleado3 = new Empleado("Rocio", "Reyes", 16, 1200);
		
		return Stream.of(
				Arguments.of(empleado1, empleado2, -1), 
				Arguments.of(empleado1, empleado3, 0),
				Arguments.of(empleado2, empleado1, 1)
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros3")	
	void testCompareTo(Empleado empleado, Empleado empleado2, int verdad){
		assertEquals(verdad, empleado.compareTo(empleado2));
	}
	
	
	
	
}
