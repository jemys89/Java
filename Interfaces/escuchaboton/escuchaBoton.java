package org.foobarspam.escuchaboton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EscuchaBoton implements ActionListener {
	Label etiqueta; // etiqueta que semodificará

	public EscuchaBoton(Label eti) {
		this.etiqueta = eti;
 }
	public void actionPerformed(ActionEvent e)
	{ //Aquest mètode diu el que s'ha de fer en
	//produir-se l'event

	this.etiqueta.setText("A la fi has pitjat");
	 }
}

