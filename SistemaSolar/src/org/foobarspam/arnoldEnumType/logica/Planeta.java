package org.foobarspam.arnoldEnumType.logica;

public enum Planeta {
	
	MERCURY(3.303e+23, 2.4397e6);

	private double masa = 0d;
	private double radio = 0d;
	private double G = 6.67300E-11;
	
	private Planeta(double masa, double radio){
		this.masa = masa;
		this.radio = radio;
	}
	
	public double getMasa(){
		return this.masa;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double gravedadSuperficie(double masa, double radio){
		return G * masa / (radio*radio);
	}

	public double pesoSuperficie(double pesoHumano){
		return gravedadSuperficie(getMasa(), getRadio());
	}
}
