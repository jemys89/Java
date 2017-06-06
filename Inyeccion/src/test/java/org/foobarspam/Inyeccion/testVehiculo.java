package org.foobarspam.Inyeccion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testVehiculo {

	private MotorDiesel motor = new MotorDiesel();

	private Vehiculo vehiculo;
	
	private TiposMotor tipoMotor;

	@Before
	public void testInit() {
		motor.setRevoluciones(4500);

	}

	@Test
	public void test() {

		assertEquals(motor.getRevoluciones(), 3000);
		assertThat(motor.getRevoluciones()).isEqualTo(3000);

//		assertThat(vehiculo.getRevolucionesMotor()).isEqualTo(3000);

	}

	@Test
	public void testMotor() {
		
		FactoriaVehiculos.elegirMotor(tipoMotor.DIESEL);

	}

}
