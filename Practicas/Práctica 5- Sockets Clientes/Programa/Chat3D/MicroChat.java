/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
PRACTICA 5
TEMA: SOCKETS CLIENTES
OPCION 1: CHAT 3D
FECHA DE ENTREGA: 06/05/2021

PROCEDIMIENTO
1.-Chat 3D (Carpeta estatiProgBarRedSimBot_/hombregatoact2014)
Modificar el programa que cambia el estado de animo del tamagochi en la maquina local y la maquina remota
de modo que en lugar de disponer de solo 2 estados de animo se tengan 5 estados de animo y que por cada
estdo de animo haya un boton.

*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class MicroChat extends JPanel implements ActionListener{
    private JTextArea incoming;
    private JTextField outgoing;
    private Red r;
    public MicroChat (Red r) {    
    	super();
        this.r=r;	
        setLayout(new GridLayout(2,1));
        incoming = new JTextArea(5,20);  // was 15,50
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);       
        outgoing = new JTextField(15);
        outgoing.addActionListener(this);
    	add(outgoing);
    	add(qScroller);
    }
    public void actionPerformed(ActionEvent e) { 
    	r.escribeRed(new Mensaje("ESCOM","JEJE", outgoing.getText()));
    	outgoing.setText("");
    }
    public void recibir(Mensaje mensa){
    	incoming.append(mensa.getTexto() + "\n");
    }
}