package set.Operacoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> stringSet;

    public ConjuntoPalavrasUnicas() {
        this.stringSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        stringSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (stringSet.contains(palavra)){
            stringSet.remove(palavra);
        } else {
            System.out.println("Palavra não foi encontrada");
        }
    }
    public boolean verificarPalavra(String palavra){
      return stringSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoFrutas = new ConjuntoPalavrasUnicas();

        conjuntoFrutas.adicionarPalavra("Morango");
        conjuntoFrutas.adicionarPalavra("Manga");
        conjuntoFrutas.adicionarPalavra("Amora");
        conjuntoFrutas.adicionarPalavra("Framboesa");
        conjuntoFrutas.adicionarPalavra("Banana");
        conjuntoFrutas.adicionarPalavra("Umbu");

        conjuntoFrutas.exibirPalavrasUnicas();

        conjuntoFrutas.removerPalavra("Banana");
        conjuntoFrutas.exibirPalavrasUnicas();

        conjuntoFrutas.removerPalavra("Umbu");

        System.out.println("A fruta 'Morango' está no conjunto? " + conjuntoFrutas.verificarPalavra("Morango"));
        System.out.println("A fruta 'Banana' está no conjunto? " + conjuntoFrutas.verificarPalavra("Banana"));

        conjuntoFrutas.exibirPalavrasUnicas();
    }
}
