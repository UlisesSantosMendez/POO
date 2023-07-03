/*Programa para suma y resta de racionales
* Suma(x,y), resta(x,y)
---------Santos Méndez Ulises Jesús    "Programación Orientada a Objetos"       2CM11	--------------------
*/
#include<stdio.h>

//PROTOTIPOS DE FUNCIONES
void suma(int arr[],int);
void resta(int res[],int);
int simp(int, int);

int main(void){
	
	int frac[3];
	int i,j,v,op;
	int r=1;
	
	v=sizeof(frac)/sizeof(int);
	
	while(r==1){
		
		printf("TAD de numeros fraccionarios\n");
		printf("\t\t\t\t\tMENU:");
		printf("\n1. SUMA");
		printf("\n2. RESTA");
		printf("\n\nIngrese la operacion que desee realizar: ");
		scanf("%d",&op);
		for(i=0;i<=1;i++){
		printf("\nIngresa el numerador %d: ",i+1);
		scanf("%d",&frac[i]);	
		}
		for(j=2;j<=3;j++){
		printf("\nIngresa el denominador %d: ",j-1);
		scanf("%d",&frac[j]);
		}
	
		if(frac[2]==0){
		printf("\nEl denominador debe ser diferente de cero");
		printf("\nIngrese el denominador %d: ",j=1);
		scanf("%d",&frac[2]);
		}
		if(frac[3]==0){
		printf("\nEl denominador debe ser diferente de cero");
		printf("\nIngrese el denominador %d: ",j=2);
		scanf("%d",&frac[3]);
		}
	
		printf("\nLos numeradores son: %d y %d",frac[0],frac[1]);
		printf("\nLos denominadores son: %d y %d",frac[2],frac[3]);
	
		switch(op){
		
		case 1:
			suma(frac,v);
		break;
		
		case 2:
			resta(frac,v);
		break;
		
		default:
			printf("\n Opcion no valida");
		break;
		}

		printf("\n\t¿Quieres realizar alguna otra operacion?\n");
		printf("\n\t\t1.SI\t\t\t2.NO\n");
		scanf("%d",&r);
	}
	
	return 0;
}

void suma(int arr[],int v){
	int num,den;
	num=(arr[0]*arr[3])+(arr[2]*arr[1]);
	den=(arr[2]*arr[3]);
	printf("\nLa suma de la fraccion es: %d/%d",num,den);
	simp(num,den);
}

void resta(int res[],int v){
	int num,den;
	num=(res[0]*res[3])-(res[2]*res[1]);
	den=(res[2]*res[3]);
	printf("\nLa resta de la fraccion es: %d/%d",num,den);
	simp(num,den);
}

int simp(int n, int d){
	int i,num,den,res;
	if(d==1){
		printf("\nSimplificando: %d/%d",n,d);
	}
	else{
		i=2;
		while(i<=n){
			if(d%i==0 && n%i==0){
				d=d/i;
				n=n/i;
			}
			else{
				i++;
			}
		}
	}
	printf(" Simplificando: %d/%d",n,d);
}
