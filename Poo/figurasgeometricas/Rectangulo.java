package org.foobarspam.figurasgeometricas;

public class Rectangulo extends FigurasGeometricas {
	
	
	//Propiedades
	private double anchura;
	private double altura;
	
	
	//Constructor 
	public Rectangulo(String nombre, double altura, double anchura ){
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	//Setters y Getters
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setAnchura(double anchura){
		this.anchura = anchura;
		
	}
	public double getAltura(){
		return this.altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	//OCP
	@Override 
	public double area(){
		return altura * anchura;
	}

}
