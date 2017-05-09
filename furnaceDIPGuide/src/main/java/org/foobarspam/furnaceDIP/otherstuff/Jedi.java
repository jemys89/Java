package org.foobarspam.furnaceDIP.otherstuff;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Jedi implements Heater {
	
	private Heater h;
	private RoomTemperature temperature;
	
	@Inject
	public Jedi(Heater heater){
		this.h = heater;
	}
	
	@Inject
	public void setTemperature(RoomTemperature t){
		this.temperature = t;
	}
	
	public void engage(RoomTemperature temperature){
		 temperature.incrementTemperature(this.toucheLightSable());
	}
	public void disengage(RoomTemperature temperature){

		this.forcePersuasion( temperature);
	}
	
	private double toucheLightSable(){
		final double lightSableTemperature = 1400; // in ºC
		return lightSableTemperature;
	}
	
	private void forcePersuasion( RoomTemperature temperature){
		temperature.incrementTemperature(-1400);
		h.disengage(temperature);
	}
	
	public void speak(){
    System.out.println("\n"
    		+ "\t  __.-._   \n"
    		+ "\t  '-._\"7' \n"
    		+ "\t   /'.-c   \n"
    		+ "\t   |  /T   \n"
    		+ "\t  _)_/LI   \n"
    		+ "\nDo or do not. There is no try ");
	}
}
