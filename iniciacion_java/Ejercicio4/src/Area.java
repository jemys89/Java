/*Escribe un programa que calcule el �rea de una finca rectangular en metros cuadrados,
 *  as� como su per�metro exterior, tambi�n en metros.
 */
import java.util.Scanner;
import java.lang.Math;
public class Area {
	public static void main(String[] parametro) {
		double area, altura = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba los metros de su finca: ");
		area = teclado.nextDouble();
		System.out.println ("Escriba la altura de su finca: ");
		altura = teclado.nextDouble();
		System.out.println ("Los metros cuadrados de su finca son " + (altura * area));
		System.out.println ("El per�metro de su finca es " + (area * 2) + (altura * 2));

}
}