package org.foobarspam.PatronCompuesto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPatronCompuesto {
	
	Item item = new Item();
	
	Item itemSimple = new SimpleItem();
	Item itemCompuesto = new CompuestoItem();
	Item divisionAtlantic = new CompuestoItem("Atlantic");
	Item liga = new CompuestoItem("nba");
	Item conferenciaEste = new CompuestoItem("Este");
	Item divisionCentral = new CompuestoItem("Central");
	
	String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
	String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};

	@Before
	public void testSetup() {
		
		itemSimple.setNombre("Lakers");
		
		itemCompuesto.setNombre("Pacific");
		itemCompuesto.setCompuesto(true);
		divisionAtlantic.setCompuesto(true);
		
		divisionAtlantic.composite(equiposAtlantic);
		divisionCentral.setCompuesto(true);
		divisionCentral.composite(equiposCentral);
		
		
		liga.setCompuesto(true);
		conferenciaEste.setCompuesto(true);
		liga.anhadir(conferenciaEste);
		conferenciaEste.anhadir(divisionAtlantic);
		
		
		
		
	}
	
	@Test
	public void testComprobarMetodoGetNombreDeLosDosTiposDeObjetos(){
		
		
		assertThat(itemCompuesto.getNombre()).isEqualTo("Pacific");
		assertThat(itemSimple.getNombre()).isEqualTo("Lakers");
	}
	
	@Test
	public void testComprobarMetodoAñadir(){
		
		itemCompuesto.anhadir(itemSimple);
		assertThat(itemCompuesto.getHijos()).hasSize(1);
		assertThat(itemCompuesto.getHijos()).contains(itemSimple);
		
		
	}
	
	@Test
	public void testComprobarMetodoComponible(){
		
	
		assertThat(divisionAtlantic.getHijos()).hasSize(5);
		assertThat(divisionCentral.getHijos()).hasSize(5);
		
		
	}
	
	@Test
	public void testComprobarItemsDentroDeItemsCompuestos(){
		assertThat(liga.getHijos()).contains(conferenciaEste);
		assertThat(conferenciaEste.getHijos()).contains(divisionAtlantic);
		
	}
	
	

}
