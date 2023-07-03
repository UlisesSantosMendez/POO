/*
NOMBRE: SANTOS MENDEZ ULISES JESÚS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
PRACTICA 2
TEMA: ARREGLO DE OBJETOS
OPCION 3: MOSAICO DE IMAGENES
FECHA DE ENTREGA: 06/05/2021

INSTRUCCIONES:
COLOCAR 40 IMGENES EN BOTONES PONER TAMBIEN UNA ETIQUETA 
Y QUE CUANDO SE HAGA CLIC EN UN BOTON SE MUESTRE LA
IMAGEN DE DICHO BOTON EN LA ETIQUETA
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mosaico extends JApplet implements ActionListener{
    JButton bfoto[];
    JLabel etiq,etiima;
    ImageIcon imas[];
    int i;
    
    public void init(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,7));
        this.getContentPane().add(panel);
        panel.setBackground(Color.BLUE);
        etiq = new JLabel("MOSAICO DE IMAGENES");
        panel.add(etiq);
	etiq.setForeground(Color.WHITE);
	etiq.setHorizontalAlignment(0);
        etiq.setFont(new Font("TimesRoman",Font.BOLD,17));
        
        imas= new ImageIcon[40];
        imas[0]= new ImageIcon("ame1.png");
        imas[1]= new ImageIcon("ame2.png");
        imas[2]= new ImageIcon("ame3.png");
        imas[3]= new ImageIcon("ame4.png");
        imas[4]= new ImageIcon("dare1.jpg");
        imas[5]= new ImageIcon("dare2.jpg");
        imas[6]= new ImageIcon("dare3.jpg");
        imas[7]= new ImageIcon("dare4.jpg");
        imas[8]= new ImageIcon("dare5.jpg");
        imas[9]= new ImageIcon("dare6.png");
        imas[10]= new ImageIcon("dare7.png");
        imas[11]= new ImageIcon("dare8.png");
        imas[12]= new ImageIcon("dare9.png");
        imas[13]= new ImageIcon("dare10.png");
        imas[14]= new ImageIcon("fanta1.jpg");
        imas[15]= new ImageIcon("fanta2.jpg");
        imas[16]= new ImageIcon("fanta3.jpg");
        imas[17]= new ImageIcon("fanta4.jpg");
        imas[18]= new ImageIcon("fanta5.jpg");
        imas[19]= new ImageIcon("fanta6.jpg");
        imas[20]= new ImageIcon("fanta7.jpg");
        imas[21]= new ImageIcon("fanta8.jpg");
        imas[22]= new ImageIcon("fanta9.jpg");
        imas[23]= new ImageIcon("fanta10.jpg");
        imas[24]= new ImageIcon("iron1.jpg");
        imas[25]= new ImageIcon("iron2.jpg");
        imas[26]= new ImageIcon("iron3.jpg");
        imas[27]= new ImageIcon("iron4.jpg");
        imas[28]= new ImageIcon("iron5.jpg");
        imas[29]= new ImageIcon("iron6.jpg");
        imas[30]= new ImageIcon("iron7.jpg");
        imas[31]= new ImageIcon("iron8.jpg");
        imas[32]= new ImageIcon("iron9.jpg");
        imas[33]= new ImageIcon("iron10.jpg");
        imas[34]= new ImageIcon("spi1.png");
        imas[35]= new ImageIcon("spi2.png");
        imas[36]= new ImageIcon("spi3.png");
        imas[37]= new ImageIcon("spi4.png");
        imas[38]= new ImageIcon("spi5.png");
        imas[39]= new ImageIcon("spi6.png");
        
        bfoto = new JButton[40];
        
        for(i=0; i<bfoto.length; i++){
            bfoto[i] = new JButton(imas[i]);
            bfoto[i].setIcon(imas[i]);
            bfoto[i].setEnabled(true);
            panel.add(bfoto[i]);
            bfoto[i].addActionListener(this);
        }
        etiima = new JLabel("Seleccione una imagen");
        panel.add(etiima);
        etiima.setForeground(Color.BLACK);
        etiima.setOpaque(true);
        etiima.setBackground(Color.ORANGE);
	etiima.setHorizontalAlignment(0);
        etiima.setFont(new Font("Arial",Font.PLAIN,18));
        setSize(700,700);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e){
        JButton jb = (JButton)e.getSource();
        etiima.setIcon(jb.getIcon());
        etiima.setText("");
    }
    public static void main(String[] args){
        Mosaico sal = new Mosaico();
        sal.setVisible(true);
    }
}
