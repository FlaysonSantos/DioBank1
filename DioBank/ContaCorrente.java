package DioBank;

public class ContaCorrente  extends  Conta {

    public ContaCorrente(String cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta corrente ***");
        super.infoComun();

    }

}
