package org.foobarspam.bicipalma;

public class TarjetaUsuario {
	
	//Inicializo las propiedades
	private String idTajetaUsuario = null;
	private boolean activada = false;
	
	//Inicializo los constructores
	public TarjetaUsuario(){
		
	}
	
	public TarjetaUsuario(String idTarjetaUsuario, boolean activada){
		this.idTajetaUsuario = idTarjetaUsuario;
		this.activada = activada;
	}
	
	//setters y getters
	public String getIdTajetaUsuario() {
		return idTajetaUsuario;
	}

	public void setIdTajetaUsuario(String idTajetaUsuario) {
		this.idTajetaUsuario = idTajetaUsuario;
	}

	public boolean getActivada() {
		return this.activada;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	
	
}
