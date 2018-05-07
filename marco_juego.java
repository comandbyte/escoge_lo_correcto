/**
 
 Licencia MIT

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

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;

class marco_juego extends JFrame{
	
	public marco_juego(){
		
		int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;
		int alto=Toolkit.getDefaultToolkit().getScreenSize().height;	
		setBounds(ancho/4, alto/4, ancho/2, alto/2);	
		setExtendedState(JFrame.MAXIMIZED_BOTH); 	
		setTitle("ESCOGE LO CORRECTO (La ciudad sin retorno) <V: Beta>");	
		URL ruta_icono=marco_juego.class.getResource("icono.png");	
		Image Icono=Toolkit.getDefaultToolkit().getImage(ruta_icono);	
		setIconImage(Icono);	
		add(new lamina_juego());
		
	}
}