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

import java.io.*;
import java.net.*;
import javax.swing.*;

public class Red {
  private Socket cliente;
  private ObjectInputStream oisNet;
  private ObjectOutputStream oosNet;
  private int puerto=5000;
  private LeeRed lr;
  public Red(LeeRed lr) {  
    this.lr=lr;
    setUpNetworking();
  }
  public void setUpNetworking() { 
    int i=0;
    String host = JOptionPane.showInputDialog("Escriba dir.IP", "localhost");
    while(i==0){	
    	System.out.println("Esperando por el servidor . . ."); i=1;
    	try {
		    cliente=new Socket(host, puerto);
    	} catch ( IOException e) {
        System.out.println("Fallo creacion Socket"); i=0;
    	}
    }
    System.out.println("Conectado al servidor.");
    try {
      oisNet = getOISNet(cliente.getInputStream());
      oosNet = getOOSNet(cliente.getOutputStream()); 
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error al crear los fujos de objeto"+e);
    }
    (new Thread( new IncomingReader(lr, oisNet) )).start();
  }  
  public void escribeRed(Object obj) {     
    try {
      oosNet.writeObject(obj);        
      oosNet.flush();
    } catch (IOException ex) { 
      ex.printStackTrace(); 
    }
  }
  ObjectOutputStream getOOSNet(OutputStream os) throws IOException {
		return new ObjectOutputStream(os);
  }
  ObjectInputStream getOISNet(InputStream is) throws IOException {
    return new ObjectInputStream(is);
  }
}