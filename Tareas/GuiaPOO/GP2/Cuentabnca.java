/*  
NOMBRE: SANTOS MENDEZ ULISES JESUS
GRUPO: 2CM11
MATERIA: PROGRAMACI�N ORIENTADA A OBJETOS
TEMA: GUIA POO
PROBLEMA 2: TAD CUenta Bancaria
FECHA DE ENTREGA: 06/05/2021
*/


public class Cuentabnca {
    int nocuenta;
    double saldo;
    //Definici�n del constructor
    public Cuentabnca(int nocuenta, double saldo){ 
        this.nocuenta = nocuenta;
        this.saldo = saldo;
    }
    //M�todo para depositar en la cuenta
    public void deposito(double cdep){
        saldo = saldo + cdep;
    }
    //Metodo para retirar dinero de la cuenta
    public void retirar(double cret){
        saldo = saldo - cret;
    }
    //Metodo para consultar el saldo
    public double saldof(){
        return saldo;
    }
    //Metodo imprimir cantidad
    void imprimir(){
        System.out.println("#"+nocuenta);
    }
}