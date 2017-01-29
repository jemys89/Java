/*#Construye una clase de nombre Hora que permita almacenar la hora, as� como los m�todos para manipularla
# (este es nuestro ADT). Tendr� las siguientes propiedades y m�todos:
#Propiedades (todas ellas privadas):
#hora: de tipo entero (00 - 24)
#minutos: de tipo entero (00 - 59)
#segundos: de tipo entero (00 - 59)
#Constructor (inicializador en Python):
#Constructor que, por defecto, inicialice las propiedades de la clase a 0 [programaci�n defensiva].
#Constructor al que se le pasen como argumentos tres enteros y se los asigne a las propiedades de la clase.
# Si la cantidad recibida no satisface las restricciones de los valores impuestos a horas, minutos y segundos,
# el valor que se fija es 0 [Manejo de errores]: devolver un valor neutro, aunque en este caso no lo sea.
#M�todos de la clase (p�blicos):
#setHora(): recibe como argumentos tres enteros y se los asigna a las propiedades de la clase. Utiliza el mismo nombre
# en las variables que reciben los argumentos y en las propiedades de la clase. Este m�todo ha de dise�arse mediante
# programaci�n por contrato, es decir, debe incluir una precondici�n: si los valores recibidos no satisfacen 
#las restricciones de los valores impuestos a horas, minutos y segundos, el valor que se establece es 0 
#[Manejo de errores: devolver un valor neutro, aunque en este caso no lo sea]. Ya que va a ser utilizado en el cosntructor,
# este precondici�n podr�a implementarse en su propia rutina para ser llamada desde este m�todo y desde el �constructor�.
#getHora(): devuelve la hora como una lista de la forma [horas, minutos, segundos] o como un string de la 
#forma "horas:minutos:segundos".
#imprmirHora() que muestra en consola la hora en formato string de la forma "horas:minutos:segundos".
#M�todos set() y get() para todas las propiedades [Abstracci�n y encapsulamiento].*/

package org.foobarspam.hora;

public class Hora {
		private int hora, minutos, segundos = 0;
		
		//Inicializamos el constructor
		public Hora(){
			
		}
		public Hora (int hora, int  minutos, int segundos){
			if (hora > 24 || hora < 0){
				this.hora = 0;
			}else{
				this.hora = hora;
			}
			if (minutos >= 60 ||  minutos < 0 ){
				this.minutos = 0;
			}
			else{
				this.minutos = minutos;
			}
			if ( segundos >= 60 || segundos <0){
				this.segundos = 0;
			}else{
				this.segundos = segundos;
			}
		}
		// M�todos Setters y Getters
		public int getHora() {
			return hora;
		}

		public void setHora(int hora, int minutos, int segundos) {
			this.hora = hora;
			this.minutos = minutos;
			this.segundos = segundos;
		}

		public int getMinutos() {
			return minutos;
		}

		public void setMinutos(int minutos) {
			this.minutos = minutos;
		}

		public int getSegundos() {
			return segundos;
		}

		public void setSegundos(int segundos) {
			this.segundos = segundos;
		}
		//M�todo para imprimir hora
		public String imprimirHora(){
			return this.hora + ":" + this.minutos + ":" + this.segundos;	
			}
}
