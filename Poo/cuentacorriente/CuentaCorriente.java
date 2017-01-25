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
		return "Dirección: " + this.direccion;
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
	
	// ingresarDinero(): añade al saldo una cantidad de dinero.
	public void ingresarDinero(int ingreso){
		this.saldo = this.saldo + ingreso;
	}
	
	//consultarCuenta(): visualizará los datos de la cuenta.
	public String consultarCuenta(){
		return "Nombre: " + this.nombre + "\n" + "Apellidos: " + this.apellidos + "\n" + "Dirección: " 
				+ this.direccion +"\n" + "Teléfono: " + this.telefono + "\n" + "DNI: " + this.dni 
				+ "\n" + "Saldo: " + this.saldo;
	}
}
