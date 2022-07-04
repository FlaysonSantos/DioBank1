package DioBank;

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1 ;
    private static int SEQUENCIAL = 1;
    private static Cliente cliente;
    private String Cliente = new String();


    protected int numero;
            protected int agencia;
            protected double saldo;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.Cliente = Cliente;

    }

    public Conta(String cliente) {

        Cliente =cliente;
    }


    public void sacar(){

            }

            public void depositar() {

            }

            public void transferir() {

            }

            public int getNumero() {
                return numero;
            }

            public int getAgencia() {
                return agencia;
            }

            public double getSaldo() {
                return saldo;
            }

    @Override
    public void sacar(double valor) {

        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {

        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void infoComun() {



        System.out.println(String.format("Titular: %s", this.Cliente));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }
}
