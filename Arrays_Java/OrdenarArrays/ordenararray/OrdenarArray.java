package org.foobarspam.ordenararray;


import java.util.Arrays;

public class OrdenarArray {
	static int longitud = 30;
	public static int [] lista = new int [longitud];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < longitud; i++){
			int numeroAleatorio = (int) (Math.random() * 20) + 1;
			lista[i] = numeroAleatorio;	
		}
		Arrays.sort(lista);
		
		
		for (int numero : lista) {
            System.out.println(numero);
        }

	}
	
}
