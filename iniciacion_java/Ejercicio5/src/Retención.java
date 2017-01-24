/*Escribe un programa que calcule lo que tiene que cobrar un empleado sabiendo que se le tiene
 *  que aplicar al sueldo una retención del 20%.
 */
import java.util.Scanner;
public class Retención {
	public static void main(String[] parametro){
		double descuento, sueldo = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba el sueldo al que se le quiere aplicar el descuento: ");
		sueldo = teclado.nextDouble();
		descuento = 0.80;
		System.out.println ("Su sueldo aplicando el descuento es " + (sueldo * descuento));
		
	}

}
