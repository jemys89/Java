package org.foobarspam.ordenarlista;
import java.util.Arrays;
public class OrdenarListaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdenarLista prueba = new OrdenarLista();
		int lista[] =prueba.getLista();
        prueba.generarNumeros();
     
        
        for (int numero : lista) {
            System.out.println(numero);
            
        }
        prueba.ordenarLista();
        for (int numero : lista) {
            System.out.println(numero);
            
        }
	}

}
