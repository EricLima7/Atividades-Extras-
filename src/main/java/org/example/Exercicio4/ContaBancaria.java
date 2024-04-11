package org.example.Exercicio4;
class ContaBancaria {
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = depositoInicial;
    }
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.00; // Taxa de saque de R$5.00
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: $ " + String.format("%.2f", saldo);
    }
}
