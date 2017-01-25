package org.foobarspam.figurasgeometricas;

import java.lang.Math;

public class Eclipse extends FigurasGeometricas {
	
	//Propiedades
	private double radioMenor;
	private double radioMayor;
	
	//Contructor
	public Eclipse(String nombre, double radioMenor, double radioMayor){
		super(nombre);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}
	//Setters y Getters
	public void setRadioMenor(double radioMenor){
		this.radioMenor = radioMenor;
		
	}
	public void setRadioMayor(double radioMayor){
		this.radioMayor = radioMayor;
	}
	
	public double getRadioMenor(){
		return this.radioMenor;
	}
	
	public double getRadioMayor(){
		return this.radioMayor;
	}
	
	@Override
	public double area(){
		return Math.PI * this.radioMenor * this.radioMayor;
	}
}
