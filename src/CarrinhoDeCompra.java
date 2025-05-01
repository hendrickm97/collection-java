import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i: itemList){
                if (i.getName().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for (Item item: itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }

    }


    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString(){
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                "}";
    }

    public static void main(String[] args){
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Ps5", 3500d, 1);
        carrinhoDeCompra.adicionarItem("Controles", 449d, 2);
        carrinhoDeCompra.adicionarItem("Final Fantasy 7 Rebirth", 349d, 1);
        carrinhoDeCompra.adicionarItem("Xbox", 2800d, 1);

        carrinhoDeCompra.exibirItens();

        carrinhoDeCompra.removerItem("Xbox");

        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompra.calcularValorTotal());
    }
}
