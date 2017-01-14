
/*Escribe un programa que pida por teclado un número entero mostrando un mensaje oportuno. 
 * A continuación escribe en pantalla el número leído, el doble del número leído y el triple del mismo.
 */
import java.util.Scanner;
public class PrimeraClase {
	public static void main(String args[]){
		double rango1 = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba un número: ");
		rango1 = teclado.nextInt();

		System.out.println (("Su número es ")+ rango1 + (" el doble es ")+ rango1 * 2 + (" el triple es ")+ rango1 * 3);

		

		
}
}