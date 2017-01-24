/*Escribe un programa que pida por teclado el radio de una circunferencia, y que a continuación 
 * calcule y escriba en pantalla la longitud de la circunferencia y del área del círculo.
 */
import java.util.Scanner;
import java.lang.Math;
public class Radio_Circunferencia {
	public static void main(String[] parametro) {
		double radio = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba el radio de una circunferencia: ");
		radio = teclado.nextDouble();
		System.out.println ("Su longitud es: " + (2 * Math.PI * radio));
		System.out.println ("Su área es: " + (Math.PI * (Math.pow(radio,2))));
		

}
}