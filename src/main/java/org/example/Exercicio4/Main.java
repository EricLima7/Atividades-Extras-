package org.example.Exercicio4;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeroContaStr = JOptionPane.showInputDialog(null, "Insira o número da conta:");
        int numeroConta = Integer.parseInt(numeroContaStr);

        String nomeTitular = JOptionPane.showInputDialog(null, "Insira o titular da conta:");

        int temDepositoInicial = JOptionPane.showConfirmDialog(null, "Existe depósito inicial?");
        double depositoInicial = 0;
        if (temDepositoInicial == JOptionPane.YES_OPTION) {
            String depositoInicialStr = JOptionPane.showInputDialog(null, "Insira um valor inicial:");
            depositoInicial = Double.parseDouble(depositoInicialStr);
        }

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        JOptionPane.showMessageDialog(null, "Dados da conta: " + conta);

        String valorDepositoStr = JOptionPane.showInputDialog(null, "Insira um valor de depósito:");
        double valorDeposito = Double.parseDouble(valorDepositoStr);
        conta.depositar(valorDeposito);
        JOptionPane.showMessageDialog(null, "Dados da conta atualizado: " + conta);

        String valorSaqueStr = JOptionPane.showInputDialog(null, "Insira um valor de saque:");
        double valorSaque = Double.parseDouble(valorSaqueStr);
        conta.sacar(valorSaque);
        JOptionPane.showMessageDialog(null, "Dados da conta atualizado: " + conta);
    }
}