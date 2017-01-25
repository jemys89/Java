package org.foobarspam.calcularbisiestos;

public class CalcularBisiestos {
	private int valor = 0;
	
	public CalcularBisiestos(int valor) {
		this.valor = valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public boolean esBisiesto()  {
		if((this.valor % 4 == 0 && this.valor %100 != 0)||  this.valor % 400 == 0) {
			return true;
		} else{
			return false;
		}
	}
	
	
}
