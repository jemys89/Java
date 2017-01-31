package org.foobarspam.ordenarlistatest;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.foobarspam.ordenarlista.OrdenarLista;
import org.junit.Test;

public class OrdenarListaTest {

	@Test
	public void test_longitud() {
		OrdenarLista  tabla = new    OrdenarLista();
		
		assertEquals(30,tabla.getLista().length);
	}
	@Test
	public void test_() {
		OrdenarLista  tabla = new    OrdenarLista();
		tabla.generarNumeros();
		assertEquals(30,tabla.generarNumeros().length);
	}
	

}
