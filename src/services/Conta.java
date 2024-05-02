package src.services;

public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    private double saldo;

    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }


}
