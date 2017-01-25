package org.foobarspam.figurasgeometricas;

public abstract class FigurasGeometricas {
	
	private String nombre;
	
	// Constructor
	public FigurasGeometricas(String nombre){
		this.nombre = nombre;
	}
	
	// Get y set (Abstracci�n y encapsulamiento)
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	// OCP
	public abstract double area();

}
