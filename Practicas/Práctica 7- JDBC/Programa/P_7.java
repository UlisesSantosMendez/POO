/*
   SANTOS MENDEZ ULISES JESUS
   PRACTICA NUMERO 7
   TEMA: JDBC
   OPCION 1: INSERTAR PERROS EN UNA BASE DE DATOS
   FECHA: 07/05/2021
   GRUPO: 2CM3
   MATERIA: PROGRAMACION ORIENTADA A OBJETOS
   PROFESOR: TECLA PARRA ROBERTO

PROCEDIMIENTO
Hacer un programa que utilice la API JDBC y que tenga una GUI que permita insertar perros en una
base de datos que tiene una tabla Perro con el siguiente esquema Perro(nombre, raza, edad, genero). La
GUI consistirá en 4 etiquetas, 4 campos de entrada y 2 botones. Un botón para conectar a la base de
datos y otro para insertar los datos de un perro.
*/
//SOLUCION

import java.sql.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class P_7 extends JFrame implements ActionListener{
    JButton bottonConect, bottonInsert;
    JLabel labelRegistry,labelName, labelRace, labelAge, labelGender, lEmpty1, lEmpty2;
    JTextField tableName, tableRace, tableAge, tableGender;
    JPanel pan1,pan2,pan3;
        
    public P_7(){
        bottonConect = new JButton("Conectar");		
        bottonConect.addActionListener(this);
        bottonInsert = new JButton("Ingresar");		
        bottonInsert.addActionListener(this);
        labelRegistry = new JLabel("Registro");
        lEmpty1 = new JLabel("");
        lEmpty2 = new JLabel("");
        labelName = new JLabel("Nombre: ");
        tableName = new JTextField(20);
        labelRace = new JLabel("Raza: ");
        tableRace = new JTextField(20);
        labelAge = new JLabel("Edad: ");
        tableAge = new JTextField(2);
        labelGender = new JLabel("Genero: ");
        tableGender = new JTextField(1);
        pan1 = new JPanel();
        pan1.setLayout(new GridLayout(4,2,5,5));
        pan1.add(labelName);      
        pan1.add(tableName);
        pan1.add(labelRace);	
        pan1.add(tableRace);
        pan1.add(labelAge);	
        pan1.add(tableAge);
        pan1.add(labelGender);	
        pan1.add(tableGender);
        pan2 = new JPanel();
        pan2.setLayout(new GridLayout(1,2,5,5));
        pan2.add(bottonConect);		
        pan2.add(bottonInsert);
        pan3 = new JPanel();
        pan3.setLayout(new GridLayout(1,3,5,5));
        pan3.add(lEmpty1);		
        pan3.add(labelRegistry);		
        pan3.add(lEmpty2);
        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        add("North",pan3);    
        add("Center",pan1);   
        add("South",pan2);
    }
    public static void main(String[] args) {
        new P_7();
    }  
    public void actionPerformed(ActionEvent e) {                                        
        JButton selected = (JButton)e.getSource();
        String name,race,age,gen;
        name=tableName.getText();
        race=tableRace.getText();
        age=tableAge.getText();
        gen=tableGender.getText();
        if(selected == bottonConect){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
               
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(P_7.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p7", "root", "20Gerika01");
            } catch (SQLException ex) {
                Logger.getLogger(P_7.class.getName()).log(Level.SEVERE, null, ex);
            }
                System.out.println("CONEXION ESTABLECIDA SATISFACTORIAMENTE");
        }        
        else{
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p7", "root", "20Gerika01");
                Statement stm = con.createStatement();
                stm.executeUpdate("insert into perro(name,race,age,gen)values('"+name+"','"+race+"','"+age+"','"+gen+"')");
                tableName.setText("");
                tableRace.setText("");
                tableAge.setText("");
                tableGender.setText("");
                ResultSet rs = stm.executeQuery("select name,race,age,gen from perro");
                System.out.println("\nDATOS RECIENTEMENTE INGRESADOS");
                System.out.println("NOMBRE: "+name+"\n"+"RAZA: "+race+"\n"+"EDAD: "+age+"\n"+"GENERO: "+gen+"\n");
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(P_7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}