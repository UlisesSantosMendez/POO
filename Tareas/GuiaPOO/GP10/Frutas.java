/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 10: Imprimir texto que hay en el boton
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Frutas extends Applet implements ActionListener  {
    Button man,lim,nar;
    Label fruit;
 
    public void init(){
	man = new Button("Manzana");
        add(man);
        man.addActionListener(this);
        lim = new Button("Limon");
        add(lim);
        lim.addActionListener(this);
	nar = new Button("Naranja");
        add(nar);
        nar.addActionListener(this);
	fruit= new Label("");
        add(fruit);
    }
    public void actionPerformed(ActionEvent e){ 	
	Button sal = (Button)e.getSource();
	if(sal == man){
		fruit.setText("Manzana");
	}
	if(sal == lim){
		fruit.setText("Limon");
	}
	if(sal == nar){
		fruit.setText("Naranja");
	}	
    		    
    }
    public static void main(String[] args){
        new Frutas();
    }
}