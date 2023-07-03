/*
NOMBRE: SANTOS MÉNDEZ ULISES JESÚS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
PRÁCTICA 1
TEMA: INTERFAZ GRAFICA DE USUARIO BÁSICA
OPCION 3: CONVERSION DE TEMPERATURAS
FECHA DE ENTREGA: 26/04/2021

INSTRUCCIONES:
UN CAMPO DE ENTRADA PARA INTRODUCIR LA TEMPERATURA
UN BOTON PARA CONVERTIR DE GRADOS CENTIGRADOS A KELVIN 
UN BOTON PARA CONVERTIR DE GRADOS KELVIN A CENTIGRADOS

*/

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class convtemp extends Applet implements ActionListener {
    Button c1,c2;
    TextField centrada;
    Label t1,res;
    
    public void init(){
        t1= new Label("CONVERSION TEMPERATURA");
        add(t1);
        centrada= new TextField(10);
        add(centrada);
        c1= new Button("°C a °K");
        add(c1);
        c1.addActionListener(this);
        c2= new Button("°K a °C");
        add(c2);
        c2.addActionListener(this);
        res= new Label("");
        add(res);
    }

    public void actionPerformed(ActionEvent e){
        double v1 =Double.parseDouble(centrada.getText());
        double total;
        Button b= (Button)e.getSource();
        if(b == c1){
            total=v1+273;
            res.setText("Resultado: "+total);
        }
        if(b == c2){
            total=v1-273;
            res.setText("Resultado: "+total);
        }
    }
        
    public static void main(String s[]){
        new convtemp();
    }
}