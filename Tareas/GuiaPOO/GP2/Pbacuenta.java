/*  SANTOS MENDEZ ULISES JESUS
TAREA: TAD CUENTA BANCARIA
GRUPO: 2CM11
FECHA DE ENTREGA: 23/04/2021
MATERIA: PROGRAMACION ORIENTADA A OBJETOS
*/


public class Pbacuenta {
    public static void main(String[] args){
        double sfinal;
        // Crea doublemos la cuenta
        Cbancaria Cuenta1,ncuenta;
        Cuenta1 = new Cbancaria(201701, 10000);
        // Se muestra el numero de cuenta
        System.out.println("Cuenta abierta: ");
        Cuenta1.imprimir();
        // Consultamos el saldo
        sfinal = Cuenta1.saldof();
        System.out.println("Cantidad inicial en la cuenta: " + sfinal + " M.N");

        // Hacemos un retiro en la cuenta
        double retiro = 700;
        System.out.println("Se retiran en la cuenta: " + retiro + "M.N");
        Cuenta1.retirar(retiro);

        //Depositamos dinero en la cuenta
        double ingreso = 1600;
        System.out.println("Se depositan en la cuenta: " + ingreso + " M.N");
        Cuenta1.deposito(ingreso);
        System.out.println("-------------------------------------------------");

        // Consultamos el saldo de nuevo
        sfinal = Cuenta1.saldof();
        System.out.println("Consulta del saldo final en la cuenta: " + sfinal + " M.N");  
    }
}