/*#Cuenta Corriente
#Construye una clase de nombre CuentaCorriente que permita almacenar los datos asociados a la cuenta
 bancaria de un cliente,
# e interactuar con ellos. Este es nuestro ADT.
#Esta clase tendrá las siguientes propiedades, métodos y constructores:
#Propiedades privadas (de momento, en Python nos da igual que sean privadas): 
#nombre, apellidos, dirección, teléfono: todas de tipo string.
#NIF: objeto instancia de la clase DNI que resolvimos en clase**. Se trata de una relación “Has-A” o 
“Tiene-una”.
#saldo: de tipo double.
#Constructores (inicializador en Python): 
#Constructor que por defecto inicializa las propiedades de la clase (programación defensiva).
#Constructor al que se le pasen como argumentos todas las propiedades que tiene la clase.
#Métodos públicos: 
#set() y get() para todas las propiedades de la clase [Abstracción y encapsulamiento].
#retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.
#ingresarDinero(): añade al saldo una cantidad de dinero.
#consultarCuenta(): visualizará los datos de la cuenta.
#saldoNegativo(): devolverá un valor lógico indicando si la cuenta está o no en números rojos.
#** Puedes reutilizar la clase DNI que construimos en clase para definir la clase NIF mediante [herencia],
 si es que fuese 
#necesario alguna especialización o cambio en la clase DNI. Evalúa si es posible reutilizarla tal cual.
*/

package org.foobarspam.cuentacorriente;

public class CuentaCorriente {
		
	private String nombre, apellidos, direccion, telefono, dni;
	private int saldo;
	// Inicializamos el constructor
	public  CuentaCorriente(){
		nombre = nombre;
		
		apellidos = apellidos;
		
		direccion = direccion;
		
		telefono = telefono ;
		
		dni = dni;
		
		saldo = saldo;
		
	}
	//metodos Getters y Setters
	public String getNombre(){
		return "Nombre: " + nombre;
	}
	
	public void  setNombre(String introducirNombre){
		nombre = introducirNombre;
	}
	
	
	public String getApellidos(){
		return "Apellidos: " + apellidos;
	}
	
	public void setApellidos(String introducirApellidos){
		apellidos = introducirApellidos;
	}
	
	
	public  String getDireccion(){
		return "Dirección: " + direccion;
	}
	
	public void setDireccion(String introducirDireccion){
		direccion = introducirDireccion;
	}
	
	public  String getTelefono(){
		return "Telefono: " + telefono;
	}
	
	public void setTelefono(String introducirTelefono){
		telefono = introducirTelefono;
	}
	
	public  String getDni(){
		return "DNI: " + dni;
	}
	
	public void setDni(String introducirDni){
		dni = introducirDni;
	}
	
	public  String getSaldo(){
		return "Saldo: " + saldo;
	}
	
	public void setSaldo(int introducirSaldo){
		saldo = introducirSaldo;
	}
	//retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.
	public void retirarDinero(int adeudo){
		saldo = saldo - adeudo;
	}
	
	// ingresarDinero(): añade al saldo una cantidad de dinero.
	public void ingresarDinero(int ingreso){
		saldo = saldo + ingreso;
	}
	
	//consultarCuenta(): visualizará los datos de la cuenta.
	public String consultarCuenta(){
		return "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Dirección: " + direccion +
				"\n" + "Teléfono: " + telefono + "\n" + "DNI: " + dni + "\n" + "Saldo: " + saldo;
	}
}
