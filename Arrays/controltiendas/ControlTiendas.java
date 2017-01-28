/*Escribe un programa que almacene en un Array de cinco elementos las ventas anuales de cada una de
 *  las cinco tiendas de una cadena de supermercados (as�gnaselos al Array al declararlo). A continuaci�n
 *   calcular cu�l fue la tienda que menos vendi�, cu�l fue la que m�s vendi� y el importe total de ventas 
 *   de las cinco tiendas.
 */


package org.foobarspam.controltiendas;


import java.util.*;

public class ControlTiendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] ventas = {840.12, 125.2, 154.9, 3544.2, 1400.10};
		double total = 0;
		
		Arrays.sort(ventas);
		for( double i : ventas){
			total+= i;
			
		}
		System.out.println("La tienda que menos vendi� fue " + ventas[0] + "�");
		System.out.println("La tienda que m�s vendi� fue " + ventas[4] + "�");
		System.out.println("Entre las 5 tiendas vendieron un total de: " + total + "�");
	}

}
