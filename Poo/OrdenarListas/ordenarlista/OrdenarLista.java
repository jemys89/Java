package org.foobarspam.ordenarlista;

import java.util.Arrays;
import java.util.Random;

public class OrdenarLista {
	
	private int [] lista = new int [30];
	
	public OrdenarLista(){
		this.lista = lista;
	
	}
	public int[] getLista() {
		return this.lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}
	public int [] generarNumeros(){
		
		for(int i = 0; i < 30; i++){
			int numeroAleatorio = (int) (Math.random() * 20) + 1;
			this.lista[i] = numeroAleatorio;	
		}
		return getLista();
	
	}
	public int [] ordenarLista(){
		Arrays.sort(getLista());
		return getLista();
	}
	
	
}
