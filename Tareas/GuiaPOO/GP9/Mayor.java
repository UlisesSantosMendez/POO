/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 9: Mayor de 3 números
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Mayor extends Applet implements ActionListener  {
    Button obtener;
    TextField c1,c2,c3;
    Label res;
 
    public void init(){
        res= new Label("");
        add(res);
        c1= new TextField(5);
        add(c1);
        c2= new TextField(5);
        add(c2);
	c3= new TextField(5);
        add(c3);
	obtener = new Button("obtener");
        add(obtener);
        obtener.addActionListener(this);
        res= new Label("");
        add(res);
    }
    public void actionPerformed(ActionEvent e){
    	int v1= Integer.parseInt(c1.getText());
	int v2= Integer.parseInt(c2.getText());
	int v3= Integer.parseInt(c3.getText()); 	
	Button sal = (Button)e.getSource();
	if(sal == obtener){
		if(v1>v2 && v1>v3){
			res.setText(""+v1);
		}
		else{
			if(v2>v1 && v2>v3){
				res.setText(""+v2);
			}
			else{
				res.setText(""+v3);
			}
		}
	}	
    		    
    }
    public static void main(String[] args){
        new Mayor();
    }
}