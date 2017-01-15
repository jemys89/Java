/*Escribe un programa que nos pida por teclado dos números enteros y que a continuación muestre
 *  en pantalla la suma de los dos números solamente si son los dos positivos. Si no se cumple 
 *  que los dos números sean positivos se visualizará un mensaje indicándolo. La salida ha de tener
 *   el siguiente formato: “La suma de los dos números es: XXX” o “No se calcula la suma porque alguno
 *    de los números o los dos no son positivos”.
 */

import java.util.Scanner;

public class SumaNumerosPositivos {
	public static void main(String[] argumentos){
		int numeroA, numeroB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		numeroA = teclado.nextInt();
		System.out.println("Introduce un segundo número positivo");
		numeroB = teclado.nextInt();
		
		if(numeroA < 0 || numeroB < 0){
			System.out.println("No se calcula la suma porque alguno de los números o los dos no son positivos.");
		}
		else{
			System.out.println("La suma de los números es " + (numeroA + numeroB));
		}
	}

}
