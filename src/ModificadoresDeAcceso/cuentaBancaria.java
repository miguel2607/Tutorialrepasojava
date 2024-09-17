package ModificadoresDeAcceso;

public class cuentaBancaria {

    private int saldo = 30000000;

public int depositar = 20000;

    void depositar(){

        saldo += depositar;
        System.out.println(saldo);

    }
    public int retiro = 30000;

    void retirar (){

        if (saldo < retiro){
            System.out.println("no hay suficiente dinero");
        }else {

            saldo-=retiro;
            System.out.println(saldo);

        }

    }

}
