package org.foobarspam.testing;
import org.foobarspam.cuentacorriente.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void test_cuenta_corriente() {
		CuentaCorriente usuario = new CuentaCorriente("Paco","García Gómez","El país de las maravillas","654987654",
				"43224268Q",250);
		assertEquals("Paco",usuario.getNombre());
		assertEquals("García Gómez",usuario.getApellidos());
		assertEquals("El país de las maravillas",usuario.getDireccion());
		assertEquals("654987654",usuario.getTelefono());
		assertEquals("43224268Q",usuario.getDni());
		assertEquals(250,usuario.getSaldo());
	}
	@Test
	public void test_retirar_saldo() {
		CuentaCorriente usuario = new CuentaCorriente("Paco","García Gómez","El país de las maravillas","654987654",
				"43224268Q",250);
		usuario.retirarDinero(20);
		assertEquals(230,usuario.getSaldo());
		
	}
	@Test
	public void test_ingresar_dinero() {
		CuentaCorriente usuario = new CuentaCorriente("Paco","García Gómez","El país de las maravillas","654987654",
				"43224268Q",250);
		usuario.ingresarDinero(200);
		assertEquals(450,usuario.getSaldo());
	
	}
	@Test
	public void test_saldo_negativo() {
		CuentaCorriente usuario = new CuentaCorriente("Paco","García Gómez","El país de las maravillas","654987654",
				"43224268Q",250);
		usuario.retirarDinero(280);
		assertEquals(true,usuario.saldoNegativo());
}
	
}
