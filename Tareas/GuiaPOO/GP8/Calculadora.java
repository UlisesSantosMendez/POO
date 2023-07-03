/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 8: Operaciones con dos números
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
*/

import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JApplet implements ActionListener {
    JButton q1,q2,q3,q4;
    JTextField c1,c2;
    JLabel t1,et1;
    
    public Calculadora(){
        setLayout(null);
        t1= new JLabel("CALCULADORA BÁSICA");
        add(t1);
	et1= new JLabel("");
	add(et1);
        c1= new JTextField(8);
        c1.setBounds(10, 17, 100, 30);
        add(c1);
        c2= new JTextField(8);
        c2.setBounds(120, 17, 100, 30);
        add(c2);
        q1= new JButton("+");
        q1.setBounds(200, 17, 150, 30);
        add(q1);
        q1.addActionListener(this);
        q2= new JButton("-");
        q2.setBounds(400, 17, 150, 30);
        add(q2);
        q2.addActionListener(this);
	q3= new JButton("*");
        q3.setBounds(600, 17, 150, 30);
        add(q3);
        q3.addActionListener(this);
	q4= new JButton("/");
        q4.setBounds(800, 17, 150, 30);
        add(q4);
        q4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
    	double v1= Double.parseDouble(c1.getText());
	double v2= Double.parseDouble(c2.getText());
	double total;
	JButton b1= (JButton)e.getSource();
	if(b1 == q1){
		total= v1+v2;
		et1.setText(""+total);
	}
	if(b1 == q2){
		total= v1-v2;
		et1.setText(""+total);
	}
	if(b1 == q3){
		total= v1*v2;
		et1.setText(""+total);
	}
	if(b1 == q4){
		if(v2 == 0){
			et1.setText("SE INDETERMINA");
		}
		else{
			total= v1/v2;
			et1.setText(""+total);
		}
	}

    }
    public static void main(String[] args){
        Calculadora sal = new Calculadora();
        sal.setVisible(true);
    }
}