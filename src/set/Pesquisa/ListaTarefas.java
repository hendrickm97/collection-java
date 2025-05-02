package set.Pesquisa;

import java.util.HashSet;

import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefasSet.remove(tarefaParaRemover);

    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();


        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");


        listaTarefas.exibirTarefas();


        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();


        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());


        System.out.println(listaTarefas.obterTarefasPendentes());


        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");


        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
