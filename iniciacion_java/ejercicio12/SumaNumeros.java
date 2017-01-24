/*Escribe	un programa que pida por teclado dos números y que calcule y muestre su suma solamente si:
los dos son pares 
el primero es menor que cincuenta 
y el segundo está dentro del intervalo cerrado 100-500*/
package org.foobarspam.ejercicio12;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] argumentos){
		int numeroA, numeroB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		numeroA = teclado.nextInt();
		System.out.println("Introduce un segundo número positivo");
		numeroB = teclado.nextInt();
		if(numeroA %2 == 0 && numeroB %2 == 0){
			
			if(numeroA < 50 && numeroB > 100 && numeroB < 500){
				System.out.println("La suma de los números es " + (numeroA + numeroB));
			}else{
				System.out.println("No cumplen las condiciones");
			}
		}else{
			System.out.println("No cumplen las condiciones");
		}
		
	}
}
