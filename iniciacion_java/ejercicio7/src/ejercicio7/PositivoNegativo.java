/*Escribe un programa que pida por teclado un número y que a continuación muestre el mensaje 
 * el número leído es positivo o bien el número leído es negativo dependiendo de que el número
 *  introducido por teclado sea positivo o negativo. Consideramos al número 0 positivo.
 */


package ejercicio7;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] argumentos){
		double numero = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número ");
		numero = teclado.nextDouble();
		if (numero > 0){
			System.out.println("El número es positivo");		
		}
		else{
			System.out.println("El número es negativo");
		}
		
	}

}
