/**
 
 License MIT

Copyright (c) 2017 Daniel Garcia Serrano

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/


package juego_historia;
import javax.swing.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class juego_historia {

	/**
	 * @param args
	 */
	static marco_juego c;
	public static void main(String[] args) {
		abrir_ventana();
	}
	
	public static void abrir_ventana(){ //SE ENCARGA DE EJECUTAR LA VENTANA
		
		c=new marco_juego();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		c.setVisible(true);
	}
	
	public static void cerrar_ventana(){ //SE ENCARGAR DE CERRAR LA VENTANA Y ABRIR UNA NUEVA, ESTE METODO SE EJCUTA CUANDO SE QUIERE REINICIAR EL JUEGO
		c.dispose();
		abrir_ventana();
	}
}



