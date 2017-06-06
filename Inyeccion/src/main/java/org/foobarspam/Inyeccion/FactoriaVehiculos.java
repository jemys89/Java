package org.foobarspam.Inyeccion;

public class FactoriaVehiculos {
	

	

	
	public FactoriaVehiculos(){
		
	}

	
	public static Vehiculo elegirMotor(TiposMotor tipoMotor){
		Vehiculo vehiculo = null;
		if (tipoMotor == tipoMotor.DIESEL){
			 vehiculo = new Vehiculo(new MotorDiesel());
		}else{
			vehiculo = new Vehiculo(new MotorGasolina());
		}
	
		return vehiculo;
	}

}
