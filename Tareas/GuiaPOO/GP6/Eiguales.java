/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 6: Campos iguales
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Eiguales extends Applet implements ActionListener  {
    Button compara;
    TextField c1,c2;
    Label t1,res1;
    public void init(){
        t1= new Label("COMPARA CAMPOS");
        add(t1);
        c1= new TextField(10);
        add(c1);
	c2= new TextField(10);
        add(c2);
        compara = new Button("compara");
        add(compara);
        compara.addActionListener(this);
        res1= new Label("");
        add(res1);
    }
    public void actionPerformed(ActionEvent rboton){
    	if(rboton.getSource() == compara){
		String e1 = c1.getText();
		String e2 = c2.getText();
		if(e1.equals(e2)){
		res1.setText("SON IGUALES");
		}
		else{
		res1.setText("NO SON IGUALES");
	        }
	}    
    }
    public static void main(String[] args){
        new Eiguales();
    }
}