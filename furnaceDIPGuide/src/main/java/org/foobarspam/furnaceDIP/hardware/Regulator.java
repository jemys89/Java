package org.foobarspam.furnaceDIP.hardware;

import org.foobarspam.furnaceDIP.injector.Force;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Regulate;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Regulator implements Regulate {
	
	private Heater h;
	private Thermometer t;
	private RoomTemperature temperature;
	private double maxTemp = 15d;
	private  double minTemp = 21d;
	
	@Inject
	public Regulator(@Force Heater h, Thermometer t){
		this.h = h;
		this.t= t;
	}
	
	@Inject
	public void setTemperature(RoomTemperature temperature){
		this.temperature = temperature;
	}
	
	public void regulate( ){
			RegulatorDisplayCodes code;
			while(t.read(temperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				h.engage(temperature);
				message(code);
			}
			while (t.read(temperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				h.disengage(temperature);			
				message(code);
			}
	}

	public void message(RegulatorDisplayCodes code){
		switch(code){
			case HEATING:
				System.out.println("Calentando => temperatura "+ temperature.getTemperature());
				break;
			case WAITING:
				System.out.println("Apagado => temperatura " + temperature.getTemperature());
				break;
			default:
				System.out.println("Algo raro sucede...");
				break;
		}
	}


}
