package app;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cliente cliente = new Cliente();
        cliente.setNome("Max Wilson");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(12500.00);
        corrente.transferir(4700.00, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
