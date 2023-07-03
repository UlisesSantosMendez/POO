/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 7: Año de muerte
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Evida extends Applet implements ActionListener  {
    Button adivina;
    TextField c1;
    Label t1,res1;
    int res;
    public void init(){
        t1= new Label("AÑO DE MUERTE");
        add(t1);
        c1= new TextField(10);
        add(c1);
        adivina = new Button("adivina");
        add(adivina);
        adivina.addActionListener(this);
        res1= new Label("");
        add(res1);
    }
    public void actionPerformed(ActionEvent rboton){
    	if(rboton.getSource() == adivina){
		res= (77 - Integer.parseInt(c1.getText())) + 2021;
		res1.setText("Mueres en el :"+res);
	}	
    		    
    }
    public static void main(String[] args){
        new Evida();
    }
}