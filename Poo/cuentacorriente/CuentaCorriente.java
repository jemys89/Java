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
		
	private String nombre, apellidos, direccion, telefono, dni = "";
	private int saldo = 0;
	
	// Inicializamos el constructor
	public CuentaCorriente(){
		
	}
	
	public  CuentaCorriente(String nombre, String apellidos, String direccion, String telefono,
			String dni, int saldo){
		this.nombre = nombre;
		
		this.apellidos = apellidos; 
		
		this.direccion = direccion;
		
		this.telefono = telefono;
		
		this.dni = dni;
		
		this.saldo = saldo;
		
	}
	//metodos Getters y Setters
	public String getNombre(){
		return  this.nombre;
	}
	
	public void  setNombre(String introducirNombre){
		this.nombre = introducirNombre;
	}
	
	
	public String getApellidos(){
		return   this.apellidos;
	}
	
	public void setApellidos(String introducirApellidos){
		this.apellidos = introducirApellidos;
	}
	
	
	public  String getDireccion(){
		return this.direccion;
	}
	
	public void setDireccion(String introducirDireccion){
		this.direccion = introducirDireccion;
	}
	
	public  String getTelefono(){
		return this.telefono;
	}
	
	public void setTelefono(String introducirTelefono){
		this.telefono = introducirTelefono;
	}
	
	public  String getDni(){
		return this.dni;
	}
	
	public void setDni(String introducirDni){
		this.dni = introducirDni;
	}
	
	public  double getSaldo(){
		return this.saldo;
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
		return "Nombre: " + getNombre()+ "\n" + "Apellidos: " + getApellidos()+ "\n" + "Direcci�n: " 
				+ getDireccion() +"\n" + "Tel�fono: " + getTelefono()+ "\n" + "DNI: " + getDni()
				+ "\n" + "Saldo: " + getSaldo();
	}
	//saldoNegativo(): devolver�  un valor booleano si el salgo es negativo.
	public boolean saldoNegativo() {
		if (getSaldo() < 0) {
			return true;
		} else {
			return false;
		}

	}	
}
