package org.foobarspam.figurasgeometricas;

public class Cuadrado extends FigurasGeometricas {
	
	//Propiedad
	private double lado;
	
	
	//Constructor
	public  Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
		
	}
	//Set y Get
	public void setCuadrado(double lado){
		this.lado = lado;
	}
	public double getCuadrado(){
		return this.lado ;
	}
	
	//OCP
	@Override
	public double area(){
		return Math.pow(this.lado,2);
	}

}
