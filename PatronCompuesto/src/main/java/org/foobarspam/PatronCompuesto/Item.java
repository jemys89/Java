package org.foobarspam.PatronCompuesto;

import java.awt.List;
import java.util.ArrayList;

public class Item implements Iterable, Componible{
	
	private String nombre = null;
	
	private boolean compuesto = false;
	
	private ArrayList<Item> hijos = new ArrayList<Item>();
	
	

	public Item(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isCompuesto() {
		return compuesto;
	}

	public void setCompuesto(boolean compuesto) {
		this.compuesto = compuesto;
	}
	
	public ArrayList<Item> getHijos() {
		return hijos;
	}

	public void setHijos(ArrayList<Item> hijos) {
		this.hijos = hijos;
	}
	
	public void anhadir(Item item){
		
			getHijos().add(item);
			System.out.println("OK: se ha añadido item equipo : " + item.getNombre());
		
	}

	public void iterable() {
		// TODO Auto-generated method stub
		System.out.println(getNombre());
		for(Item item : getHijos()){
			if(item.isCompuesto()){
				item.iterable();
			}else{
				System.out.println("----------------" + item.getNombre());
			}
			
		}
		
	}

	public void composite(String[] nombres) {
		// TODO Auto-generated method stub
		int contador = 0;
		if(isCompuesto()){
			for(String nombre : nombres){
				contador++;
				Item itemSimple = new SimpleItem(nombre);
				getHijos().add(itemSimple);
			}
		}System.out.println("OK: se han añadido " + contador + " equipos");
		
	}
	
	public void composite(ArrayList<Item> hijos){
		if(isCompuesto()){
			for(Item item : hijos){
				getHijos().add(item);
			}
		}
	}
	
	public void quitar(String nombre){
		for(int i = 0; i < getHijos().size(); i++){
			if(getHijos().get(i).getNombre() == nombre){
				getHijos().remove(i);
			}else if( getHijos().get(i).getHijos().get(i).getNombre() == nombre){
				getHijos().get(i).getHijos().remove(i);
			}else if(getHijos().get(i).getHijos().get(i).getHijos().get(i).getNombre() == nombre){
				getHijos().get(i).getHijos().get(i).getHijos().remove(i);
			}
			
		}
	}

}
