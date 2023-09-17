package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo
    private List<Item> compras;

    //construtor
    public CarrinhoDeCompras() { this.compras = new ArrayList<>();}

    //método para adicionar itens no carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        compras.add(new Item(nome, preco, quantidade));
    }

    //método para remover itens com base no seu nome
    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for (Item i : compras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(i);
            }
        }
        compras.removeAll(itensRemover);
    }


    //método para calcular valor total
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : compras) {
            double preco = item.getPreco();
            int quantidade = item.getQuantidade();
            total += preco * quantidade;
        }
        return total;
    }

    // Método para exibir itens
    public void exibirItens() {
        for (Item item : compras) {
            System.out.println(item);
        }
    }

    //método principal
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 1, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 1, 1);
        carrinhoDeCompras.adicionarItem("Tomate", 1, 5);
        carrinhoDeCompras.adicionarItem("Macarrão", 1, 3);

        System.out.println("Lista completa:");
        carrinhoDeCompras.exibirItens();
        double total = carrinhoDeCompras.calcularValorTotal();
        System.out.println(total);
    }
}
