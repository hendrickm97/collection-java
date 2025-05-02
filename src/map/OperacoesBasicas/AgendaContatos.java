package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agedaContatoMap;

    public AgendaContatos() {
        this.agedaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agedaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agedaContatoMap.isEmpty()){
            agedaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agedaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agedaContatoMap.isEmpty()){
            numeroPorNome = agedaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContato();


        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContato();

        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }

}
