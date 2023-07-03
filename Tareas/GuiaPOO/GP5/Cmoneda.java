/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 5: Conversion de moneda nacional
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Cmoneda extends JApplet implements ActionListener {
    JButton q1,q2;
    JTextField c1,c2;
    JLabel t1;
    double qdinero;
    
    public Cmoneda(){
        setLayout(null);
        t1= new JLabel("CONVERSIÓN MONEDA NACIONAL");
        add(t1);
        c1= new JTextField(8);
        c1.setBounds(10, 17, 100, 30);
        add(c1);
        c2= new JTextField(8);
        c2.setBounds(440, 17, 100, 30);
        add(c2);
        q1= new JButton("Pesos a Dolares");
        q1.setBounds(120, 17, 150, 30);
        add(q1);
        q1.addActionListener(this);
        q2= new JButton("Dolares a Pesos");
        q2.setBounds(280, 17, 150, 30);
        add(q2);
        q2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == q1){
            qdinero = Double.parseDouble(c1.getText()) / Integer.parseInt(c2.getText());
            c1.setText(""+qdinero);
        }
        if(e.getSource() == q2){
            qdinero = Double.parseDouble(c1.getText()) * Integer.parseInt(c2.getText());
            c2.setText(""+qdinero);
        }
    }
    public static void main(String[] args){
        Cmoneda sal = new Cmoneda();
        sal.setVisible(true);
    }
}
