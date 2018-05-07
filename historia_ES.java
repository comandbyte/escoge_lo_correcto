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

public class historia_ES {	// ESTA ES LA CLASE DONDE ESTAN TODOS LOS TEXTOS CON SUS OPCIONES DISPONIBLES, DONDE EN LA VARIABLE ~h~ SE CARGAR EL TEXTO QUE APARECERÁ EN PANTALLA Y EN EL ARRAY ~o~ LAS OPCIONES QUE APARECERAN
	
	JTextArea h=new JTextArea("");
	
	String[] o=new String[0];
	
	boolean f=false;
	
	public historia_ES(){
		
	}
		
	public void h1(){
		h=new JTextArea("Acabas de llegar a la estación de Luminopolis. Miras el horario" + "\n" + "del tren, pero no hay ningúno que te devuelva a casa." + "\n" +  "Le preguntas a una chica y esta te dice que hasta mañana no habrán." + "\n" + "Pues vaya!" + "\n" + "La chica te recomienda ir algún lugar");		
		o=new String[3];
		o[0]="Al bar";
		o[1]="A la casa de la chica";
		o[2]="A la playa";

		
	}
	
	public void h2(){	
		h=new JTextArea("Los dos vais al bar más cercano. Ella pide una cerveza," + "\n" + "tu pides...");
		o=new String[2];		
		o[0]="Un whisky";
		o[1]="Un café";
	}
	
	public void h3(){
		h=new JTextArea("Llegais a su casa y ves que tiene tres gatos preciosos" + "\n" + "Decides acariciar...");
		o=new String[3];
		o[0]="Al blanco";
		o[1]="Al negro";
		o[2]="Al anaranjado";
	}
	
	public void h4(){
		h=new JTextArea("La playa es preciosa. Su arena es dorada y el mar brilla." + "\n" + "La chica te pregunta que hacer");
		o=new String[2];
		o[0]="Compramos algo de comer";
		o[1]="Nos sentamos en un banco";
	}
	
	public void h5(){
		h=new JTextArea("Solo un sorbo y ya notas como el alcohol te está matando" + "\n" + "Normal, solo tienes 15 años." + "\n" + "Consigues acabarte el whisky y entonces...");
		o=new String[2];
		o[0]="Pides otra copa";
		o[1]="Te vas del bar";
	}

	public void h6(){
		h=new JTextArea("Es una buena elcción, no quieres volver con resaca." + "\n" + "El dueño del bar te mira extraño" + "\n" + "- ¿Eres nuevo?" + "\n" + "- Sí - contestas - Aunque no me  quedaré mucho tiempo, tengo planes..." + "\n" + "- ¿Planes? - te pregunta un cliente - Aquí no tenemos planes." + "\n" + "Todo el bar se llena de murmuras" + "\n" + "Te molestas y ...");
		o=new String[2];
		o[0]="Te vas";
		o[1]="Insultas al dueño";
	}

	public void h7(){
	h=new JTextArea("Este te muerde" + "\n" + "Te enfada y...");
	o=new String[2];
	o[0]="Te quejas a la chica";
	o[1]="Le das un golpe al gato";
	}
	
	public void h8(){
		h=new JTextArea("Es un gato muy extraño. Le falta un ojo y en su collar" + "\n" +  "pone el nombre 'Venenoso'");
		o=new String[2];
		o[0]="Preguntas a la chica por el ojo del gato";
		o[1]="Preguntas por el nombre";
	}
	
	public void h9(){
		h.setText("");
		h=new JTextArea("Justo antes de comenzar a acariciarlo la chica te llama" + "\n" + "- ¿Quieres algo de beber");
		o=new String[2];
		o[0]="Si, un café";
		o[1]="Nada";
	}

	public void h10(){
	h=new JTextArea("Te acercas a una tiendecita de comida rápida" + "\n" + "Elijes comprar...");
	o=new String[3];
	o[0]="Unas patatas fritas";
	o[1]="Xurros";
	o[2]="Regalices de colores";
}

	public void h11(){
	h=new JTextArea("La chica saca de su bolso una cerveza y comienza a" + "\n" + "beber. Entre sorbos pregunta" + "- ¿Cómo te llamas?" + "\n" + "- Miguel... Y tú - le contestas" + "\n" + "- Ácido" + "\n" + "Te pica la curiosidad y le preguntas...");
	o=new String[2];
	o[0]="¿Cuánto tiempo llevas aquí?";
	o[1]="¿Cuántos años tienes?";
}
	
