/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
PRACTICA 4
TEMA: HILOS
OPCION 3: MARCO DIGITAL
FECHA DE ENTREGA: 06/05/2021

 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

public class MarcoDig extends JFrame implements Runnable, ActionListener {
//Declaramos variables de instancia
    Vector <String> nombres=new Vector<String>();
    String[]opcion = {"Default", "300", "500", "1000", "2000"};
    Panel p;
    Container ventana;
    ImageIcon iconos[];
    JLabel jlimg;
    JComboBox cb;
    Thread hilo; //Hilo de control
    int t = 3000;
    int i;
    
    public MarcoDig(){
        super("Marco Digital");
        Arrimages();
        p = new Panel();
        iconos = new ImageIcon[nombres.size()];
        iconos[0] = new ImageIcon(nombres.elementAt(0));
        iconos[1] = new ImageIcon(nombres.elementAt(1));
        iconos[2] = new ImageIcon(nombres.elementAt(2));
        iconos[3] = new ImageIcon(nombres.elementAt(3));
        iconos[4] = new ImageIcon(nombres.elementAt(4));
        iconos[5] = new ImageIcon(nombres.elementAt(5));
        iconos[6] = new ImageIcon(nombres.elementAt(6));
        iconos[7] = new ImageIcon(nombres.elementAt(7));
        jlimg = new JLabel(iconos[0], JLabel.CENTER);
        p.add(jlimg);
        cb = new JComboBox(opcion);
        cb.setBounds(400, 20, 60, 25);
        cb.setSelectedIndex(0);//Seleccionamos el primer item del indice
        cb.addActionListener(this);
        p.add(cb);
        p.setBackground(new Color(0xCCFFCC));
        JFrame v = new JFrame("MARCO DIGITAL");
        v.add(p);
        v.setSize(1000, 900);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        v.setBackground(Color.BLACK);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//Se reserva memoria y se llama al constructor
        hilo = new Thread(this);
        hilo.start();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cb){
            JComboBox combocaja = (JComboBox)e.getSource();
            String op = (String)combocaja.getSelectedItem();
            if("Default".equals(op)){
                t = 3000;
            }
            if("300".equals(op)){
                t = 300;
            }
            if("500".equals(op)){
                t = 500;
            }
            if("1000".equals(op)){
                t = 1000;
            }
            if("2000".equals(op)){
                t = 2000;
            }
        }    
    }
    
    private void Arrimages(){
        nombres.addElement("Azathoth.jpg");
        nombres.addElement("Baku.jpg");
        nombres.addElement("Cthulhu.jpg");
        nombres.addElement("Hastur.jpg");
        nombres.addElement("Nyarlathotep.jpg");
        nombres.addElement("Ratatoskr.png");
        nombres.addElement("Shuma.png");
        nombres.addElement("Sleipner.jpg");
    }
    
    public void run(){
    //    for(i = 1; i<nombres.size(); i++){
    //            jlimg.setIcon(iconos[i % iconos.length]);
    //        }  
        try{
            for(i = 0; i<nombres.size(); i++){
                //jlimg.setIcon(iconos[i % iconos.length]);
                jlimg.setIcon(new ImageIcon(iconos[i].getImage().getScaledInstance(700, 600, Image.SCALE_SMOOTH)));
            
    //            jlimg.setIcon(iconos[i % iconos.length]);
    //        }  
                hilo.sleep(t);
                if(i == 7){
                 i=0;
                
                }          
            
            }
        }
        catch(Exception e){
            System.out.println("ERROR CARGA DE IMAGENES");
        }
    }
    
    public static void main(String[] args){
        MarcoDig marcoDig = new MarcoDig();
    }
}
