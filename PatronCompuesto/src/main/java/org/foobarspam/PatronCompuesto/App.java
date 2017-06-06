package org.foobarspam.PatronCompuesto;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		// crear Item simple y testear su nombre
		
		System.out.println("\n *** crear Item simple y testear su nombre *** \n");
		
		Item simpleItem = new SimpleItem("Lakers");
		System.out.println("equipo: " + simpleItem.getNombre());
		
		 	// metodo getNombre());
		
		
		// crear Item compuesto y testear su nombre
		
		System.out.println("\n *** crear Item compuesto y testear su nombre *** \n");
		
		Item compuestoItem = new CompuestoItem("Pacific");
		System.out.println("division: " + compuestoItem.getNombre());
		
			// metodo getNombre());
		
		
		// añadir Item simple a compuesto y comprobar nombre
		
		System.out.println("\n *** añadir Item simple a compuesto y comprobar nombre *** \n");
		
			// metodo anhadir(equipo);	
		compuestoItem.anhadir(simpleItem);

		
		//  recorrer un Item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1
		
		System.out.println("\n *** recorrer un Item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");
		
			// metodo iterable();
		compuestoItem.iterable();
		
		
		// añadir varios hijos desde array de strings y recorrer un Item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1
		
		System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un Item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");
		
			// crear division "Atlantic"
		
		
		
			String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
			Item divisionAtlantic = new CompuestoItem("Atlantic");
			divisionAtlantic.setCompuesto(true);
			divisionAtlantic.composite(equiposAtlantic);
			
			divisionAtlantic.iterable();
	
		
		// recorrer un Item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n 
		
		System.out.println("\n *** recorrer un Item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");
			Item liga = new CompuestoItem("nba");
			liga.setCompuesto(true);
			Item conferenciaEste = new CompuestoItem("Este");
			conferenciaEste.setCompuesto(true);
			liga.anhadir(conferenciaEste);
			conferenciaEste.anhadir(divisionAtlantic);
			liga.iterable();
			
			// crear liga "nba" 
			// crear conferencia Este 
		
		
		// crear un elemento compuesto de simples a partir de un array de strings
		
		System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");
		
		String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
		
			// Crear division Central
		Item divisionCentral = new CompuestoItem("Central");
		divisionCentral.setCompuesto(true);
		divisionCentral.composite(equiposCentral);
		divisionCentral.iterable();
		
			// método composite()
		
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples

		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");
		
		String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};
		ArrayList<Item> equiposItemSouthEast = new ArrayList<Item>();
		for(String equipo : equiposSouthEast){
			Item ItemSimpleCreado = new SimpleItem(equipo);
			equiposItemSouthEast.add(ItemSimpleCreado);
		}
		Item divisionSouthEast = new CompuestoItem("SouthEast");
		divisionSouthEast.setCompuesto(true);
		divisionSouthEast.composite(equiposItemSouthEast);
		divisionSouthEast.iterable();
			// crear un arraylist de equipos SouthEast
		
			// crear division SouthEast y añadir los equipos SouthEast
		
			// añadir division SouthEast
		
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos
		
		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");
		
			// crear un ArrayList de divisiones
		ArrayList<Item> divisiones = new ArrayList<Item>();
		divisiones.add(divisionSouthEast);
		divisiones.add(divisionAtlantic);
		divisiones.add(divisionCentral);
		conferenciaEste.composite(divisiones);
		conferenciaEste.iterable();
		
			// añadirlas a la conferencia este
		
		
		
		// eliminar un hijo entre varios, profundidad 1
		
		System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

				// quitar la division Atlantic
				// metodo quitar("Atlantic");	 se busca por el nombre de la división, no por el objeto.		
		
		liga.quitar("Atlantic");
		
		
		
		liga.iterable();	
		
		//SALE OTRA VEZ ATLANTIC PORQUE ARRIBA HAY QUE AÑADIRLA EN LA CONFERENCIA ESTE PARA OTRA HISTORIA DE USUARIO
		
		// Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa
		
		System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");
		
		Item conferenciaOeste = new CompuestoItem("Oeste");
		conferenciaOeste.setCompuesto(true);
		String[] equiposNorthEast = { "Norte1", "Norte2", "Norte3", "Norte4", "Norte5" };
		ArrayList<Item> equiposNorthEadt = new ArrayList<Item>();
		for (String equipo : equiposNorthEast) {
			Item Item = new SimpleItem(equipo);
			equiposNorthEadt.add(Item);
		}
		Item northEast = new CompuestoItem("NorthEast");
		northEast.setCompuesto(true);
		northEast.composite(equiposNorthEadt);

		String[] equiposSurEast = { "Sur1", "Sur2", "Sur3", "Sur4", "Sur5" };
		ArrayList<Item> equiposSurEadt = new ArrayList<Item>();
		for (String equipo : equiposSurEast) {
			Item Item = new SimpleItem(equipo);
			equiposSurEadt.add(Item);
		}
		Item surEast = new CompuestoItem("SurthEast");
		surEast.setCompuesto(true);
		surEast.composite(equiposSurEadt);

		ArrayList<Item> divisiones1 = new ArrayList<Item>();

		divisiones1.add(surEast);
		divisiones1.add(northEast);

		System.out.println(conferenciaOeste.getNombre());
		for (Item Item : divisiones1) {
			conferenciaOeste.getHijos().add(Item);
			

		}

		liga.anhadir(conferenciaOeste);
		liga.iterable();

	}
}
