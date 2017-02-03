package org.foobarspam.ordenararray;

import java.util.Arrays;

public class ArrayOrdenado {
	
		private int [] array = {};
		//Constructores
		public ArrayOrdenado(){
			
		}
		public ArrayOrdenado(int [] array){
			this.array = array;
		}
		//getters
		public int [] getArray(){
			return this.array;
		}
		//Métodos
		public int longitudArray() {
			int longitud = 0;
			int[] array = getArray();
			for (int i=0; i<array.length; i++) {
				longitud += array[i];
			}
			return longitud;
		}
		public int [] ordenarArray(int [] array){
			int [] ordenado = getArray();
			 Arrays.sort(ordenado);
			 Arrays.toString(ordenado);
			return ordenado;
		}
		
		
}
