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

public class IncomingReader implements Runnable {
    private LeeRed lr;
    private ObjectInputStream oisNet;
    public IncomingReader(LeeRed lr, ObjectInputStream oisNet){ 
    	this.lr=lr;
    	this.oisNet=oisNet;
    }
    public void run(){
    	Object obj=null;
    	int j,k=0;
        System.out.println("run");
       	for(;;){
        	j=0;
        	try {
                obj=oisNet.readObject();	
        	} catch (IOException e) {
    			System.out.println("IO ex"+e);
             	j=1;
            } catch (ClassNotFoundException ex) {
                System.out.println("Class no found"+ex);
    			j=1;
    		} 
        	if (j==0) {
                lr.leeRed(obj);
            }//if
        }//for
    }//run
}