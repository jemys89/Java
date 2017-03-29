package org.foobarspam.KataDip;

public class GasHeater implements Heater{
	
	public void engage(Bath temperature){
		temperature.setTemperature(1);
	}
	public void disengage(Bath temperature){
		temperature.setTemperature(-1);
	}

}
