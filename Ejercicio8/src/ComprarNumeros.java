/*Escribe	un programa que pida por teclado dos números y que muestre en pantalla uno 
 * de los dos mensajes siguientes en función de los números leídos: a) el primer número 
 * (valor) es mayor que el segundo (valor)(introduciendo el valor de los números en el mensaje);
 *  b) el primer número (valor) es menor que el segundo (valor; c) los dos números
 *  son iguales (valor)
 */

import java.util.Scanner;

public class ComprarNumeros {
	public static void main(String [] argumentos){
		double valorA, valorB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un primer número ");
		valorA = teclado.nextDouble();
		System.out.println("Introduce un segundo número ");
		valorB = teclado.nextDouble();
		
		if (valorA > valorB){
			System.out.println("El primer número " + valorA + " es mayor que el segundo " + valorB);
		}
		else if (valorB > valorA){
			System.out.println("El primer número " + valorA + " es menor que el segundo " + valorB);
		}
		else{
			System.out.println("Los números son iguales");
		}
	}

}
