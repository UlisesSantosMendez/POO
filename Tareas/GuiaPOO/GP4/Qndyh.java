/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 3: Convertir minutos a días y horas
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Qndyh extends Applet implements ActionListener  {
    Button calc;
    TextField c1;
    Label t1,res1,res2;
    public void init(){
        t1= new Label("CONVERSION MINUTOS");
        add(t1);
        c1= new TextField(5);
        add(c1);
        calc = new Button("calcula");
        add(calc);
        calc.addActionListener(this);
        res1= new Label("");
        add(res1);
        res2= new Label("");
        add(res2);
    }
    public void actionPerformed(ActionEvent e){
        int v1= Integer.parseInt(c1.getText());
        int v2,v3;
        double total;
        Button sal= (Button)e.getSource();
        v2= v1/1440;
        v3= v1/60;
        res1.setText("Resultado: "+v2+" días");
        res2.setText("Resultado: "+v3+" horas");
    }
    public static void main(String[] args){
        new Qndyh();
    }
}
