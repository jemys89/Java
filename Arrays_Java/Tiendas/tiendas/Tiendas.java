package org.foobarspam.tiendas;

import java.util.*;

public class Tiendas {
		
	private double [] ventas = new double[5];
	
	
	
	public Tiendas( double... tiendasVentas){
		
		this.ventas = tiendasVentas;
		
	}
	
	public void setVentas(double... tiendasVentas){
		this.ventas = tiendasVentas;
	}
	public double [] getVentas(){
		return this.ventas;
	}
	//Métodos
	public double [] ordenarVentas(){
		double [] ventasDesordenadas = getVentas();
		Arrays.sort(ventasDesordenadas);
		return ventasDesordenadas;
	}
	
	public double ventasMayor(){
		double [] ventasOrdenadas = ordenarVentas();
		return ventasOrdenadas[4];
	}
	
	public double ventasMenor(){
		double [] ventasOrdenadas = ordenarVentas();
		return ventasOrdenadas[0];
	}
	
	public double ventasTotal(){
		double totalVentas = 0d;
		for (double venta : getVentas()) {
		   totalVentas += venta;
		}
		return totalVentas;
	
	}
}
