package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemAscendente = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(ordemAscendente);
            return ordemAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordemAscendente = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            ordemAscendente.sort(Collections.reverseOrder());
            return ordemAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(7);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(21);
        numeros.adicionarNumero(9);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }
}
