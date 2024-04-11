package org.example.Exercicio2;
import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;
class ServicoTarefa {
    private Set<Tarefa> tarefas = new HashSet<>();

    public void adicionarTarefa(Tarefa tarefa) {
        if (!tarefas.add(tarefa)) {
            JOptionPane.showMessageDialog(null, "Tarefa já existe!");
        }
    }

    public void removerTarefa(Tarefa tarefa) {
        if (!tarefas.remove(tarefa)) {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada!");
        }
    }

    public String visualizarTarefas() {
        return tarefas.toString();
    }
}