/*Escribe un programa que pida por teclado dos valores de tipo num�rico que se han de guardar
 *  en sendas variables. �Qu� instrucciones habr�a que utilizar para intercambiar su contenido?
 *   (es necesario utilizar una variable auxiliar). Para comprobar que el algoritmo ideado es correcto,
 *    muestra en pantalla el contenido de las variables una vez le�das, y vuelve a mostrar su contenido 
 *    una vez hayas intercambiado sus valores
 */
import java.util.Scanner;

public class variableAuxiliar {
	public static void main(String[] parametro){
		double primeraVariable, segundaVariable, terceraVariable = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un n�mero: ");
		primeraVariable = teclado.nextDouble();
		System.out.println("Introduce un segundo n�mero: ");
		segundaVariable = teclado.nextDouble();
		
		terceraVariable = primeraVariable;
		segundaVariable = terceraVariable;
		primeraVariable = segundaVariable;
		
		System.out.println("El primer n�mero vale ahora " + primeraVariable + ", el segundo " + segundaVariable);
		

	}

}
