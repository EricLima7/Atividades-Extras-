package org.example.Exercicio2;
import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        ServicoTarefa servicoTarefa = new ServicoTarefa();
        String menu = "1. Adicionar tarefa\n2. Remover tarefa\n3. Visualizar tarefas\n4. Sair";
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nomeTarefa = JOptionPane.showInputDialog("Digite o nome da tarefa:");
                    servicoTarefa.adicionarTarefa(new Tarefa(nomeTarefa));
                    break;
                case 2:
                    nomeTarefa = JOptionPane.showInputDialog("Digite o nome da tarefa a ser removida:");
                    servicoTarefa.removerTarefa(new Tarefa(nomeTarefa));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, servicoTarefa.visualizarTarefas());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido, por favor digite uma opção válida");
                    break;
            }
        } while (opcao != 4);
    }
}