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

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

class mi_layout implements LayoutManager{
	public void addLayoutComponent(String name, Component comp) {}
	public void removeLayoutComponent(Component comp) {}
	public Dimension preferredLayoutSize(Container parent) {return null;}
	public Dimension minimumLayoutSize(Container parent) {return null;}

	public void layoutContainer(Container c) { //SE ENCARGAR DEL LAYOUT-DISPOSICION DEL JUEGO ENTERO
		Component c1=c.getComponent(0);
		Component c2=c.getComponent(1);
		Component c3=c.getComponent(2);
		Component c4=c.getComponent(3);
		Component c5=c.getComponent(5);
		Component c6=c.getComponent(4);
		
		c1.setBounds(c.getWidth()/4,0,c.getWidth()/2,c.getHeight()/3);
		c2.setBounds(c.getWidth()/4, c.getHeight()/3, c.getWidth()/2, c.getHeight()/4);
		c3.setBounds(c.getWidth()/2+c.getWidth()/4, c.getHeight()/2+c.getHeight()/3+c.getHeight()/20, c.getWidth()/4, c.getHeight()/10);
		c4.setBounds(0, c.getHeight()/2+c.getHeight()/3, c.getWidth()/4, c.getHeight()/4);
		int a=c.HEIGHT-(c.HEIGHT-30);
		c5.setBounds(c.getWidth()/4,a,c.getWidth()/2,c.getHeight()/4);
		c6.setBounds(0,0, c.getWidth()/25, c.getHeight()/30);
		
	}
	
}
