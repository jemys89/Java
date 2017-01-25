package org.foobarspam.figurasgeometricas;
import java.lang.Math;
public class Circulo extends FigurasGeometricas{
	
	
	//Propiedad
	private double radio;
	
	//Contructor
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	
	//Set y Get
		public void setRadio(double radio){
			this.radio = radio;
		}
		public double getRadio(){
			return this.radio;
		}
		
		//OCP
		@Override
		public double area(){
			return Math.pow(this.radio, 2) * Math.PI; 

}
}