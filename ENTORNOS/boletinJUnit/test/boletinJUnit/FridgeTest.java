package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	//AÑADE ELEMENTOS A LA LISTA, PERO NO DEBE AÑADIRLO REPETIDOS
	
	static Stream<Arguments> parametros(){
		return Stream.of(
				Arguments.of("agua",true), 
				Arguments.of("peras",true),
				Arguments.of("agua",true) //MACHACA EL ANTERIOR
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros")	
	void TestPut(String item, boolean verdad){
		Fridge fridge = new Fridge();
		assertEquals(verdad, fridge.put(item));
		assertEquals(verdad, fridge.contains(item));
	}
	
	
	//INDICA SI EL ELEMENTO ESTA EN LA LISTA
	
	static Stream<Arguments> parametros2(){
		return Stream.of(
				Arguments.of("agua",true), 
				Arguments.of("peras",false)
				);	
		
	}
	
	@ParameterizedTest
	@MethodSource("parametros2")	
	void testContains(String item, boolean verdad){
		Fridge fridge = new Fridge();
		fridge.put("agua");
		assertEquals(verdad, fridge.contains(item));
	}
	
	
	//ELIMINA ELEMENTOS DE LA LISTA Y LANZA EXCEPCIONES SI NO ESTA
	
	static Stream<Arguments> parametros3(){
		return Stream.of(
				Arguments.of("agua",false),
				Arguments.of("peras",true)
				);	
		
	}
	
	@ParameterizedTest
	@MethodSource("parametros3")	
	void testTake(String item, boolean verdad) throws NoSuchItemException{ 
		Fridge fridge = new Fridge();
		fridge.put("agua");
		fridge.put("peras");
		fridge.take("agua");
		try {
			assertEquals(verdad, fridge.contains(item));
		}
		catch(Exception e) {
			System.out.println(item + " not found in the fridge");
		}
		 
	}
	

}
