package org.foobarspam.testing;
import org.foobarspam.kata.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestKataRover {

	private KataMarsRovers roverActual; 
	private Tierra tierra ;
	private KataMarsRovers roverEsperado;
	private Mapa mapa;
	@Before
	public void setup(){
		roverActual = new KataMarsRovers();
		
		tierra = new Tierra();	
		mapa = new Mapa();
		mapa.rellenarMapa();
		mapa.rellenarMapaConObstaculos(5);
		roverEsperado = new KataMarsRovers(7,9,Direction.E);
	}
	@Test
	public void test() {
		
		
			
		roverActual.setX(7);
		roverActual.setY(9);
		roverActual.setDirection(Direction.E);
		
		
		
		assertEquals(roverActual.getDirection(),roverEsperado.getDirection());
		assertEquals(roverActual.getX(),roverEsperado.getX());
		assertEquals(roverActual.getY(),roverEsperado.getY());
		
		
	}
	
	@Test
	public void testDadoUnObjetoQuePuedeMoverseComprobarQueSeMueveHaciaDelante(){
		roverEsperado = new KataMarsRovers(8,6,Direction.E);
		roverActual.setDirection(Direction.E);
		roverActual.setX(8);
		roverActual.setY(5);
		roverActual.moverHaciaDelante('F');
		assertEquals(roverEsperado.getX(),roverActual.getX());
		
	}
	@Test
	public void testDadoUnObjetoQuePuedeMoverseHaciaLosLadosComprobarQueSeMueveHaciaUnlado(){
		
		roverEsperado = new KataMarsRovers(8,7,Direction.N);
		
		roverActual.setDirection(Direction.E);
		roverActual.setX(8);
		roverActual.setY(7);
		roverActual.moverHaciaUnLado('I');
		assertEquals(roverEsperado.getDirection(), roverActual.getDirection());
		
	}
	
	@Test
	public void testDadoUnObjetoComprobarQueSiPasaLosLimitesDeLaVueltaALosMapas(){
		
		roverEsperado = new KataMarsRovers(0,0,Direction.N);
		
		roverActual.setDirection(Direction.E);
		roverActual.setX(0);
		roverActual.setY(9);
		roverActual.moverHaciaDelante('F');
		assertEquals(roverEsperado.getX(),roverActual.getX());
		
	}
	
	
	
}	
	
	