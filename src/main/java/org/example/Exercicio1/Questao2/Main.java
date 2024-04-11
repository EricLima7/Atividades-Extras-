package org.example.Exercicio1.Questao2;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
        int dia = Integer.parseInt(input);

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido! Digite um número de 1 a 7.");
                break;
        }
        JOptionPane.showMessageDialog(null,"Obrigado por usar nosso programa! \nAté a próxima!");
    }
}

