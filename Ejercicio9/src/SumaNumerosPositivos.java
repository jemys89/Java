/*Escribe un programa que nos pida por teclado dos n�meros enteros y que a continuaci�n muestre
 *  en pantalla la suma de los dos n�meros solamente si son los dos positivos. Si no se cumple 
 *  que los dos n�meros sean positivos se visualizar� un mensaje indic�ndolo. La salida ha de tener
 *   el siguiente formato: �La suma de los dos n�meros es: XXX� o �No se calcula la suma porque alguno
 *    de los n�meros o los dos no son positivos�.
 */

import java.util.Scanner;

public class SumaNumerosPositivos {
	public static void main(String[] argumentos){
		int numeroA, numeroB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero positivo");
		numeroA = teclado.nextInt();
		System.out.println("Introduce un segundo n�mero positivo");
		numeroB = teclado.nextInt();
		
		if(numeroA < 0 || numeroB < 0){
			System.out.println("No se calcula la suma porque alguno de los n�meros o los dos no son positivos.");
		}
		else{
			System.out.println("La suma de los n�meros es " + (numeroA + numeroB));
		}
	}

}
