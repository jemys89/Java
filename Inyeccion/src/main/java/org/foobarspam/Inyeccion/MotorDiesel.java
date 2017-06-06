package org.foobarspam.Inyeccion;

public class MotorDiesel implements MotorI{
	
	private int revoluciones ;
	
	private final int MINIMA = 900;
	private final int MAXIMA = 3000;
	
	public MotorDiesel(){
		
	}
	
	public void setRevoluciones(int revoluciones){
		if(revoluciones > MAXIMA){
			this.revoluciones = MAXIMA;
			
		}else if(revoluciones < MINIMA){
			this.revoluciones = MINIMA;
		}else{
			this.revoluciones = revoluciones;
		}
		
	}
	
	public int getRevoluciones(){
		return this.revoluciones;
	}

	public void acelerar() {
		this.revoluciones += 100;
		
	}

}
