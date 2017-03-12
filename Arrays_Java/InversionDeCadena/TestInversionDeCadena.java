package org.foobarspam.testing;
import org.foobarspam.inversiondecadena.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestInversionDeCadena {

	@Test
	public void test() {
		InversionDeCadena cadena = new InversionDeCadena("hola");
		
		assertEquals("aloh",cadena.cadenaAlReves());
	}

}
