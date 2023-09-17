package main.java.list.operacoesbasicas;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //contrutor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getter
    public String getNome() {
        return nome;
    }
    //getter
    public double getPreco() {
        return preco;
    }
    //getter
    public int getQuantidade() {
        return quantidade;
    }


    public String toString() {
        return nome + " " + "R$" + preco + " Quantidade = " + quantidade;
    }
}