	public void h12(){
		h=new JTextArea("No puedes más, el alcohol es tan fuerte que acabas dormido." + "\n" +"Cuando te vuelbes a despertar estas en la calle"  + "\n" + "al lado de la chica, dormida y borracha" + "\n" + "Decides...");
		o=new String[2];
		o[0]="Despertarla";
		o[1]="Dejarla e irte";
	}
	
public void h13(){
	h=new JTextArea("Vas dando vueltas por la ciudad hasta que te pierdes." + "\n" + "Quieres encontrar a la chica así que decides preguntarselo a...");
	o=new String[2];
	o[0]="Un hombre viejo vestido de blanco";
	o[1]="Un hombre joven vestido de negro";
	}

public void h14(){
	h=new JTextArea("Al principio te quieres ir con la chica pero está" + "\n" + "ocupada bebiendo la quinta cerveza" + "\n" + "Cuando sales hay dos caminos" + "\n" + "Vas por...");
	o=new String[2];
	o[0]="El oscuro y estrecho";
	o[1]="El ancho y colorido";
}

public void h15(){
	h=new JTextArea("- ¡Vaya imbécil!" + "\n" + "- Cuidadito con lo que dices chico... - te susurra un cliente" + "\n" + "Notas que te dan con una botella de vidrio en la cabeza" + "\n" + "Entonces...");
	o=new String[2];
	o[0]="Te dejas caer al suelo";
	o[1]="Continuas con la pelea";
}

public void h16(){
	h=new JTextArea("- ¡Será maldito tu gato!" + "\n" + "- Pues es uno de los menos violentos... - te contesta - ¿Vino?");
	o=new String[2];
	o[0]="Sí";
	o[1]="No";
}

public void h17(){
	h.setText("");
	h=new JTextArea("Entonces el gato se convierte en una chica con el pelo muy largo y blanco" + "\n" + "- ¡¿De que vas?! - te amenaza mientras saca un cuchillo.- Será" + "\n" + "mejor que te vayas");
	o=new String[2];
	o[0]="Te vas.";
	o[1]="Te quedas";
}

public void h18(){
	h=new JTextArea("- Se lo quitaron por meterse con quien no debía. -te contesta" + "\n" + "- Pero si solo es un gato..." + "\n" + "- ¿Insinuas que no puede matar a una persona?");
	o=new String[2];
	o[0]="Si";
	o[1]="No, no...";
}

public void h19(){
	h=new JTextArea("- Bueno, cuando me lo encontré quería matar a unas" + "\n" + "personas con xurros envenenados... -te responde- ¿Algo" + "\n" + "de comer?");
	o=new String[2];
	o[0]="Pues xurros";
	o[1]="Unas patatas fritas.";
}

public void h20(){
	h=new JTextArea("Con cada sorbo que das al café te sientes más y más cansado." + "\n" + "Cuando te lo acabas, todo comienza a dar vueltas hasta que te caes del sueño." + "\n" + "Te despiertas en una jaula con los pies y manos atados." + "\n" + "La chica al otro lado te mira contenta" + "\n" + "- Como sentía que me molestarías te vendí a los esclavistas." + "\n" + "- te dice con una gran sonrisa. - Ah, por cierto, no " + "\n" + "quiero que nos separemos sin que sepas mi nombre." + "\n" + "Me llamo Ácido y tú Miguel, no?" + "\n" + "Asientes");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h21(){
	h=new JTextArea("- Que maleducado... -te dice la chica- Je je, me gustas" + "\n" + "chico. ¿Como te llamas" + "\n" + "- Miguel, ¿y tú?" + "\n" + "- Ácido -contesta mientras va a coger una botella de vino- ¿Te" + "\n" + "gustaría trabajar para mi?");
	o=new String[2];
	o[0]="Sí.";
	o[1]="No.";
}

public void h22(){
	h=new JTextArea("Vas a un banco con una bolsa de patatas" + "\n" + "- Yo no quiero, grácias - te dice la chica" + "\n" + "Comienzas a comer. Notas una sensación extraña en el cuerpo." + "\n" + "Entonces delante tuyo aparece un hombre muy mayor." + "\n" + "No puede ser, no es real. Todo se llena de colores" + "\n" + "y sientes que te hierve la sangre. Entonces el hombre comienza a susurrar." + "\n" + "- venga ven... No tengas miedo... Es la única forma..." + "\n" + "- Es la única forma - susurras tú también." + "\n" + "Sigues al hombre hasta el mar donde te ahogas hasta la muerte." + "\n" + "Esas patatas tenían droga alucinógena");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h23(){
	h=new JTextArea("La respiración te flojea y el ambiente se enfría." + "\n" + "Te sientes cansado y te dan ganas de vomitar." + "\n" + "Caes al suelo y mueres lentamente mientras la chica" + "\n" + "te sonria mientras susurra:" + "\n" + "- No haberte bajado en Luminopolis." + "\n" + "Los xurros estaban envenenados");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h24(){
	h=new JTextArea("Te sientas al lado de la chica en un banco. Esta coje" + "\n" + "un manojo de regalices." + "\n" + "- ¿Y de beber no has traido nada? - te pregunta." + "\n" + "- Noo..." + "\n" + "La chica saca una botella de whisky." + "\n" + "- ¿Quieres?");
	o=new String[2];
	o[0]="sí";
	o[1]="no";
}

public void h25(){
	h=new JTextArea("- Unos..¿210? Creo." + "\n" + "- ¡Estás de broma? - Le preguntas." + "\n" + "- No" + "\n" + "Te asustas y huyes. Puedes ir a dos direcciones");
	o=new String[2];
	o[0]="Hacia el mar";
	o[1]="Hacia el bosque";
}

public void h26(){
	h=new JTextArea("- Anda que eres maleducado... Pues 228 cumplidos" + "\n" + "- ¿Dirás 28?" + "\n" + "- No, 228.");
	o=new String[2];
	o[0]="- ¿Es coña?";
	o[1]="- Pero si no pareces vieja";
}

public void h27(){
	h=new JTextArea("La chica se levanta y te mira por encima del hombro." + "\n" + "- ¿Por que me has despertado? - te pregunta." + "\n" + "- Quiero salir de aquí." + "\n" + "La chica te mira unos segundos y por primera vez sonríe." + "\n" + "- Sígueme." + "\n" + "Llegais a la estación de tren del principio. Entonces la chica suspira y dice." + "\n" + "- Mira, me caes bien. Eres un chico especial" + "\n" + "que no se como ha llegado aquí. Esta ciudad está maldita, nadie crece" + "\n" + "ni envejece porque no sirve de nada. Nadie tiene" + "\n" + "sueños, nadie lucha por nadie, nadie quiere avanzar." + "\n" + "No te mereces esto. Te dejaré ir, per me tienes que prometer" + "\n" + "que te apartaras de esas vías del tren" + "\n" + "Asientes" + "\n" + "De golpe estás en medio de unas vías del tren." + "\n" + "A lo lejos notas un pitido y el suelo comienza a temblar." + "\n" + "Corres y te apartas antes de que el tren pase." + "\n" + "Miras al suelo y lloras. ¿Que hibas a hacer?");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h28(){
	h=new JTextArea("Te levantas y vas hacia la estación de tren." + "\n" + "Entonces ves que se hacerca un tren por la vía. No sabes porque" + "\n" + "pero quieres hacercarte a este. Miras las vías, la estación" + "\n" + "y la ciudad de fondo. Y con unos simples pasos te acercas al final de la historia" + "\n" + "Has sido atropellado por un tren");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h29(){
	h=new JTextArea("- ¿Sabes donde esta una chica de pelo rubio, flequillo" + "\n" + "que lleva un jersey blanco? - Le preguntas." + "\n" + "- ¿Te refieres a Àcido? Todo el mundo la conoce." + "\n" + "Te idre donde esta" + "\n" + "Le sigues hasta un callejosn oscuro. El viejo te sonrie" + "\n" + "y te apuñala en la nuca" + "\n" + "Te mueres instantaneamente." + "\n" + "Has sido saqueado.");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h30(){
	h=new JTextArea("- Oye, sabes donde podría estar una chica rubia con" + "\n" + "un gorro de lana - Le preguntas." + "\n" + "- Dices Àcido ¿no? - Te contesta - Yo puedo llevarte" + "\n" + "con ella. Sigueme." + "\n" + "Le sigues hasta un mercado muy extraño." + "\n" + "Las tiendecitas están llenas de objetos de todos los colores."  + "\n" + "El chico te mira con un gran sonrisa, y entonces" + "\n" + "te da un golpe en la barriga." + "\n" + "- ¿De que vas!!? - Le gritas" + "\n" + "- ¿Aquí no queremos amigos de Àcido! - te chilla mientras" + "\n" + "comienza a patearte en el suelo");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h31(){
	h=new JTextArea("Cada paso que das te suentes más cansadio." + "\n" + "De las paredes comienzan a salir unos tipos de fantasmas." + "\n" + "Te frotas los ojos ya que no te lo llegas a creer." + "\n" + "Los espiritus te van rodeando hasta" + "\n" + "que no llegas a ver nada. Notas yna sensción" + "\n" + "fría en tu espalda y tus ojos se oscurecen." + "\n" + "Te despiertas en un trono helado" + "\n" + "- ¿Dond eestoy? - Preguntas a la nada." + "\n" + "- Bienvenido al mundo de los espiritus, nuevo rey");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h32(){
	h=new JTextArea("Al final del camino hay un precipicio. Te acercas y miras" + "\n" + "si es muy profundo. Entonces notas una mano" + "\n" + "empujandote. Caes por el precipicio y mueres");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h33(){
	h=new JTextArea("Te despiertas en una cama de preciosas sabanas blancas" + "\n" + "A tu lado se encuentra la chica y tres" + "\n" + "personas más, una chica de pelo blanco, largo, un hombre" + "\n" + "con una cicatriz en el ojo y un adolescente pelirojo con pecas." + "\n" + "-  ¿Este serà el nuevo? - pregunta la chica del pelo blanco" + "\n" + "al pelirojo.- Es muy flacucho..." + "\n" + "- Dejalo Envidia, tú tambien estabas dèbil" + "\n" + "la primera vez. - Contesta el hombre de la cicatriz" + "\n" + "- ¡Àcido! - grita el adolescente - ¡Se despertó!" + "\n" + "'Así que la chica se llama Àcido' piensas" + "\n" + "Àcido se te acerca" + "\n" + "- Buenos días bello durmiente, ahora trabajas" + "\n" + "para mi");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h34(){
	h=new JTextArea("Le das un puñetazo al chico de atrás. Este te" + "\n" + "la devuelve con un golpe en la barriga. El bar se descontrola y todo el mundo comienza a pelearse." + "\n" + "Un chico te saca del grito. Fuera, te das cuenta que es un adolescente pelirojo con pecas." + "\n" + "- ¿Quien eres?- te preguntas" + "\n" + "- Mentiroso, ¿y tú?" + "\n" + "- Miguel" + "\n" + "- Bueno miguel, creo que nos llevaremos muy bien" + "\n" + "a partir de ahora");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h35(){
	h=new JTextArea("Notas un mareo muy fuerte en tu cuerpo. No lo" + "\n" + "aguantas más y vomitas en el suelo" + "\n" + "- Joder, tampoco era tan fuerte. - te insinua la chica" + "\n" + "- No me encuentro muy bien... - susurras hasta caer en el suelo" + "\n" + "Cuando te vuelves a levantar te encuentras en la calle envuelto en una manta." + "\n" + "Miras el reloj, ya es tarde ningún tren llegará hasta mañana.");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h36(){
	h=new JTextArea("- Que aburrido... - te contesta la chica - por cierto, ¿como te llamas?" + "\n" + "- Miguel" + "\n" + "- Yo Àcido. Entonces, Miguel ¿Que le lleva por aquí?" + "\n" + "- Nada, me salté la parada y bajé por error" + "\n" + "- ¿Volverá?" + "\n" + "- Por supuesto" + "\n" + "- ¿Quieres volver?" + "\n" + "Y en ese momento te lo qüestionas");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h37(){
	h=new JTextArea("Vas bajando las escaleras rapidamente. De golpe notas" + "\n" + "algo resbaladizo en el suelo y caes. La caida" + "\n" + "ha sido tran grande que un golpe en la cabeza" + "\n" + "te ha dejado sin memória. Miras la salida y" + "\n" + "decides ir al bar");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h38(){
	h=new JTextArea("- ¡Envidia! - grita la chica - ¡No seas tan maleducada!" + "\n" + "- Lo siento Àcido... - susurra la chica de pelo blanco." + "\n" + "Àcido se sienta a tu lado en un sofà" + "\n" + "- Es a veces una chic amuy maleducada. ¿Como te llamas?" + "\n" + "- Ah, Miguel - contestas" + "\n" + "- Por cierto Miguel - te insinua - Creo que seremos grandes amigos");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h39(){
	h=new JTextArea("-Pues es uno de loe mejores - te cuenta la chica" + "\n" + "- Pero si es un gato" + "\n" + "Entonces el gato se convierte en un hombre de pelo oscuros." + "\n" + "Te quedas sin palabras." + "\n" + "- Ahora que dices. - insinua" + "\n" + "- ¡Que me encantan tus gatos!" + "\n" + "Y los dos, al chica y tú reis sin parar. Y piensas si son" + "\n" + "mejores que tu propia familia");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h40(){
	h=new JTextArea("- No me mientas -  te dice enojadamente la chica - Venenoso" + "\n" + "deshazte de él, si no me sabe decir la verdad no durará" + "\n" + "ni una hora en esta ciudad" + "\n" + "De golpe el gato negro se convierte en un hombre de pelo" + "\n" + "oscuro y cicatriz en un ojo. El hombre saca una pistola" + "\n" + "y te dispara en la cabeza. Mueres");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h41(){
	h=new JTextArea("Das un mordisco a los xurros y de golpe notas un" + "\n" + "ardor en tu garganta. tus orejas comienzan a alargarse" + "\n" + "y detras crece una cola" + "\n" + "- !Venenoso! - chilla la chica - ¿Que le has puesto a los xurros?" + "\n" + "Aish, bueno, ahora tienes poderes de gato");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h42(){
	h=new JTextArea("Cada mordisco que das te quema más la garganta. No" + "\n" + "puedes más y intentas quejarte. Pero nada sale." + "\n" + "e has quedado mudo.");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h43(){
	h=new JTextArea("- ¡Genial! - dice Àcido - Te puedes quedar a vivir a aquí." + "\n" + "Tu trabajo es basicamente ayudarme con las tareas de la casa." + "\n" + "Te pagaré con comida, un techo, y algún dinero para" + "\n" + "tus caprichos." + "\n" + "Al acabar todo el discurso sonrie." + "\n" + "Sonrie con la sonrisa más bónita que podia hacer.");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h44(){
	h=new JTextArea("- ¡Eh! ¿Porque? - te pregunta Àcido" + "\n" + "- Tengo planes, he de volver a casa" + "\n" + "¿Seguro que quieres volver?" + "\n" + "- ¡Seguro!" + "\n" + "- ¡No me mientas! - te grita Àcido mientras coge una pistola - No te mientas..." + "\n" + "Y entonces piensas '¿Seguro que quiero volver?'");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h45(){
	h=new JTextArea("Bebeis tanto que los dos acabais como un cuba" + "\n" + "- Eres genial crio... - te dice la chica - ¿Como te llamas?" + "\n" + "- ¡Meguel!" + "\n" + "- Pues yo Àcido. Soy un fantasma que atrae a la personas desgraciadas a su previa muerte - te dice con orgullo" + "\n" + "- Mola. Un momento, ¿Estoy muerto?" + "\n" + "- Sip" + "\n" + "Y entonces te caes dormido por el alcohol.");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h46(){
	h=new JTextArea("- Que aburrido eres... - te dice la chica" + "\n" + "- Yo no soy un borracho" + "\n" + "La chica te mira unos sgundos se levanta y se va. Te quedas" + "\n" + "solo y miras la botella de whisky. Entonces comienzas" + "\n" + "a beber. Has tenido un día muy largo");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h47(){
	h=new JTextArea("Corres y cuando llegas a la orilla una mano te agarra" + "\n" + "del pies. Caes al mar arrastrado por unas sirenas." + "\n" + "Eres ahogado y devorado hasta la muerte");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h48(){
	h=new JTextArea("LLegas y miras a tu alrededor. Entonces oyes una" + "\n" + "especie de rugidos animal. De golpe notas un mordisco en" + "\n" + "tu pierna. Caes al suelo y puedes ver que unos lobos gigantes" + "\n" + "te están atacando. Acabas devorado hasta la muerte");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h49(){
	h=new JTextArea("- No, no lo es - te dice con cierto enfado" + "\n" + "- Pero nunca ha nadie mayor de 100 años, y tu" + "\n" + "duplicas el número" + "\n" + "- Que quieres que te diga - te contesta - Aquí todo es psible" + "\n" + "Entonces notas que esta a punto de llorar" + "\n" + "- Cree lo que te plazca - acaba y seva");
	o=new String[1];
	o[0]="Final";
	f=true;
}

public void h50(){
	h=new JTextArea("- Oh, grácias. Je je, es que aquí la gente no envejece." + "\n" + "- ¿En serio? Osea, no moreis" + "\n" + "- Te lo crees muy facilmente todo ¿no? - te insinua la chica" + "\n" + "- Bueno, sí" + "\n" + "Entonces la chica te sonríe con una perfecta sonrisa y te" + "\n" + "qüestionas si es necesario volver mañana a casa.");
	o=new String[1];
	o[0]="Final";
	f=true;
}


	
public boolean finales(){
	return f;
}
	public JTextArea historia(){
		
		//System.out.println(h.getText());
		
		return h;
		
	}
	
	public String[] opciones(){
		
		//System.out.println(o.length);
		
		return o;
		
	}


}
