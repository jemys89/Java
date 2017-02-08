package org.foobarspam.bicipalma;

public class TarjetaUsuario {
	
	//Inicializo las propiedades
	private int idTajetaUsuario = 0;
	private boolean activada = false;
	
	//Inicializo los constructores
	public TarjetaUsuario(){
		
	}
	
	public TarjetaUsuario(int idTarjetaUsuario, boolean activada){
		this.idTajetaUsuario = idTarjetaUsuario;
		this.activada = activada;
	}
	
	//setters y getters
	public int getIdTajetaUsuario() {
		return idTajetaUsuario;
	}

	public void setIdTajetaUsuario(int idTajetaUsuario) {
		this.idTajetaUsuario = idTajetaUsuario;
	}

	public boolean getActivada() {
		return this.activada;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	
	
}
