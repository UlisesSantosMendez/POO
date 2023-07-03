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
import java.util.*;

public class VerySimpleChatServer {
  ArrayList<ObjectOutputStream> clientObjectOutputStreams;// ArrayList que va a guardar ObjectOutputStreams 
  public class ClientHandler implements Runnable {     //clase ClientHandler que implementa la interfaz Runnable
    ObjectOutputStream writer;
    ObjectInputStream reader;
    Socket sock;//socket
    public ClientHandler(Socket clientSocket, ObjectOutputStream writer) {
      try {
        this.writer= writer;
        sock = clientSocket;
        reader = new ObjectInputStream(sock.getInputStream());      
      } catch(Exception ex) {
		      System.out.println("Exce Servidor reader " + ex);
          ex.printStackTrace();
        }
    } 

    public void run() {//metodo Run
      Object obj;     
      try {
        while (true) {//ciclo infinito
		      obj = (Object) reader.readObject();      
          tellEveryone(obj, writer);
        }
      } catch(Exception ex) {
          ex.printStackTrace();
        }
    } 
  }
  public static void main (String[] args) {//Metodo Main
    new VerySimpleChatServer().go();
  }
  public void go() {     //Metodo go
    clientObjectOutputStreams = new ArrayList<ObjectOutputStream>();
    try {
      ServerSocket serverSock = new ServerSocket(5000);
      while(true) {
        Socket clientSocket = serverSock.accept();  
        ObjectOutputStream writer = new ObjectOutputStream(clientSocket.getOutputStream());        
        clientObjectOutputStreams.add(writer);
        Thread t = new Thread(new ClientHandler(clientSocket, writer));//Hilo
        t.start();// Metodo start
        System.out.println("GOT A CONNECTION");
      }     
    }catch(Exception ex) {// imprimir pila de llamadas 
         ex.printStackTrace();
      }
   }
  public void tellEveryone(Object obj, ObjectOutputStream writerp) {//Metodo TellEveryOne
    Iterator it = clientObjectOutputStreams.iterator();
    while(it.hasNext()) {
      try {    
        ObjectOutputStream writer = (ObjectOutputStream) it.next();
        if(!writer.equals(writerp)){   
          writer.writeObject(obj);
          writer.flush();
        }
      } catch(Exception ex) {
        ex.printStackTrace();
      }
      
    }  
  }
}