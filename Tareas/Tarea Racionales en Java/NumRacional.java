/* SANTOS MENDEZ ULISES JESUS
    TAREA SUMA Y RESTA DE RACIONALES
    GRUPO: 2CM11
    FECHA DE ENTREGA: 23/04/2021
MATERIA:PROGRAMACION ORIENTADA A OBJETOS
*/

import java.util.*;
        
public class NumRacional {
     int numdor;
     int dendor;
     //Constructor con parámetros
     public NumRacional (int numdor, int dendor){
        this.numdor=numdor;
        this.dendor=dendor;

     }
     //sumar dos numeros racionales
     public NumRacional sum(NumRacional r){

     return new NumRacional ((numdor*r.dendor)+(dendor*r.numdor), dendor*r.dendor);

     }
     //restar dos numeros racionales
     public NumRacional res(NumRacional r){

     return new NumRacional ((numdor*r.dendor)-(dendor*r.numdor), dendor*r.dendor);

      }
      //imprimir
      void imprimir(){
      System.out.println(numdor+" / "+dendor);
      } 
}