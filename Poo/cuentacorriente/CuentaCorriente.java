/*#Cuenta Corriente
#Construye una clase de nombre CuentaCorriente que permita almacenar los datos asociados a la cuenta
 bancaria de un cliente,
# e interactuar con ellos. Este es nuestro ADT.
#Esta clase tendr� las siguientes propiedades, m�todos y constructores:
#Propiedades privadas (de momento, en Python nos da igual que sean privadas): 
#nombre, apellidos, direcci�n, tel�fono: todas de tipo string.
#NIF: objeto instancia de la clase DNI que resolvimos en clase**. Se trata de una relaci�n �Has-A� o 
�Tiene-una�.
#saldo: de tipo double.
#Constructores (inicializador en Python): 
#Constructor que por defecto inicializa las propiedades de la clase (programaci�n defensiva).
#Constructor al que se le pasen como argumentos todas las propiedades que tiene la clase.
#M�todos p�blicos: 
#set() y get() para todas las propiedades de la clase [Abstracci�n y encapsulamiento].
#retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.
#ingresarDinero(): a�ade al saldo una cantidad de dinero.
#consultarCuenta(): visualizar� los datos de la cuenta.
#saldoNegativo(): devolver� un valor l�gico indicando si la cuenta est� o no en n�meros rojos.
#** Puedes reutilizar la clase DNI que construimos en clase para definir la clase NIF mediante [herencia],
 si es que fuese 
#necesario alguna especializaci�n o cambio en la clase DNI. Eval�a si es posible reutilizarla tal cual.
*/

package org.foobarspam.cuentacorriente;

public class CuentaCorriente {
		
	private String nombre, apellidos, direccion, telefono, dni;
	private int saldo;
	// Inicializamos el constructor
	public  CuentaCorriente(){
		this.nombre = "";
		
		this.apellidos = ""; // Manejo de Errores
		
		this.direccion = "";
		
		this.telefono = "" ;
		
		this.dni = "";
		
		this.saldo = 0;
		
	}
	//metodos Getters y Setters
	public String getNombre(){
		return "Nombre: " + this.nombre;
	}
	
	public void  setNombre(String introducirNombre){
		this.nombre = introducirNombre;
	}
	
	
	public String getApellidos(){
		return "Apellidos: " + this.apellidos;
	}
	
	public void setApellidos(String introducirApellidos){
		this.apellidos = introducirApellidos;
	}
	
	
	public  String getDireccion(){
		return "Direcci�n: " + this.direccion;
	}
	
	public void setDireccion(String introducirDireccion){
		this.direccion = introducirDireccion;
	}
	
	public  String getTelefono(){
		return "Telefono: " + this.telefono;
	}
	
	public void setTelefono(String introducirTelefono){
		this.telefono = introducirTelefono;
	}
	
	public  String getDni(){
		return "DNI: " + this.dni;
	}
	
	public void setDni(String introducirDni){
		this.dni = introducirDni;
	}
	
	public  String getSaldo(){
		return "Saldo: " + this.saldo;
	}
	
	public void setSaldo(int introducirSaldo){
		this.saldo = introducirSaldo;
	}
	//retirarDinero(): resta al saldo una cantidad de dinero pasada como argumento.
	public void retirarDinero(int adeudo){
		this.saldo = this.saldo - adeudo;
	}
	
	// ingresarDinero(): a�ade al saldo una cantidad de dinero.
	public void ingresarDinero(int ingreso){
		this.saldo = this.saldo + ingreso;
	}
	
	//consultarCuenta(): visualizar� los datos de la cuenta.
	public String consultarCuenta(){
		return "Nombre: " + this.nombre + "\n" + "Apellidos: " + this.apellidos + "\n" + "Direcci�n: " 
				+ this.direccion +"\n" + "Tel�fono: " + this.telefono + "\n" + "DNI: " + this.dni 
				+ "\n" + "Saldo: " + this.saldo;
	}
}
