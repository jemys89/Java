/*Diseña	un programa que calcule el importe final de una venta considerando que
 *  sobre el valor bruto se hace un descuento según la siguiente tabla:
Valores <=20 implican un descuento del 0%
Valores >20 y <=100 implican un descuento descuento del 5%
Valores >100 implican un descuento 10% */


package org.foobarspam.ejercicio13;
import java.util.Scanner;

public class Descuento {
	public static void main(String[] argumentos){
		double importe = 0.0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un valor al que quieras realizar un descuento");
		importe = teclado.nextDouble();
		if(importe > 20 && importe <= 100){
			System.out.println("El valor final de su importe es " + importe*0.95);
		}else if(importe > 100){
			System.out.println("El valor final de su importe es " + importe*0.90);
		}else{
			System.out.println("Su valor adquiere ningún descuento");
		}
	}
}
