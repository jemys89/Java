package org.foobarspam.ordenararraytest;

import static org.junit.Assert.*;

import org.foobarspam.ordenararray.OrdenarArray;
import org.junit.Test;

public class OrdenarArrayTest {

	@Test
	public void test_longitud() {
		OrdenarArray  tabla = new    OrdenarArray();
		
		assertEquals(30, tabla.lista.length);
	}
	

}
