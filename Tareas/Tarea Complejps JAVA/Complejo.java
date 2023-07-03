/*
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
TEMA: TAD NUMERO COMPLEJO
 */

import java.math.*;

public class Complejo {
    double real;
    double imag;
 
    //Constructor con parámetros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    

    //modulo números complejos
    //|w|=|a+bi|=sqrt(a^2 + b^2)
    void modulo(){
		double w;
		w= Math.sqrt(real*real + imag*imag);
		if(w<0){
			w=w*(-1);
		}
		System.out.println(w);
    }

    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);
    public Complejo sumar(Complejo c){
      return new Complejo ((real+c.real), (imag+c.imag));
    }
   
    //restar dos números complejos
    //(a, b) - (c, d) = (a - c, b - d);
    public Complejo restar(Complejo c){
       return new Complejo ((real-c.real), (imag-c.imag));
    }
   
    //multiplicar dos números complejos
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Complejo multiplicar(Complejo c){
        return new Complejo ((real*c.real)-(imag*c.imag),(real*c.imag)+(imag*c.real));
    }
   
    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public Complejo dividir(Complejo c){
        return new Complejo (((real*c.real)+(imag*c.imag))/((c.real*c.real)+(c.imag*c.imag)),((imag*c.real)-(real*c.imag))/((c.real*c.real)+(c.imag*c.imag)));
    }

    //método toString
   
    public String toString() {
        return  "(" + real + ", " + imag + "i)";
    }

    //método comparaIgual
   
    public boolean comparaIgual(Complejo c) {
        return (real == c.real)&&(imag == c.imag) ;
    } 

    void imprimir(){
      System.out.println(real+"+"+imag+"i");

        }
} 