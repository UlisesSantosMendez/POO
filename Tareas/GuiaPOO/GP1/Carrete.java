/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 1: MODELAR UN CARRETE
FECHA DE ENTREGA: 06/05/2021
//////////////////////////////////////
-Suponga que cada carrete viene con 200m de tela
- la tela solo se vende al menudeo por metro( o sea no por carrete)
- si hay suficiente tela entonces se debe cortar del carrete
  la cantidad de tela que pida el cliente
*/

public class Carrete {
    private int qtotal;
    
    public Carrete(){
        int qtotal = 200;
    }
    public void venta(int qcompra){
        if(qcompra <= 200){
            qtotal = qtotal - qcompra;
            System.out.println("Has comprado "+ qcompra +"m de tela");
        }
        else{
            System.out.println("No hay tela suficiente en el carrete");
        }     
    }
}
