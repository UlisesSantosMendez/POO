/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
PRACTICA 5
TEMA: SOCKETS CLIENTES
OPCION 1: CHAT 3D
FECHA DE ENTREGA: 06/05/2021

PROCEDIMIENTO
1.-Chat 3D (Carpeta estatiProgBarRedSimBot_/hombregatoact2014)
Modificar el programa que cambia el estado de animo del tamagochi en la maquina local y la maquina remota
de modo que en lugar de disponer de solo 2 estados de animo se tengan 5 estados de animo y que por cada
estdo de animo haya un boton.

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.image.*;
import javax.media.j3d.*; 
import javax.vecmath.*;
import java.net.*;  
import java.io.*; 

public class Tamagochi extends JFrame  implements LeeRed {
	private Canvas3D canvas3D;
	private Appearance ap;
	private static Texture texture;  
	private JPanel jp1, jp2;
	private JButton bcambia, bcambia2, bcambia3, bcambia4, bcambia5;
	private EventHandler eh; 
	private String nombres[]={"carafeliz.jpg","caraenfermo.jpg","Avatar1.jpg","Avatar 4.jpg", "Avatar 2.jpg"};
	private int turno;
	private MicroChat microChat;
	private Body body;   
	private Red r; 

	public Tamagochi(){
	  	super("Tamagochi 3D");
	   	turno=0;
   		setSize(450, 500);
   		GraphicsConfiguration config = 
	    SimpleUniverse.getPreferredConfiguration(); 
   		canvas3D = new Canvas3D(config); 
   		canvas3D.setSize(300, 400); 
   		eh = new EventHandler(); 
   		bcambia=new JButton("Feliz");//boton feliz
	    bcambia2=new JButton("Enfermo");//boton enfermo
	    bcambia3=new JButton("Sonriendo");//boton sonriendo
	    bcambia4=new JButton("Viajando");	//boton viajando
	    bcambia5=new JButton("Confundido");//boton confundido
   		bcambia.addActionListener(eh); 
	    bcambia2.addActionListener(eh); 
	    bcambia3.addActionListener(eh); 
	    bcambia4.addActionListener(eh); 
	    bcambia5.addActionListener(eh);		
   		jp1=new JPanel(); 
   		jp1.add(bcambia);
		jp1.add(bcambia2);   
		jp1.add(bcambia3); 
		jp1.add(bcambia4); 
		jp1.add(bcambia5); 
   		add("North", jp1); 
   		add("Center",canvas3D); 
   		setup3DGraphics();
   		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   		setVisible(true);
   		r=new Red(this);
   		microChat = new MicroChat(r);
   		add("South", microChat);
	}
	void setup3DGraphics(){
   		DirectionalLight light1;
   		SimpleUniverse universe = new SimpleUniverse(canvas3D);
      	universe.getViewingPlatform().setNominalViewingTransform();
		body=new Body(-0.4f,0.0f,0.0f,"",true, this, "Avatar1");  
		body.changeTextureCab(texture, "carafeliz.jpg"); 
   		BranchGroup group= body.mybody();
   		Color3f light1Color = new Color3f(1.0f, 1.0f, 0.0f);
   		BoundingSphere bounds =new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
   		Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
     	light1 = new DirectionalLight(light1Color, light1Direction);
     	light1.setInfluencingBounds(bounds);
     	group.addChild(light1);
     	universe.addBranchGraph(group);
	}

	public static void main(String[] args) {
		 new Tamagochi(); 
		}  
		class EventHandler implements ActionListener {  
  			public void actionPerformed(ActionEvent e) { 
     			Object obj=e.getSource(); 
	     		if(obj instanceof JButton){ 
	     			JButton btn=(JButton)e.getSource(); 
		     		if(btn==bcambia){ 
		     			turno=0; 
		     		}
		     		else if(btn==bcambia2){ 
		     			turno=1; 
		     		}
		        	else if(btn==bcambia3){ 
		        		turno=2; 
		        	}
		        	else if(btn==bcambia4){ 
		        		turno=3; 
		        	}
		        	else if(btn==bcambia5){ 
		        		turno=4; 
		        	}
	     			body.changeTextureCab(texture, nombres[turno]); 
	     			r.escribeRed(new Icono("Tamagochi", turno)); 
     			}  
  			}
		}

	public void leeRed(Object obj){//metodo leeRed
		if(obj instanceof Icono){      
        	Icono i=(Icono)obj;  
            System.out.println("Recibi"+nombres[i.getTurno()]);
            body.changeTextureCab(texture, nombres[i.getTurno()]);                 	
		}
		if(obj instanceof Mensaje){ 
			System.out.println("Recibi "+(Mensaje)obj);
            microChat.recibir((Mensaje)obj);
		}
	}
}