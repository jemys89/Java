package org.foobarspam.cuentacorriente;

public class UsarCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente Pepita = new CuentaCorriente("Pepita","Loca Garcia","Calle de los gatos",
				"654987456","43125874Q", 80);
		
		
		Pepita.retirarDinero(20);
		Pepita.ingresarDinero(200);
		System.out.println(Pepita.consultarCuenta());
	}

}
