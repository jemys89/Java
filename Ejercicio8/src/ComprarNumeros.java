/*Escribe	un programa que pida por teclado dos n�meros y que muestre en pantalla uno 
 * de los dos mensajes siguientes en funci�n de los n�meros le�dos: a) el primer n�mero 
 * (valor) es mayor que el segundo (valor)(introduciendo el valor de los n�meros en el mensaje);
 *  b) el primer n�mero (valor) es menor que el segundo (valor; c) los dos n�meros
 *  son iguales (valor)
 */

import java.util.Scanner;

public class ComprarNumeros {
	public static void main(String [] argumentos){
		double valorA, valorB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un primer n�mero ");
		valorA = teclado.nextDouble();
		System.out.println("Introduce un segundo n�mero ");
		valorB = teclado.nextDouble();
		
		if (valorA > valorB){
			System.out.println("El primer n�mero " + valorA + " es mayor que el segundo " + valorB);
		}
		else if (valorB > valorA){
			System.out.println("El primer n�mero " + valorA + " es menor que el segundo " + valorB);
		}
		else{
			System.out.println("Los n�meros son iguales");
		}
	}

}
