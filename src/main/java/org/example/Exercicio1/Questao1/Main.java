package org.example.Exercicio1.Questao1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);
        if (numero>0){
            JOptionPane.showMessageDialog(null,"Número positivo!");
        } else if (numero<0) {
            JOptionPane.showMessageDialog(null,"Número negativo!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Número neutro!");
        }
    }
}