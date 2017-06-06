package org.foobarspam.Inyeccion;

public class MotorGasolina implements MotorI{
	
	private final int MINIMA = 1500;
	private final int MAXIMA = 4000;
	
	private int revoluciones;

	public int getRevoluciones() {
		
		return this.revoluciones ;
	}

	public void acelerar() {
		this.revoluciones += 100;
		
	}
	
	public void setRevoluciones(int revoluciones){
		if(this.revoluciones > MINIMA){
			this.revoluciones = revoluciones;
		}else if(this.revoluciones > MAXIMA){
			this.revoluciones = MAXIMA;
			
		}else if(this.revoluciones < MINIMA){
			this.revoluciones = MINIMA;
		}
		
	}
	
	
	

}
