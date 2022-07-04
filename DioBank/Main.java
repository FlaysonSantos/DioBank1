package DioBank;

public class Main {
    public static void main (String[] argr){
        //CRIAR CONTA CLIENTE
        Cliente flayson = new Cliente();
        flayson.setName("flayson");



        //criar conta corrente e realizar deposito
        Conta cc = new ContaCorrente("flayson");
        cc.depositar(1000);



        //criar conta poupança
        Conta cp = new ContaPoupanca("flayson");

        //criar transferencia
        cc.transferir(300 , cp);



        //imprimir extratos das duas contas de operação.
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
