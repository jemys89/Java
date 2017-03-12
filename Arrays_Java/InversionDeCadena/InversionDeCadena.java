package org.foobarspam.inversiondecadena;
import java.util.Stack;
public class InversionDeCadena {
	private String cadena = null;


	public InversionDeCadena(String cadena){
	this.cadena = cadena;
	}
	
	public Stack convertirEnStack(){
		Stack almacen = new Stack();
		
		for(char caracter : this.cadena.toCharArray()){
			almacen.push(caracter);
		}
		return almacen;
	}
	
	public Stack invertirCadena(){
		Stack convertir = convertirEnStack();
		Stack invertirCadena = new Stack();
		
		for(Object caracter : convertirEnStack()){
			invertirCadena.push(convertir.pop());
		}
		return invertirCadena;
	}
	
	public String cadenaAlReves(){
		String cadena = "";
		for (Object caracter : invertirCadena()){
			cadena += caracter;
		}
		return cadena;
	}


}