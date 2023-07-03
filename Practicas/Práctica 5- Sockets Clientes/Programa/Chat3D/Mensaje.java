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
import java.io.Serializable;

class Mensaje implements Serializable {
	String programa;
	String nick;
	String texto;
	public Mensaje(String programa, String nick, String texto){
		this.programa=programa;
		this.nick=nick;
		this.texto=texto;	
	}
	public String getPrograma(){
        return programa;
	}
	public String getNick(){
        return nick;
	}
	public String getTexto(){
	    return texto;
	}
}