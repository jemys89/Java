package org.foobarspam.numeroscomprendidos;

public class NumerosComprendidosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosComprendidos tabla = new NumerosComprendidos();
		tabla.generarNumeros();
		
		
		 for (int numero : tabla.getLista()) {
	            System.out.println(numero);
	            
	        }
		 tabla.getImpares();
		 tabla.getPares();
		 for (int numero : tabla.getAuxiliar()){
			 System.out.println(numero);
		 }
	      
		 
	}
	
}
