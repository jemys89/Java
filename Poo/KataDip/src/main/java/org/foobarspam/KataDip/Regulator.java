package org.foobarspam.KataDip;

public class Regulator {
	
	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, Bath temperature){
			RegulatorDisplayCodes code;
			while(t.read(temperature) < maxTemp){
				code = RegulatorDisplayCodes.HEATING;				
				h.engage(temperature);
				message(code, temperature);
			}
			while (t.read(temperature) > minTemp){
				code = RegulatorDisplayCodes.WAITING;
				h.disengage(temperature);			
				message(code, temperature);
			}
	}

	private void message(RegulatorDisplayCodes code, Bath temperature){
		switch(code){
		
		case HEATING:
			System.out.println("Subiendo la temperatura + 1 : " + temperature.getTemperature());
			break;
		case WAITING:
			System.out.println("Bajando la temperatura - 1 :  " + temperature.getTemperature());
		}
	}

}
