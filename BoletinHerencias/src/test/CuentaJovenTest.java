package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import ejercicio1b.CuentaJoven;

public class CuentaJovenTest {

	@Test
	void noEstitularValidoParaCuentaJoven() {
		//<18 || >25
		
		CuentaJoven  cj = new CuentaJoven();
		Titular menorEdad = new Titular(17, "MenorDeEdad", "XXX");
		Titular mayor25 = new Titular(26, "Sobre25", "XXX");
		
		
		cj.setTitular(menorEdad);
		assertFalse(cj.esTitularValido());
		
		cj.setTitular(mayor25)
		assertFalse(cj.esTitularValido());
	}
	
	@Test
	public void esTitularValidoParaCuentaJoven() {
		CuentaJoven  cj = new CuentaJoven();
		Titular titularValido = new Titular(18, "MayorDeEdad", "XXX");
		
		cj.setTitular(titularValido);
		assertFalse(cj.esTitularValido());
		
	}
	
	
	public void lanzaExcepcionCuandoNoExisteTitular() {
		boolean lanzaExcepcion=false;
		try {
			CuentaJoven  cj = new CuentaJoven();
			cj.esTitularValido();
		}
		catch(NullPointerException e){
			lanzaException = true;
		}
		assert(lanzaException);
	}
	
	
	@Test
	public void noReintegroSiTitularNoValido() {
		CuentaJoven jc = new CuentaJoven(500.0);
		Titular menorEdad = new Titular(17, "MenorDeEdad", "XXX");
		cj.setTitular(menorEdad);
		
		try {
			cj.reintegro(50);
		}
		catch(Exception e) {
			assert(true);
		}
		
	}
	
	
	@Test
	public void reintegroSiTitularValido() {
		CuentaJoven jc = new CuentaJoven(500.0);
		Titular titularValido = new Titular(18, "MayorDeEdad", "XXX");
		cj.setTitular(titularValido);
		
		try {
			cj.reintegro(50);
		}
		catch(Exception e) {
			assert(false);
		}
		
	}
	
}
