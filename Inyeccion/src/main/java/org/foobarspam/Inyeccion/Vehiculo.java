package org.foobarspam.Inyeccion;

public class Vehiculo
{
    private MotorI m;
    
    private int revoluciones;
    
    
    
    public int getRevoluciones() {
		return revoluciones;
	}

	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones;
	}

	public Vehiculo(){
    	
    }
 
    public Vehiculo(MotorI motorVehiculo)
    {
        // El módulo superior ya no instancia directamente el objeto Motor,
        // sino que éste es pasado como parámetro en el constructor
        m = motorVehiculo;
    }
 
    public int getRevolucionesMotor()
    {
        return m.getRevoluciones();
    }
}