/*Declara un Array de nombre lista que estar� formado por 25 datos de tipo entero generados
 al 
azar
 *  comprendidos entre 25 y 50. Declara otro vector de nombre auxiliar formado por 4 datos de tipo real.
Almacenar en este Array lo siguiente: 
Posici�n 0: n�mero de n�meros pares en lista. 
Posici�n 1: n�mero de n�meros impares de lista. 
Posici�n 2: media de los n�meros impares de lista. 
Posici�n 3: suma de los n�meros enteros comprendidos entre 1 y el valor par m�s peque�o de lista. 
Escribe a continuaci�n el contenido de lista, as� como los resultados obtenidos y almacenados en auxiliar.*/


package org.foobarspam.numeroscomprendidos;


import java.util.Arrays;

public class NumerosComprendidos {
		
	private int [] lista = new int [25];
	private int [] auxiliar = new int [4];
	public int pares = 0;
	public int impares = 0;
	
	public NumerosComprendidos(int... lista){
		this.lista = lista;
	}
	
	public void setLista(int... lista){
		this.lista = lista;
	}
	public int [] getLista(){
		return this.lista;
	}
	
	public int [] getAuxiliar(){
		return this.auxiliar;
	}
	
	
	//L�gica
	public int [] generarNumeros(){
		
		for(int i = 0; i < 25; i++){
			int numeroAleatorio = (int) (Math.random() * (26) + 25 );
			this.lista[i] = numeroAleatorio;	
		}return this.lista;
	}
	public int  getPares(){
		int pares = 0;
		for(int elemento : lista){
			if(elemento %2 == 0){
				auxiliar[0]=pares +=1;;
			}
		}return pares;
	}
	public int  getImpares(){
		int imPares = 0;
		for(int elemento : lista){
			if(elemento %2 != 0){
				auxiliar[1]=imPares +=1;
			}
		}return imPares;
	}
	public int mediaImpares(){
		int sumaImpares = 0;
		
		for(int i : lista){
			if(i %2 != 0){
				sumaImpares += i;
			}
		}return auxiliar[2] = sumaImpares / getImpares();
		
	}
	public int sumaNumerosComprendidos(){
		Arrays.sort(getLista());
		int sumaNumeros = 0;
		for(int i = 0; i<=getLista()[0];i++){
			sumaNumeros += i;
			
		}return auxiliar[3] = sumaNumeros;
	}
	
	
	
	}
	

