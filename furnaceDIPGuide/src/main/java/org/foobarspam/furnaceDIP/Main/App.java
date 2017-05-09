package org.foobarspam.furnaceDIP.Main;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.Regulator;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.injector.RegulatorModule;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//final double minTemp = 15.0;
        //final double maxTemp = 21.0;
        
        Injector injector = Guice.createInjector(new RegulatorModule()); 
        
        Regulator regulator = injector.getInstance(Regulator.class);
        Jedi yoda = injector.getInstance(Jedi.class);
        
        
       
        
       
        
        System.out.println( "Arrancando..." );
        regulator.regulate();
        
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate();
        yoda.speak();
    }
}
