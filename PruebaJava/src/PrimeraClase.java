
/*Escribe un programa que pida por teclado un n�mero entero mostrando un mensaje oportuno. 
 * A continuaci�n escribe en pantalla el n�mero le�do, el doble del n�mero le�do y el triple del mismo.
 */
import java.util.Scanner;
public class PrimeraClase {
	public static void main(String args[]){
		double rango1 = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba un n�mero: ");
		rango1 = teclado.nextInt();

		System.out.println (("Su n�mero es ")+ rango1 + (" el doble es ")+ rango1 * 2 + (" el triple es ")+ rango1 * 3);

		

		
}
}