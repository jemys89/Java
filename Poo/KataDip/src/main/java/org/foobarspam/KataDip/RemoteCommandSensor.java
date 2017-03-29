package org.foobarspam.KataDip;

public class RemoteCommandSensor implements Thermometer{
	
	public double read(Bath temperature){
		double weather = temperature.getTemperature();
		return weather;
	}
}
