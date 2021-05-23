package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BoaTest {

	static Stream<Arguments> parametros(){
		return Stream.of(
				Arguments.of("Bernarda",2,"Espicanas", false), //Arguments.of("Susana", 25, 'M', 19, 1, -1),
				Arguments.of("Lolita",2,"granola bars",true) //Arguments.of("Susana", 25, 'M', 20, 1, 0);
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros")	
	void TestisHealthy(String nombre, int lenght, String favoriteFood, boolean verdad){ //(String nombre, int edad, string genero, double peso, double altura)
		//Persona persona = new Persona(nombre, edad, sexo, genero, peso, altura);
		Boa boa = new Boa(nombre,lenght,favoriteFood);
		assertEquals(verdad, boa.isHealthy());  //assertEquals(imc, persona.calcularIMC()); 
	}

	static Stream<Arguments> parametros2(){
		return Stream.of(
				Arguments.of("Bernarda",2,"Espicanas",1, false), //Arguments.of("Susana", 25, 'M', 19, 1, -1),
				Arguments.of("Lolita",2,"granola bars",3,true) //Arguments.of("Susana", 25, 'M', 20, 1, 0);
				);	
	}
	
	@ParameterizedTest
	@MethodSource("parametros2")	
	void TestfitsInCage(String nombre, int lenght, String favoriteFood, int cageLength, boolean verdad){ //(String nombre, int edad, string genero, double peso, double altura)
		//Persona persona = new Persona(nombre, edad, sexo, genero, peso, altura);
		Boa boa = new Boa(nombre,lenght,favoriteFood);
		assertEquals(verdad, boa.fitsInCage(cageLength));  //assertEquals(imc, persona.calcularIMC()); 
	}
	
	
	
}
