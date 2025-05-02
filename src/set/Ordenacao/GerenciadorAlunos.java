package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, media, matricula));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> ordemPorNome = new TreeSet<>(alunoSet);
        System.out.println(ordemPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> ordemPorNota = new TreeSet<>(new ComparatorPorNota());
        ordemPorNota.addAll(alunoSet);
        System.out.println(ordemPorNota);
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);


        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
