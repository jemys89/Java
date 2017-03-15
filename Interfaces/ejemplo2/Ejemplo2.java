package org.foobarspam.ejemplo2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ejemplo2 extends JPanel {
 JButton boton1 = new JButton( "JButton 1" );
 JButton boton2 = new JButton( "JButton 2" );
 JTextField texto = new JTextField( 20 );
 public Ejemplo2() {
 ActionListener al = new ActionListener() {
 public void actionPerformed( ActionEvent evt ) {
 String nombre = ( (JButton)evt.getSource()).getText();
 texto.setText( nombre+" Pulsado" );
 }
 };
 boton1.addActionListener( al );
 boton1.setToolTipText( "Soy el JBoton 1" );
 add( boton1 );
 boton2.addActionListener( al );
 boton2.setToolTipText( "Soy el JBoton 2" );
 add( boton2 );
 texto.setToolTipText( "Soy el JCampoDeTexto" );
 add( texto );
 }
 
 public static void main( String args[] ) {
	 JFrame ventana = new JFrame( "Tutorial de Java, Swing" );
	 ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );
	 ventana.getContentPane().add( new Ejemplo2(),BorderLayout.CENTER );
	 ventana.setSize( 300,100 );
	 ventana.setVisible( true );
	 }
	 }
