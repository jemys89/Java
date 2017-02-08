package org.foobarspam.bicipalmatest;
import org.foobarspam.bicipalma.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BiciPalmaTest {

	@Test
	public void test_bicicleta() {
		
		Bicicleta bici = new Bicicleta();
	}
	
	@Test
	public void test_tarjeta_usuario() {
		
		TarjetaUsuario tarjeta = new TarjetaUsuario();
	}
	@Test
	public void test__estacion() {
		System.out.println("ESTACION");
		Estacion terminal = new Estacion(123,"Manacor", 12);
		
		assertEquals(123,terminal.getIdEstacion());
		assertEquals("Manacor",terminal.getDireccion());
		assertEquals(12,terminal.getNumeroAnclajes());
		
	}
	
	@Test
	public void test_anclajes_libres() {
		
		Estacion libres = new Estacion(456,"Palma", 26);

		assertEquals(26,libres.anclajesLibres());
		
		Estacion libresDos = new Estacion(456,"Palma", 225);
		assertEquals(225,libresDos.anclajesLibres());
	
	

	}
	@Test
	public void test_mostrar_anclajes() {
		System.out.println("////////Test anclajes libres\\\\\\");
		Estacion libres = new Estacion(456,"Palma", 26);

		assertEquals(26,libres.anclajesLibres());
		
		Estacion libresDos = new Estacion(456,"Palma", 225);
		assertEquals(225,libresDos.anclajesLibres());
	
	

	}
	@Test
	public void test_consultar_anclajes() {
		System.out.println("////////Test consultar anclajes\\\\\\");
		Estacion libres = new Estacion(456,"Palma", 26);
		libres.consultarAnclajes();
	}
	
	@Test
	public void test_anclar_bicicleta() {
		System.out.println("////////Test anclar bicicleta\\\\\\");
		Estacion libres = new Estacion(456,"Palma", 26);
		Bicicleta bici = new Bicicleta(489);
		Bicicleta bicicleta = new Bicicleta(123);
		Bicicleta montaña = new Bicicleta(345);
		
		libres.anclarBicicleta(bici);
		libres.anclarBicicleta(bicicleta);
		libres.anclarBicicleta(montaña);
		libres.consultarAnclajes();
		
		
	}
	
	@Test public void test_leer_tarjeta_usuario(){
		
		
		Estacion libres = new Estacion(456,"Palma", 26);
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("123456789", true);
		libres.leerTarjetaUsuario(tarjetaUsuario);
		assertEquals(true,tarjetaUsuario.getActivada());
	}
	@Test public void test_retirar_bicicleta(){
		
		System.out.println("////////Test retirar bicicleta\\\\\\");
		Estacion libres = new Estacion(456,"Palma", 26);
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("123456789", true);
		Bicicleta bici = new Bicicleta(12);
		libres.anclarBicicleta(bici);
		libres.leerTarjetaUsuario(tarjetaUsuario);
		libres.retirarBicicleta( tarjetaUsuario);
		
		
		
	}
	
	
}
