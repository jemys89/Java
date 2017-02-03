package org.foobarspam.numeroscomprendidostest;
import org.foobarspam.numeroscomprendidos.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumerosComprendidosTest {
	private NumerosComprendidos testNumeros;
	
	@Before
	public void setUp(){
		testNumeros = new NumerosComprendidos();
	}
	@Test
	public void test_pares() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		assertEquals(testNumeros.getPares(), 10);
		
	}
	@Test
	public void test_impares() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		assertEquals(testNumeros.getPares(), 10);
		assertEquals(testNumeros.getImpares(), 15);
	}
	@Test
	public void test_media_impares() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		testNumeros.getImpares();
		testNumeros.mediaImpares();
		assertEquals(testNumeros.mediaImpares(), 25);
	}
	
	@Test
	public void test_auxiliar_pos0() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		testNumeros.getPares();
		
		assertEquals(testNumeros.getAuxiliar()[0], 10);
		
	}
	@Test
	public void test_auxiliar_pos1() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		testNumeros.getImpares();
		assertEquals(testNumeros.getAuxiliar()[1], 15);
	}
	@Test
	public void test_auxiliar_pos2() {
		final int[] llist = {25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,26};
		testNumeros.setLista(llist);
		testNumeros.getImpares();
		testNumeros.mediaImpares();
		assertEquals(testNumeros.getAuxiliar()[2], 25);
	}

}
