/*Escribe un programa que pida por teclado un n�mero y que a continuaci�n muestre el mensaje 
 * el n�mero le�do es positivo o bien el n�mero le�do es negativo dependiendo de que el n�mero
 *  introducido por teclado sea positivo o negativo. Consideramos al n�mero 0 positivo.
 */


package ejercicio7;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] argumentos){
		double numero = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero ");
		numero = teclado.nextDouble();
		if (numero > 0){
			System.out.println("El n�mero es positivo");		
		}
		else{
			System.out.println("El n�mero es negativo");
		}
		
	}

}
