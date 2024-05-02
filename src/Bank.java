package src;

import src.services.Conta;
import src.services.ContaCorrente;
import src.services.ContaPoupanca;

public class Bank {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(1000);
        contaCorrente.depositar(1000);

        contaPoupanca.transferir(100, contaCorrente);
        contaCorrente.transferir(100, contaPoupanca);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();

        // ....

    }
}
