/*Modifica el programa anterior para que en vez de mostrar un mensaje genérico en el caso de que
 *  alguno o los dos números sean negativos, escriba una salida diferenciada para cada una de las
 *   situaciones que se puedan producir, utilizando los siguientes mensajes:
 
No se calcula la suma porque el primer número es negativo.
No se calcula la suma porque el segundo número es negativo.
No se calcula la suma porque los dos números son negativos.
*/

package ejercicio10;


import java.util.Scanner;

public class SumaNumerosEnteros {
	public static void main(String[] argumentos){
		int numeroA, numeroB = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		numeroA = teclado.nextInt();
		System.out.println("Introduce un segundo número positivo");
		numeroB = teclado.nextInt();
		
		if(numeroA < 0 && numeroB > 0){
			System.out.println("No se calcula la suma porque el primer número es negativo.");
		}
		else if(numeroA > 0 && numeroB < 0){
			System.out.println("No se calcula la suma porque el segundo número es negativo.");
		}
		else if(numeroA < 0 && numeroB < 0){
			System.out.println("No se calcula la suma porque los dos números son negativos.");
		}
		else{
			System.out.println("La suma de los números es " + (numeroA + numeroB));
		}
	}

}

