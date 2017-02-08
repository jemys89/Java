package org.foobarspam.bicipalma;
import java.util.concurrent.ThreadLocalRandom;
public class Estacion {
	
	
	// Inicializo las propiedades
	private int idEstacion = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta [] anclajes = null;
	
	//Inicializo los constructores
	public Estacion(){
		
	}
	
	public Estacion(int idEstacion){
		this.idEstacion = idEstacion;
	}
	
	
	public Estacion(int idEstacion, String direccion){
		this.idEstacion = idEstacion;
		this.direccion = direccion;
		
	}
	
	public Estacion(int idEstacion, String direccion, int numeroAnclajes){
		this.idEstacion = idEstacion;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
		
	}
	
	
	//Setters y Getters
	public int getIdEstacion() {
		return this.idEstacion;
	}

	public void setIdEstacion(int idEstacion) {
		this.idEstacion = idEstacion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	public void setAnclajes(Bicicleta bicicleta, int anclajes){
		this.anclajes[anclajes]= bicicleta;
	}

	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}

	
	
	//Métodos
	public void consultarEstacion(){
		System.out.println("id: " + getIdEstacion());
		System.out.println("direccion: " + getDireccion());
		System.out.println("numeroAnclajes: " + getNumeroAnclajes());
	}
	
	
	public int anclajesLibres(){
		int libresAnclajes = 0;
		for(Bicicleta anclaje : getAnclajes()){
			if( anclaje == null){
				libresAnclajes += 1;
			}
		}return libresAnclajes;
	}
	
	public void consultarAnclajes(){
		
		for(int anclaje = 0; anclaje < getAnclajes().length; anclaje ++){
			if(getAnclajes()[anclaje] == null){
				System.out.println("La posición " + (anclaje + 1)  + " está vacía");
			}else{
				System.out.println("La posición " + (anclaje + 1) + " está ocupada con el id " + getAnclajes()[anclaje].getIdBicicleta());
			}
	}
	
	}
	public void anclarBicicleta(Bicicleta bicicleta){
		for(int anclaje = 0; anclaje < getAnclajes().length; anclaje ++){
			if(getAnclajes()[anclaje] == null){
				getAnclajes()[anclaje] = bicicleta;
				
				mostrarAnclaje(bicicleta.getIdBicicleta(),anclaje);
				break;
			}
	}
	}
	public void mostrarAnclaje(int idBicicleta,int numeroAnclaje){
		if(getAnclajes()[numeroAnclaje] != null){
			System.out.println("La bicicleta con ID: " + getAnclajes()[numeroAnclaje].getIdBicicleta() + 
				 " está en la posición " + (numeroAnclaje + 1));
		}else{
			System.out.println("No hay anclajes libres");
		}
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getActivada();
	}
	
	
	public void retirarBicicleta(TarjetaUsuario activada){
		if(activada.getActivada() ){
			boolean biciRetirada = false;
			
			while (!biciRetirada){	
			
				int anclajeAleatorio = generarAnclaje();
				int numeroAnclaje = anclajeAleatorio + 1;
			if(getAnclajes()[anclajeAleatorio] != null){
					mostrarBicicleta(getAnclajes()[anclajeAleatorio].getIdBicicleta(), anclajeAleatorio );
					
					getAnclajes()[anclajeAleatorio] = null;
					biciRetirada = true;
					
				}else{
					System.out.println("No hay bicicletas");
				}
			}
	}}
	

	public void mostrarBicicleta(int bicicleta, int numeroAnclaje){
		if(getAnclajes()[numeroAnclaje] != null){
			System.out.println("La bicicleta con ID: " + getAnclajes()[numeroAnclaje].getIdBicicleta() + 
				 " estaba en la posición " + (numeroAnclaje + 1));
		}else{
			System.out.println("No hay anclajes libres");
		}
	}
	
	public int generarAnclaje(){
		 int anclajeAleatorio = ThreadLocalRandom.current().nextInt(numeroAnclajes -1);
		 return anclajeAleatorio;
	}
}
