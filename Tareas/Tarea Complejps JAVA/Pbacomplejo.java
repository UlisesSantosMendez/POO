/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
TEMA: TAD NUMERO COMPLEJO
*/
public class Pbacomplejo {
    public static void main(String[] args){
        // Declaración de números complejos
        Complejo c1 = new Complejo(-7.0, 9.0);
        Complejo c2 = new Complejo(4.0, -2.0);
        Complejo c3,c4,c5,c6,c7,c8;

        // operadores aritméticos
        System.out.print("Modulo de"+ c1 + " = ");
        c1.modulo();//mostrar resultado

        System.out.print("Modulo de"+ c2 + " = ");
        c2.modulo();//mostrar resultado

        c3 = c1.sumar(c2);
        System.out.print(c1 + " + " + c2 + " = ");
        c3.imprimir();//imprimir resultado

        c4 = c1.restar(c2);
        System.out.print(c1 + " - " + c2 + " = ");
        c4.imprimir(); //imprimir resultado

        c5 = c1.dividir(c2);
        System.out.print(c1 + " / " + c2 + " = " );
        c5.imprimir();//imprimir resultado

        c6 = c1.multiplicar(c2);
        System.out.print(c1 + " * " + c2 + " = ");
        c6.imprimir();//imprimir resultado
        
   }
}
