package org.example.Exercicio3;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 5000, 10);
        Funcionario funcionario2 = new Funcionario("Maria", 6000, 15);

        JOptionPane.showMessageDialog(null, funcionario1.toString());
        JOptionPane.showMessageDialog(null, funcionario2.toString());

        funcionario1.aumentoSalario(10);

        JOptionPane.showMessageDialog(null, "Após o aumento salarial:");
        JOptionPane.showMessageDialog(null, funcionario1.toString());
        JOptionPane.showMessageDialog(null, funcionario2.toString());

        JOptionPane.showMessageDialog(null, "Salários líquidos:");
        JOptionPane.showMessageDialog(null, "Funcionário 1: " + funcionario1.obterSalarioLiquido());
        JOptionPane.showMessageDialog(null, "Funcionário 2: " + funcionario2.obterSalarioLiquido());
    }
}