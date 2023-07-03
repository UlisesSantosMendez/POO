/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACIÓN ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 1: MODELAR UN CARRETE
FECHA DE ENTREGA: 06/05/21
*/

import java.util.*;

public class Pbacarrete {
    public static void main(String[] args){
        int qtotal;
        Scanner entrada = new Scanner(System.in);
        Carrete carrete = new Carrete();
        System.out.println("Ingrese la cantidad que desea comprar: ");
        qtotal = entrada.nextInt();
        carrete.venta(qtotal); 
    }
}
