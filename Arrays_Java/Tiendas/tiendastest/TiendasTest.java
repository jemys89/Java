package org.foobarspam.tiendastest;

import org.foobarspam.tiendas.Tiendas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TiendasTest {

	@Test
	public void testVentasMayor() {
		Tiendas ventasAnuales = new Tiendas(1542.0,2465.15,4650.0,3400.0,5420.15);
		assertEquals(5420.15,ventasAnuales.ventasMayor(),0.1);
	}
	@Test
	public void TesVentasMenor(){
		Tiendas ventasAnuales = new Tiendas(1542.0,2465.15,4650.0,3400.0,5420.15);
		assertEquals(1542.0,ventasAnuales.ventasMenor(),0.1);
	}
	@Test
	public void TesVentasToral(){
		Tiendas ventasAnuales = new Tiendas(1000.0, 2000.0, 3000.0, 1500.0, 2500.0);
		assertEquals(10000.0,ventasAnuales.ventasTotal(),0.1);
	}
}