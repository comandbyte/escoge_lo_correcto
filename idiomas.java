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

import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class idiomas {	//ESTA ES LA CLASE QUE RECIBE LA OPCION QUE ES SELECCIONADA PARA DEVOLVER EL TEXTO QUE TOQUE CON LAS OPCIONES QUE CORRESPONDA
	
	historia_ES es=new historia_ES();
		
	historia_CAT cat=new historia_CAT();
	
	String idioma="";
	
	public idiomas(String abr){
		
		idioma=abr;
				
		if(idioma.equals("CAT")){}else{	
			es.h1();			
		}

		
	}
	
	public void opcion_ES(Object o){
		
		String opt=(String)o;
		
		if(opt.equals("Al bar")){
			es.h2();
		}else if(opt.equals("A la casa de la chica")){
			es.h3();
		}else if(opt.equals("A la playa")){
			es.h4();
		}
		
		if(opt.equals("Un whisky")){
			es.h5();
		}else if(opt.equals("Un café")){
			es.h6();
		}
		
		if(opt.equals("Al blanco")){
			es.h7();
		}else if(opt.equals("Al negro")){
			es.h8();
		}else if(opt.equals("Al anaranjado")){
			es.h9();
		}
		
		if(opt.equals("Compramos algo de comer")){
			es.h10();
		}else if(opt.equals("Nos sentamos en un banco")){
			es.h11();
		}
		
		if(opt.equals("Pides otra copa")){
			es.h12();
		}else if(opt.equals("Te vas del bar")){
			es.h13();
		}
		
		if(opt.equals("Te vas")){
			es.h14();
		}else if(opt.equals("Insultas al dueño")){
			es.h15();
		}
		
		if(opt.equals("Te quejas a la chica")){
			es.h16();
		}else if(opt.equals("Le das un golpe al gato")){
			es.h17();
		}
		
		if(opt.equals("Preguntas a la chica por el ojo del gato")){
			es.h18();
		}else if(opt.equals("Preguntas por el nombre")){
			es.h19();
		}
		
		if(opt.equals("Si, un café")){
			es.h20();
		}else if(opt.equals("Nada")){
			es.h21();
		}
		
		if(opt.equals("Unas patatas fritas")){
			es.h22();
		}else if(opt.equals("Xurros")){
			es.h23();
		}else if(opt.equals("Regalices de colores")){
			es.h24();
		}
		
		if(opt.equals("¿Cuánto tiempo llevas aquí?")){
			es.h25();
		}
		
		if(opt.equals("Despertarla")){
			es.h27();
		}else if(opt.equals("Dejarla e irte")){
			es.h28();
		}
		
		if(opt.equals("Un hombre viejo vestido de blanco")){
			es.h29();
		}else if(opt.equals("Un hombre joven vestido de negro")){
			es.h30();
		}
		
		if(opt.equals("El oscuro y estrecho")){
			es.h31();
		}else if(opt.equals("El ancho y colorido")){
			es.h32();
		}
		
		
		if(opt.equals("Te dejas caer al suelo")){
			es.h33();
		}else if(opt.equals("Continuas con la pelea")){
			es.h34();
		}
		
		if(opt.equals("Sí")){
			es.h35();
		}else if(opt.equals("No")){
			es.h36();
		}
		
		if(opt.equals("Te vas.")){
			es.h37();
		}else if(opt.equals("Te quedas")){
			es.h38();
		}
		
		if(opt.equals("Si")){
			es.h39();
		}else if(opt.equals("No, no...")){
			es.h40();
		}
		
		if(opt.equals("Pues xurros")){
			es.h41();
		}else if(opt.equals("Unas patatas fritas.")){
			es.h42();
		}
		
		if(opt.equals("Sí.")){
			es.h43();
		}else if(opt.equals("No.")){
			es.h44();
		}
		
		if(opt.equals("sí")){
			es.h45();
		}else if(opt.equals("no")){
			es.h46();
		}
		
		if(opt.equals("Hacia el mar")){
			es.h47();
		}else if(opt.equals("Hacia el bosque")){
			es.h48();
		}
		
		if(opt.equals("- ¿Es coña?")){
			es.h49();
		}else if(opt.equals("- Pero si no pareces vieja")){
			es.h50();
		}
		
		
		if(opt.equals("Unas patatas fritas")){
			es.h22();
		}else if(opt.equals("Xurros")){
			es.h23();
		}else if(opt.equals("Regalices de colores")){
			es.h24();
		}
		
		if(opt.equals("¿Cuántos años tienes?")){
			es.h26();
		}
		
		
	}
	
	public boolean finals(){
		if(es.finales()){
			return true;
		}else{
			return false;
		}
	}
	
	public void dar_opcion(){
		
	}
	public String[] opciones(){
		
		if(idioma.equals("CAT")){
			
			return null;
			
		}else{
			
			return es.opciones();
			
		}
		
	}
	
	public JTextArea texto(){
		
		if(idioma.equals("CAT")){
			
			return null;
			
		}else{
			
			return es.historia();
			
		}
		
	}

}
