package src.services;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança");
        System.out.println("Saldo: " + this.getSaldo());
    }
}
