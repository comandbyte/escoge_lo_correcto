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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

class lamina_juego extends JPanel{
	
	private JLabel texto, espacio, espacio2, titulo, version, version2, creador, creador2, fecha, fecha2, mostrar_idioma;
	
	private JLabel fi=new JLabel(" ");
	
	private JScrollPane barra_scroll;
	
	private JComboBox combo;
	
	private boolean vent2=true;
	private boolean cr=true;
	private boolean li=true;
	private boolean desbloqueado=false;
	private boolean d=false;
	private boolean g=false;
	private boolean s=false;
	private boolean ve=false;
	private boolean empezar=true;

	private ButtonGroup grupo;

	
	private JPasswordField contra;
	private JFrame ds;
	
	private JTextArea historia;
	
	private JPanel h, p,f,l,p2,l_idioma;
		
	private Box cfH2, cajaV0, cfV, cfH1,cfH3,cfH4;
	
	private JButton boton, mas, licencia, contacto, redes;
	
	private idiomas i;
		
	private String[] principal0={"Empezar", "Salir", "Idioma"};
	private String[] principal1={"Empezar", "Salir"};
	
	public lamina_juego(){
		
		setLayout(new mi_layout());
		
		/////////////////////////////////////////////////////////////////////////////////////////// MENU SECUNDARIO
		JPopupMenu emergente=new JPopupMenu();
		JMenuItem r=new JMenuItem("Reiniciar");
		emergente.add(r);
		this.setComponentPopupMenu(emergente);
		r.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){reiniciar();}});
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////// INSTANCIAS DE ETIQUETAS (JLabel)
		texto=new JLabel("Escoge lo correcto");
		titulo=new JLabel("La ciudad sin retorno");
		mostrar_idioma=new JLabel("ES");
		espacio=new JLabel(" "); 	
		espacio2=new JLabel(" ");
		///////////////////////////////////////////
		
		/////////////////////////////////////////// PANEL DONDE IRA EL TEXTO DE LA HISTORIA (JTextArea)
		historia=new JTextArea();
		historia.setOpaque(false);
		historia.setEditable(false);
		////////////////////////////////////////////
		
		//////////////////////////////////////////////// CARACT. DE LOS TITULOS (.setFont())
		texto.setFont(new Font("Verdana", Font.BOLD, 30));
		titulo.setFont(new Font("Courier 10 Pitch", Font.ITALIC, 24));
		////////////////////////////////////////////////
				
		//////////////////////////////////////////////// INSTANCIAS DE LAMINAS (JLabel)
		l=new JPanel();
		p=new JPanel();
		f=new JPanel();
		p2=new JPanel();
		h=new JPanel();
		l_idioma=new JPanel();
		////////////////////////////////////////////////
		
		/////////////////////////////////////////////// SELECTOR DE OPCIONES (JComboBox)
		combo=new JComboBox(principal1); //ARRAY principal1: SOLO LAS OPCION EMPEZAR-SALIR; ARRAY principal0: ES PARA EL MODO ADMIN, OPCIONES EMPEZAR-SALIR-IDIOMAS
		combo.setFocusable(false);
		combo.addActionListener(new evento_combo());
		////////////////////////////////////////////////
		
		//////////////////////////////////////// METODOS PRINCIPALES
		admin();
		creditos();
		boton_continuar();
		///////////////////////////////////////
		
		
																			/**	f.setBackground(Color.GREEN);
																				l.setBackground(Color.YELLOW);
																				p.setBackground(Color.BLUE);
																				p2.setBackground(Color.RED);
																				l_idioma.setBackground(Color.ORANGE);	**/

		
		
		//////////////////////////////////////////////////// 	ESPECIFICAR EL TIPO DE CAJAS (Box)
		cajaV0=Box.createVerticalBox();
		cfV=Box.createVerticalBox();
		cfH2=Box.createHorizontalBox();
		cfH1=Box.createHorizontalBox();
		cfH3=Box.createHorizontalBox();
		cfH4=Box.createHorizontalBox();
		///////////////////////////////////////////////////
		
		//////////////////////////////////////////////////  AGREGAR OBJECTOS A LAS CAJAS
		cajaV0.add(espacio);
		cajaV0.add(texto);
		cajaV0.add(espacio2);
		cajaV0.add(new JLabel(" "));
		cajaV0.add(titulo);
		cfH1.add(new JLabel("  "));
		cfH3.add(new JLabel("  "));
		cfH4.add(new JLabel("  "));
		cfV.add(cfH1);
		cfV.add(cfH3);
		cfV.add(cfH4);
		cfV.add(cfH2);
		cfV.add(combo);
		
		l.add(cajaV0);
		f.add(cfV);
		//////////////////////////////////////////////////
		
		////////////////////////////////////////////////// AGREGAR LAMINAS (EL ORDEN DE AGREGACIÓN ES MUY IMPORTANTE POR EL LAYOUT)
		add(l);
		add(f);
		add(p);			
		add(p2);
		add(l_idioma);
		add(h);	
		/////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////// AÑADIR IMAGEN DEL IDIOMA POR DEFECTO DEL JUEGO (ESPAÑOL)
		URL espanol=lamina_juego.class.getResource("español.png");
		mostrar_idioma.setIcon(new ImageIcon(espanol));
		l_idioma.add(mostrar_idioma);
		/////////////////////////////////////////////////////////////////
			
	}
	
	private class evento_combo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(combo.getSelectedItem()=="Idioma"){
				
				cfH2.removeAll();
				idiomas();
				boton.setEnabled(false);
				
			}else{
				
				cfH2.removeAll();
				f.updateUI();
				boton.setEnabled(true);
				
			}
			
			combo.setFocusable(false);
		}
		
	}
	
	public void creditos(){
		
		Font fuente=new Font("Arial", Font.PLAIN, 12);
		
		/////////////////////////////////////////////////////// CREACION DE CAJAS
		Box cV=Box.createVerticalBox();
		Box cH1=Box.createHorizontalBox();
		Box cH2=Box.createHorizontalBox();
		Box cH3=Box.createHorizontalBox();
		Box espacio=Box.createHorizontalBox();
		/////////////////////////////////////////////////////////	
		
		//////////////////////////////////////////////////////// INSTANCIAS DE LAS ETIQUETAS (JLabel)
		version=new JLabel("Versión: ");
		creador=new JLabel("Creador: ");
		version2=new JLabel("Beta 0.3");
		creador2=new JLabel("Daniel Garcia");
		fecha=new JLabel("Fecha de creación: ");
		fecha2=new JLabel("3/11/2017");
		version2.setFont(fuente);
		creador2.setFont(fuente);
		fecha2.setFont(fuente);
		///////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////// AGREGAS OBJETOS A LAS CAJAS
		cH1.add(version);
		cH1.add(version2);
		cH2.add(creador);
		cH2.add(creador2);
		cH3.add(fecha);		
		cH3.add(fecha2);
		cV.add(cH1);		
		cV.add(cH2);		
		cV.add(cH3);
		//////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////// INSTANCIAS DE LOS BOTONES
		mas=new JButton("Ver más");
		licencia=new JButton("Ver licéncia");
		////////////////////////////////////////////////////
		
		mas.addActionListener(new ActionListener(){  //EVENTO DEL BOTON MAS <CLASE INTERNA ANONIMA>
			public void actionPerformed(ActionEvent e) {	
				if(cr){	
					cr=false;
				//SI LA VARIABLE cr ES =false LA VENTANA QUE EJECUTA EL BOTON MAS NO SE ABRIRA, cr ES =false CUANDO LA VENTANA QUE EJECUTA EL BOTON MAS ESTA ABIERTA, CUANDO LA VENTANA SE CIERRA cr ES =true, ESTO HACE QUE SOLO SE PUEDA ABRIR UNA VEZ LA MISMA VENTANA, POR MUCHO QUE LE DES AL BOTON, HASTA QUE NO SE CIERRE NO LA PODRAS VOLVER A ABRIR
				
				
				
				////////////////////////////////////////////////////////////// CREAR LA VENTANA		
				JFrame ventana1=new JFrame(); 
				int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;
				int alto=Toolkit.getDefaultToolkit().getScreenSize().height;
				ventana1.setBounds(ancho/4, alto/4, ancho/2, alto/2);			
				ventana1.setTitle("Créditos");		
				ventana1.setResizable(false);
				//////////////////////////////////////////////////////////////
	
				ventana1.addWindowListener(new WindowListener(){// EVENTO DE LA VENTANA
					public void windowOpened(WindowEvent e) {}
					public void windowClosing(WindowEvent e) {cr=true;}  //SE EJECUTA CUANDO LA VENTANA SE CIERRA
					public void windowClosed(WindowEvent e) {}
					public void windowIconified(WindowEvent e) {}
					public void windowDeiconified(WindowEvent e) {}
					public void windowActivated(WindowEvent e) {}
					public void windowDeactivated(WindowEvent e) {}	
					});
				
				
				/////////////////////////////////////////////////////////////// ARRAYS DE Box-JLabel
				Box cV2=Box.createVerticalBox();	
				Box cH3=Box.createHorizontalBox();			
				Box cH4=Box.createHorizontalBox();
				Box[] cajas={Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox()};
				JLabel[] labels={new JLabel("CRÉDITOS", JLabel.CENTER), new JLabel("Versión: "), new JLabel("Beta 0.3"), new JLabel("Fecha de creación: "), new JLabel("3/11/2107"), new JLabel("Con la colaboración de: "), new JLabel("Claudia Gil"), new JLabel("Programador: "), new JLabel("Daniel García"), new JLabel("Vía de contacto: "), new JLabel("danielgarciaserrano395@gmail.com"), new JLabel("Historia creada por: "), new JLabel("Claudia Gil")};
				//////////////////////////////////////////////////////////////
				
				//////////////////////////////////////////////////////////////////////////  ALGORITMO PARA AÑADIR CADA JLABEL EN SU BOX (JLabelx2 in Box)
				labels[0].setFont(new Font("Verdana", Font.PLAIN, 30));				
				int contador=1;
				for(int i=0; i<cajas.length; i++){	
					if(i==0){		
						cajas[i].add(labels[i]);		
					}else{				
						int n1=0;
						int n2=2;
						while(n1<n2){
							n1++;							
						//System.out.println(labels[contador].getText());						
						labels[contador].setFont(new Font("Arial", Font.PLAIN, 14));				
						if(contador%2==1){							
							labels[contador].setFont(new Font("Verdana", Font.BOLD, 14));						
						}						
						cajas[i].add(labels[contador]);						
						contador++;						
						}
					}					
					cV2.add(cajas[i]);					
				}
				////////////////////////////////////////////////////////////////////////////////
				
				/////////////////////////////////////////////////////////// INSTANCIAS DE BOTONES
				contacto=new JButton("Vía de contacto");
				redes=new JButton("Redes sociales");
				//////////////////////////////////////////////////////////
				
				/////////////////////////////////////////////////////// EVENTOS PARA LOS BOTONES
				oyente2 oy2=new oyente2();
				contacto.addActionListener(oy2);		
				redes.addActionListener(oy2);
				///////////////////////////////////////////////////////
				
				///////////////////////////////////////////////////// AGREGAR OBJECTOS A LAS CAJAS
				cH3.add(new JLabel(" "));
				cH4.add(contacto);		
				cH4.add(new JLabel("  "));		
				cH4.add(redes);			
				cV2.add(cH3);			
				cV2.add(cH4);
				ventana1.add(cV2);
				/////////////////////////////////////////////////////
				
				ventana1.setVisible(true);
				
				}			
			}		
		});
		
		licencia.addActionListener(new ActionListener(){ //EVENTO DEL BOTON licencia <CLASE INTERNA ANONIMA>

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(li){	// HACE LA MISMA FUNCION QUE LA VARIABLE cr
				li=false;		
				
				//////////////////////////////////////////////////////////////////// CREAR VENTANA
				JFrame ventana1=new JFrame();
				int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;	
				int alto=Toolkit.getDefaultToolkit().getScreenSize().height;	
				ventana1.setBounds(ancho/4, alto/4, ancho/2, alto/2); // 2- 4		
				ventana1.setTitle("Licéncia");			
				ventana1.setResizable(true);				
				ventana1.setVisible(true);
				ventana1.setLayout(new BorderLayout());
				ventana1.add(new JPanel(), BorderLayout.EAST); ventana1.add(new JPanel(), BorderLayout.WEST);
				ventana1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {li=true;}});
				//////////////////////////////////////////////////////////////////////////
				
				//////////////////////////////////////////////////////////////////////////	AGREGAR TEXTO DE LICENCIA
				LICENCIA lic=new LICENCIA();
				JPanel lv1=new JPanel();
				lv1.setLayout(new BorderLayout());
				JTextArea li=lic.license();
				JScrollPane licencia=new JScrollPane(li);
				licencia.setBorder(null);
				lv1.add(licencia, BorderLayout.CENTER);
				ventana1.add(lv1, BorderLayout.CENTER);
				///////////////////////////////////////////////////////////////////////
				
				}
			}
		});
		
		//////////////////////////////////////////////////////////// COLOCAR BOTONES ~mas-licencia~
		cV.add(new JLabel(" "));
		espacio.add(mas);	
		espacio.add(new JLabel("  "));	
		espacio.add(licencia);		
		cV.add(espacio);
		p2.add(cV);
		/////////////////////////////////////////////////////////
		
	}
	
	private class oyente2 implements ActionListener{ //EVENTO LOS BOTONES ~Vía de contacto-Redes sociales~
		
		JFrame ventana2;
		JPanel c;
		
		public void actionPerformed(ActionEvent e) {
			
			if(vent2){ //HACE LA MISMA FUNCION QUE LA VARIABLE cr
			
			///////////////////////////////////////////////////////////////////////// CREAR VENTANA 
			vent2=false;		
			ventana2=new JFrame();		
			ventana2.setResizable(false);							
			ventana2.addWindowListener(new WindowAdapter(){			
			public void windowClosing(WindowEvent e) {vent2=true;}});		
			int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;		
			int alto=Toolkit.getDefaultToolkit().getScreenSize().height;		
			ventana2.setBounds(ancho/4, alto/4, ancho/2, alto/2);
			
			c=new JPanel();		
			c.setBackground(Color.WHITE);		
			ventana2.add(c);
			
			ventana2.setVisible(true);
			/////////////////////////////////////////////////////////////////////////
			
			}
			
			
			if(e.getActionCommand().equals("Vía de contacto")){ // ACCION QUE HACE SI SE PULSA EN BOTON ~Vía de contacto~
				
			c.removeAll();		
			ventana2.setTitle("Vía de contacto");
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////// CAJAS Y ETIQUETAS CON LA INFORMACIÓN
			Box cV3=Box.createVerticalBox();			
			Box[] cajas={Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox()};
			JLabel[] contacto={new JLabel("Vía de contacto"), new JLabel("Claudia Gil: "), new JLabel("cgilribas@gmail.com"), new JLabel("Daniel García: "), new JLabel("danielgarciaserrano395@gmail.com")};
			////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			//////////////////////////////////////////////////////////////// ALGORITMO QUE PONE CADA ETIQUETA EN SU CAJA Y CON SU FUENTE
			int contador=1;
			for(int i=0; i<cajas.length; i++){			
				if(i==0){				
					contacto[i].setFont(new Font("Verdana", Font.BOLD, 30));				
					cajas[i].add(contacto[i]);				
				}else{				
					int n1=0;				
					int n2=2;				
					cV3.add(new JLabel(" "));				
					while(n1<n2){					
						n1++;					
					//System.out.println(labels[contador].getText());					
						contacto[contador].setFont(new Font("Arial", Font.PLAIN, 14));					
					if(contador%2==1){					
						contacto[contador].setFont(new Font("Verdana", Font.BOLD, 14));					
					}				
					cajas[i].add(contacto[contador]);				
					contador++;				
					}				
				}			
				cV3.add(cajas[i]);			
			}
			////////////////////////////////////////////////////////////////////
			
			c.add(cV3);
			c.updateUI();
			
			
			}else if(e.getActionCommand().equals("Redes sociales")){ //ACCION QUE EJECUTA CUANDO SE PULSA EL BOTON ~Redes sociales~
				
				c.removeAll();
				ventana2.setTitle("Redes sociales");
				
				//////////////////////////////////////////////////////////////////// CAJAS Y ETIQUETAS CON LA INFORMACIÓN
				Box cV3=Box.createVerticalBox();
				Box cajas=Box.createHorizontalBox();
				Box[] cajas1={Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox()};
				Box[] cajas2={Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox()};;
				Box[] cajas3={Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox(), Box.createHorizontalBox()};;
				
				JLabel[] instagram={new JLabel("Instagram"), new JLabel("Santi Cáceres: "), new JLabel("@santituka2003"), new JLabel("Claudia Gil: "), new JLabel("@claudiagil_24"), new JLabel("Daniel García: "), new JLabel("@daniieelgs")};
				JLabel[] twitter={new JLabel("Twitter"), new JLabel("Santi Cáceres: "), new JLabel("Santiag07960493"), new JLabel("Daniel García: "), new JLabel("@Daniieelgs"), new JLabel(""), new JLabel("")};
				JLabel[] facebook={new JLabel("Facebook"), new JLabel("Santi Cáceres: "), new JLabel("Santi Caceres Dominguez"), new JLabel("Daniel García: "), new JLabel("Daniel Garcia"), new JLabel(""), new JLabel("")};
				JLabel sociales=new JLabel("Redes sociales");
				////////////////////////////////////////////////////////////////////
				
				sociales.setFont(new Font("Verdana", Font.BOLD, 30));			
				cajas.add(sociales);		
				cV3.add(cajas);		
				cV3.add(new JLabel(" "));
				
				////////////////////////////////////////////////////////////////////// ALGORITMO QUE PONE CADA ETIQUETA EN SU JLABEL Y CON SU FUENTE
				int contador=1;			
				for(int i=0; i<cajas1.length; i++){			//INSTAGRAM	
					if(i==0){					
						instagram[i].setFont(new Font("Arial", Font.BOLD, 20));					
						cajas1[i].add(instagram[i]);					
					}else{					
						int n1=0;					
						int n2=2;					
						while(n1<n2){					
							n1++;				
						//System.out.println(labels[contador].getText());		
							instagram[contador].setFont(new Font("Arial", Font.PLAIN, 14));		
						if(contador%2==1){
							instagram[contador].setFont(new Font("Verdana", Font.BOLD, 14));
						}
						cajas1[i].add(instagram[contador]);
						contador++;
						}
					}
					cV3.add(cajas1[i]);
				}
				
				cV3.add(new JLabel(" "));
		
				contador=1;
				for(int i=0; i<cajas2.length; i++){		//TWITTER
					if(i==0){
						twitter[i].setFont(new Font("Arial", Font.BOLD, 20));
						cajas2[i].add(twitter[i]);
					}else{
						int n1=0;
						int n2=2;
						while(n1<n2){
							n1++;
						//System.out.println(labels[contador].getText());
							twitter[contador].setFont(new Font("Arial", Font.PLAIN, 14));
						if(contador%2==1){
							twitter[contador].setFont(new Font("Verdana", Font.BOLD, 14));
						}
						cajas2[i].add(twitter[contador]);
						contador++;
						}
					}
					cV3.add(cajas2[i]);
				}
				
				cV3.add(new JLabel(" "));
				
				contador=1;		
				for(int i=0; i<cajas3.length; i++){		//FACEBOOK
					if(i==0){
						facebook[i].setFont(new Font("Arial", Font.BOLD, 20));
						cajas3[i].add(facebook[i]);
					}else{
						int n1=0;
						int n2=2;
						while(n1<n2){
							n1++;
						//System.out.println(labels[contador].getText());
							facebook[contador].setFont(new Font("Arial", Font.PLAIN, 14));
						if(contador%2==1){
							facebook[contador].setFont(new Font("Verdana", Font.BOLD, 14));
						}
						cajas3[i].add(facebook[contador]);
						contador++;
						}
					}
					cV3.add(cajas3[i]);
				}
				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				c.add(cV3);				
				c.updateUI();
				
			}			
		}
	}
	
	public void boton_continuar(){		//METODO QUE SE ENCARGA DEL BOTON CONTINUAR
		
		action cont=new action("Continuar");	
		boton=new JButton(cont);
		boton.setFocusable(true);	
		////////////////////////////////////////////// LA TECLA ENTER HACE LA ACCION DE EL BOTON ~Continuar~
		InputMap m1=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);		
		m1.put(KeyStroke.getKeyStroke("ENTER"), "cont");			
		ActionMap m2=getActionMap();		
		m2.put("cont", cont);
		/////////////////////////////////////////////
		p.add(boton);
	
	}
	
	public void empezar(){ //METODO QUE SE ENCARGA DE QUE EL JUEGO COMIENZE
		
		i=new idiomas(mostrar_idioma.getText());
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(this, "Esta es una versión beta, es probable que se encuentre con algún error, entienda que esta aplicación se encuentra en desarollo", "Atención", JOptionPane.WARNING_MESSAGE);
		titulo.setText(" ");
		texto.setText(" ");
		siguiente();
		
	}
	
	public void idiomas(){ // METODO PRINCIPAL QUE SE ENCARGA DE CARGAR LOS BOTONES DE IDIOMAS 
		
		grupo=new ButtonGroup();
		
		URL espanol=lamina_juego.class.getResource("español.png");
		URL catalan=lamina_juego.class.getResource("catalan.png");
		
		boton_idioma("Español", new ImageIcon(espanol), true, "ES");
		boton_idioma("Catalá", new ImageIcon(catalan), false, "CAT");
		
	}
	
	public void boton_idioma(String name, Icon icono, boolean seleccionado, String abrebiacion){ // METODO SECUNDARIO QUE SE ENCARGA DE CARGAR LOS BOTONES DE IDIOMAS 
		
		idioma_action ia=new idioma_action(name, icono, abrebiacion);
		
		JRadioButton boton_idioma=new JRadioButton(ia);
		
		boton_idioma.setSelected(seleccionado);
		
		grupo.add(boton_idioma);
		
		cfH2.add(boton_idioma);
		
		f.updateUI();
	}
	
	private class idioma_action extends AbstractAction{		//EVENTO DE LOS IDIOMAS
		
		public idioma_action(String nombre, Icon icono, String abrebiacion){
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue("abr", abrebiacion);
		}

		public void actionPerformed(ActionEvent e) { //EN DESAROLLO
			// TODO Auto-generated method stub
			if(getValue("abr")=="CAT"){
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "La versión en este idioma se encuentra en desarollo", "Idioma no disponible", 0);
				cfH2.removeAll();
				idiomas();
				//mostrar_idioma.setText((String)getValue("abr"));
				//mostrar_idioma.setIcon((Icon)getValue(Action.SMALL_ICON));
			}else{
			mostrar_idioma.setText((String)getValue("abr"));
			mostrar_idioma.setIcon((Icon)getValue(Action.SMALL_ICON));
			}
		}
		
	}
	
	
	private class action extends AbstractAction{
		
		public action(String nombre){		
			putValue(Action.NAME, nombre);		
		}
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
						
			if(ve){ //LA VARIALE ve ES =true CUANDO SE PULSA EL BOTON ~Volver a empezar~ O ~Reiniciar~
				reiniciar(); 
			}
			
			
			if(empezar){
				
				if(combo.getSelectedItem()=="Empezar"){ //SE EJECUTA CUANDO SE PULSA EL BOTON CONTINUAR CON LA OPCION ~Empezar~ EN EL JComboBox
					
				empezar();		
				empezar=false;
				
				}else if(combo.getSelectedItem()=="Salir"){	//SE EJECUTA CUANDO SE PULSA EL BOTON CONTINUAR CON LA OPCION ~Salir~ EN EL JComboBox
					
					Toolkit.getDefaultToolkit().beep();
					
					int opcion_exit=JOptionPane.showConfirmDialog(null, "Está seguro de que quiere salir?", "Salir", JOptionPane.YES_NO_OPTION);
					
					if(opcion_exit==0){
					
						System.exit(0);
						
					}
					
				}
				
				
				}else{	
				
					if(mostrar_idioma.equals("CAT")){/*DESAROLLO*/}else{	// AQUÍ SE ENCARGAR DE DAR LA OPCION SELECCIONADA EN EL METODO DEL IDIOMA SELECCIONAD A LA CLASE IDIOMAS, DONDE SE ENCARGARA DE DEVOLVER EL TEXTO QUE TOQUE RESPECTO A LA OPCION
						
						i.opcion_ES(combo.getSelectedItem());
						siguiente();
					}

			}
		}
	}
	
	public void siguiente(){ //METODO QUE SE ENCARGA DE CARGAR LAS OPCIONES Y EL TEXTO
		
		int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;	
		int alto=Toolkit.getDefaultToolkit().getScreenSize().height;
		
		
		
		
		JTextArea historia=new JTextArea();	
		historia.setEditable(true);
		historia.setText("");
		historia=i.texto(); //AQUÍ CARGA EL TEXTO
		historia.setOpaque(false);			
		historia.setEditable(false);	
		barra_scroll=new JScrollPane(historia);	
		barra_scroll.setBorder(null);	
		barra_scroll.setVisible(true);  		
		
		//////////////////////////////////////////// ESTA PARTE SE ENCARGA DEL TEMA DE QUE SE VEA TODO BIEN Y SIN PROBLEMAS
		h.setOpaque(true); 
		h.removeAll();
		l.setVisible(false);  
		h.setLayout(new BorderLayout());
		h.add(barra_scroll, BorderLayout.CENTER);
		historia.setFont(new Font("Verdana", Font.BOLD, 14));
		h.updateUI();		
		f.removeAll();
		/////////////////////////////////////////////////
		
		combo=new JComboBox(i.opciones()); //AQUÍ CARGA LAS OPCIONES
		combo.addActionListener(new perder_foco());
		
		if(i.finals()){ //SI EL JUEGO SE ACABA
		fi.setText(i.opciones()[0]);
		add_final();
		ve=true;
		}else{ //SI EL JUEGO SIGUE
		f.add(combo);
		}
		
		f.updateUI();
		
	}
	
	private class perder_foco implements ActionListener{public void actionPerformed(ActionEvent e) {combo.setFocusable(false);}}
	
	public void admin(){ //METODO PRINCIPAL QUE CARGA EL MODO ADMINISTRADOR
		
		/////////////////////////////////////////////////////// ATAJOS DE TECLADO
		action_admin d=new action_admin("d");
		action_admin g=new action_admin("g");
		action_admin s=new action_admin("s");
		action_admin l=new action_admin("l");
		action_admin a=new action_admin("a");
		
		InputMap m1=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		m1.put(KeyStroke.getKeyStroke("ctrl L"), "l");
		m1.put(KeyStroke.getKeyStroke("ctrl D"), "d");
		m1.put(KeyStroke.getKeyStroke("ctrl G"), "g");
		m1.put(KeyStroke.getKeyStroke("ctrl S"), "s");
		m1.put(KeyStroke.getKeyStroke("ctrl A"), "a");
				
		ActionMap m2=getActionMap();
		
		m2.put("l", l);
		m2.put("d", d);
		m2.put("g", g);
		m2.put("s", s);
		m2.put("a", a);
		//////////////////////////////////////////////////
	}
	
	private class action_admin extends AbstractAction{
		
		public action_admin(String letra){
			putValue("l", letra);
		}

		public void actionPerformed(ActionEvent e) { //PARA ACTIVAR EL MODO ADMINISTRADO CTRL + L + CTRL + D + CTRL + G + CTRL + G + CTRL + S - EN EL CASO QUE SE HAGA EN OTRO ORDEN SE RESETEARA EL ALGORITMO
			////////////////////////////// ALGORITMO
			if(getValue("l")=="l"){
				desbloqueado=true;
				g=false;
				s=false;
				d=false;
			}
			
			if(desbloqueado==true&&getValue("l")=="d"){
				desbloqueado=false;
				g=false;
				s=false;
				d=true;
			}
			
			if(d==true&&getValue("l")=="g"){
				desbloqueado=false;
				d=false;
				s=false;
				g=true;
			}
			
			if(g==true&&getValue("l")=="s"){
				desbloqueado=false;
				d=false;
				g=false;
				s=true;
			}
			
			if(s==true&&getValue("l")=="a"){
				f.removeAll();
				cfV.removeAll();
				combo=new JComboBox(principal1);
				cfV.add(combo);
				cfV.add(cfH2);
				cfH2.removeAll();
				f.add(cfV);
				f.updateUI();
				combo.setFocusable(false);
				JOptionPane.showMessageDialog(null, "Has salido del modo Desarollador", "Exit", 1);
				desbloqueado=false;
				d=false;
				g=false;
				s=false;
				combo.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(combo.getSelectedItem()=="Idioma"){
							idiomas();
						}
						combo.setFocusable(false);
					}
					
				});
			}
			////////////////////////////////////////////////////////////////////////////////////////////////
			
			if(s==true){		// SI EL ATAJO DE TECLADO SE HA REALIZADO CORRECTAMENTE EJECUTARA ESTA CONDICIONAL USUARIO=LDGS (en mayuscula)
				String user=null;
				user=JOptionPane.showInputDialog(null, "Introduzca el nombre de usuario", "Desarollador", 2);
				if(user==null){ //SI EL NOMBRE DE USUARIO NO ES CORRECTO SE RESETEARA EL ALGORITMO - ESTE IF TAMBIEN HEVITA UNA EXCEPCION
					desbloqueado=false;
					d=false;
					g=false;
					s=false;
				}else{	
				if(user.equals("LDGS")){
					desbloqueado=false;
					d=false;
					g=false;
					
					contra=new JPasswordField(10);
					
					///////////////////////////////////////////////////////////////////// VENTANA DE CONTRASEÑA =99031602
					ds=new JFrame();
					int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;
					int alto=Toolkit.getDefaultToolkit().getScreenSize().height;	
					ds.setBounds(ancho/4, alto/4, ancho/6, alto/6); // 6 - 6
					ds.setResizable(false);
					JPanel ad2=new JPanel();
					ad2.add(contra);
					add(ad2, BorderLayout.CENTER);
					ds.add(ad2);
					ds.setVisible(true);
					ds.addWindowListener(new WindowAdapter(){
						public void windowClosing(WindowEvent e) {
							desbloqueado=false;
							d=false;
							g=false;
							s=false;
						}
					});
					////////////////////////////////////////////////////////////////////
					
					//////////////////////////////////////////////////////////////// ATAJO DE TECLADO
					administrador e0=new administrador("e");
					InputMap m1=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
					m1.put(KeyStroke.getKeyStroke("ctrl E"), "e");				
					ActionMap m2=getActionMap();			
					m2.put("e", e0);
					////////////////////////////////////////////////////////////////	
					
				}else{ //SI EL NOMBRE DE USUARIO NO ES CORRECTO SE RESETEARA EL ALGORITMO
					desbloqueado=false;
					d=false;
					g=false;
					s=false;
				}
			}
		}
			
	}
		
		private class administrador extends AbstractAction{
			public administrador(String letra0){
				putValue("le", letra0);
			}
			public void actionPerformed(ActionEvent e) {
				
				if(getValue("le")=="e"){
					///////////////////////////////// COMPRUEBA LA CONTRASEÑA
						String c1="99031602";
						String c2="";
						char[] p0=contra.getPassword();
						for(int i=0; i<p0.length; i++){
							c2=c2 + p0[i];
						}
					////////////////////////////////////
						if(c1.equals(c2)){
							
							JOptionPane.showMessageDialog(null, "Bienvenido", "Desarollador", 1);
							f.removeAll();
							cfV.removeAll();
							combo=new JComboBox(principal0);
							cfV.add(combo);
							cfV.add(cfH2);
							f.add(cfV);
							f.updateUI();
							combo.addActionListener(new evento_combo());
						} 
						ds.dispose();
						//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				}	
			}
			
		}
		
	}
	
	public void add_final(){ //METODO QUE SE EJECUTA CUANDO EL JUEGO SE ACABA 
		fi.setFont(new Font("Verdana", Font.BOLD,20));
		fi.setForeground(Color.RED.darker());
		f.add(fi);
		boton.setText("Volver a empezar");
		if(ve){
			f.removeAll();
			combo=new JComboBox(principal1);
			f.add(combo);
			boton.setText("Continuar");
		}
	}
	
	public void reiniciar(){ //METODO QUE SE ENCARGA DE REINICIAR EL JUEGO	
		juego_historia.cerrar_ventana();
		ve=false;
	}
}
