package org.foobarspam.cuentacorriente;

public class UsarCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente Pepita = new CuentaCorriente();
		
		Pepita.setNombre("Pepita");
		Pepita.setApellidos("Loca García");
		Pepita.setDireccion("Calle de los gatos");
		Pepita.setSaldo(100);
		Pepita.setTelefono("654987321");
		Pepita.setDni("45625248Q");
		Pepita.retirarDinero(20);
		Pepita.ingresarDinero(200);
		System.out.println(Pepita.consultarCuenta());
	}

}
