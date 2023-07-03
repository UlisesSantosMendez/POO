/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 3: Convertir el formato hh:mm:ss a segundos
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Ctsegundos extends Applet implements ActionListener{
    Button calc;
    TextField c1,c2,c3;
    Label t1,res;
    public void init(){
    t1 = new Label("CONVERSION TIEMPO");
    add(t1);
    c1= new TextField(3);
    add(c1);
    c2= new TextField(3);
    add(c2);
    c3= new TextField(3);
    add(c3);
    calc= new Button("calcula");
    add(calc);
    calc.addActionListener(this);
    res= new Label("");
    add(res);
    }
    public void actionPerformed(ActionEvent e){
    int r1 = Integer.parseInt(c1.getText());
    int r2 = Integer.parseInt(c2.getText());
    int r3 = Integer.parseInt(c3.getText());
    int total;
    Button sal= (Button)e.getSource();
    r1 = r1*3600;
    r2 = r2*60;
    total= r1+r2+r3;
    res.setText("Resultado: "+total+ " segundos");
    }
    public static void main(String[] args){
        new Ctsegundos();
    }
}
