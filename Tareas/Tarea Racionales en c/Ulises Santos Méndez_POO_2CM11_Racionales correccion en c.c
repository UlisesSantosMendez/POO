#include <math.h>
#include <stdio.h>
#include <stdlib.h>

/* 
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
TAREA: 

*/
	struct racional{
		
	int num,den;
	
	};
	
	typedef struct racional Racional;
	
	
	Racional *creaRacional(int num, int den){
	    Racional *nvo;
		if(den==0) return NULL;
		nvo =(Racional*)malloc(sizeof(Racional));
		nvo->num=num;
		nvo->den=den;
		return nvo;
	}
	Racional *sum(Racional *r1, Racional *r2){
    int nuevoDen=(r1->den)*(r2->den);
	return creaRacional((r1->num*r2->den)+(r1->den*r2->num), nuevoDen);
	}
	
	Racional *res(Racional *r1, Racional *r2){
	int nuevoDen=(r1->den)*(r2->den);
	return creaRacional((r1->num*r2->den)-(r1->den*r2->num), nuevoDen);
	}
	
	Racional *mult(Racional *r1, Racional *r2){
	    return creaRacional(r1->num*r2->num,r1->den*r2->den);	
		}
	
	Racional *divi(Racional *r1, Racional *r2){
	
	return creaRacional(r1->num*r2->den,r1->den*r2->num);
	
	}
	
	int comparaIgual(Racional *r1, Racional *r2){
		
		return r1->num*r2->den == r1->den*r2->num;
	}
	
	void imprime(Racional *r)	{
		printf("%d / %d \n",r->num,r->den);
	}
	
	void main(){
		Racional *r1,*r2,*r3,*r4,*r5,*r6;
		r1=creaRacional(1,2);
		r2=creaRacional(1,4);
		imprime(r1);
		imprime(r2);
		r3=mult(r1,r2);
		printf("Multiplicacion = ");
		imprime(r3);
		r4=divi(r1,r2);
	    printf("Division = ");
		imprime(r4);
		r5=sum(r1,r2);
	    printf("Suma = ");
		imprime(r5);
		r6=res(r1,r2);
		printf("Resta = ");
		imprime(r6);
	}

