package org.foobarspam.calcularbisiestostest;

import static org.junit.Assert.*;

import org.foobarspam.calcularbisiestos.CalcularBisiestos;
import org.junit.Test;

public class CalcularBisiestosTest {

	//ArrayList<> name = new ArrayList<>();
	
	@Test
	public void testEsBisiesto_2() {
		CalcularBisiestos anyo = new CalcularBisiestos(1884);
		boolean resultado = anyo.esBisiesto();
		assertEquals("Test Fallado",resultado,true);
	}
	@Test
	public void testEsBisiesto_4() {
		CalcularBisiestos anyo = new CalcularBisiestos(2104);
		boolean resultado = anyo.esBisiesto();
		assertEquals("Test Fallado",resultado,true);
	}
	@Test
	public void testEsBisiesto_6() {
		CalcularBisiestos anyo = new CalcularBisiestos(2096);
		boolean resultado = anyo.esBisiesto();
		assertEquals("Test Fallado",resultado,true);
	}
	@Test
	public void testEsBisiesto_8() {
		CalcularBisiestos anyo = new CalcularBisiestos(2088);
		boolean resultado = anyo.esBisiesto();
		assertEquals("Test Fallado",resultado,true);
	}
	@Test
	public void testEsBisiesto_0() {
		CalcularBisiestos anyo = new CalcularBisiestos(2000);
		boolean resultado = anyo.esBisiesto();
		assertEquals("Test Fallado",resultado,true);
	}





}
