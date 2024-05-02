package src.services;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente");
        System.out.println("Saldo: " + this.getSaldo());
    }
}
