/* SANTOS MENDEZ ULISES JESUS
    TAREA SUMA Y RESTA DE RACIONALES
    GRUPO: 2CM11
    FECHA DE ENTREGA: 23/04/2021
MATERIA:PROGRAMACION ORIENTADA A OBJETOS
*/

public class PbaRacional {
      public static void main(String s[]){
   // Declaración de números complejos
       NumRacional num1,den1,rsuma,rsus;
       num1= new NumRacional(3,8);     
       den1= new NumRacional(9,5);
   // operadores aritméticos
       num1.imprimir();
       den1.imprimir();
       rsuma = num1.sum(den1);
       System.out.print("Suma = ");
       rsuma.imprimir();//imprimir resultado
       rsus = num1.res(den1);
       System.out.print("Resta = ");
       rsus.imprimir();//imprimir resultado
    }   
}