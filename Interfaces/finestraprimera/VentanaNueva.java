package org.foobarspam.finestraprimera;


import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class VentanaNueva extends JFrame {
	
	public VentanaNueva(){
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int ancho=d.width/3; // Un terç de l'amplada de la finestra
		int alto=d.height/3; // Un terç de l'alçada de la finestra
		this.setSize(ancho, alto);
		this.setLocation(d.width/2-ancho/2,d.height/2-alto/2); //Així queda en el centre de la pantalla
		
		this.setBackground(new Color(205,255,15));// El color del fons de
		//la pantalla. Hem de crear un objecte de la classe Color amb els
		//paràmeres del RGB. Aquests paràmetres són un verd
		this.setForeground(Color.blue);// El color de la barra de dalt.
		//Es una variable de la classe Color. Una altra manera de donar
		//color
		Font fuente = new Font("Arial", Font.PLAIN, 20);// Cream un
		//objecte de la classe Font amb els paràmetres: Nom de la font,
		//aspecte (normal:PLAIN, negreta:BOLD o cursiva:ITALIC
		this.setFont(fuente);//Establim la font de ventana a partir de
		//l'objecte fuente anterior
		this.setTitle("Ejemplo de ventana ");//Establim el nou titol de
		//la finestra.
		
		Label etiq = new Label(); //Es crea l'etiqueta a partir d'un
		//objecte de la classe Label
		etiq.setText("Encara no has pitjat el botó");// Canviam el text
		//de l'etiqueta
		this.add(etiq);//Afegim l'etiqueta creada a la finestra.
		
		Button boton = new Button("Púlsame");//Cream l'objecte del botó.
		//S'anomena boton i és de la classe Button
		boton.setBackground(Color.blue);//Color de fons del botó
		boton.setForeground(Color.white);//Color dels costats del color
		this.add(boton);//Afegeix el botó a la finestra
		
	}
	
	public static void main(String[] args) {

		 VentanaNueva ventana = new VentanaNueva();
		 ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		 // hacemos la ventana visible
		 ventana.setVisible(true);
		 }
	
}
