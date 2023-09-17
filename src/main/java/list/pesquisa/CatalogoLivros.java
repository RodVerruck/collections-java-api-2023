package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    //contrutor - ao criar objeto CatalogoLivros ele cria uma lista vazia
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //método para adicionar livros no catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método para pesquisar livros por autor.
    public List<Livro> pesquisarPorAutor(String autor) {
        // Cria uma lista vazia para armazenar os livros encontrados com o autor especificado.
        List<Livro> livrosPorAutor = new ArrayList<>();

        // Verifica se a lista de livros (livroList) não está vazia.
        if (!livroList.isEmpty()) {
            // Percorre todos os livros na lista de livros (livroList).
            for (Livro l : livroList) {
                // Verifica se o autor do livro atual é igual (ignorando maiúsculas/minúsculas) ao autor especificado.
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    // Se for igual, adiciona o livro atual à lista de livrosPorAutor.
                    livrosPorAutor.add(l);
                }
            }
        }

        // Retorna a lista de livros encontrados com o autor especificado.
        return livrosPorAutor;
    }

    // Método para pesquisar por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    // Método para pesquisar por título e retornar somente o primeiro livro com esse título
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}


