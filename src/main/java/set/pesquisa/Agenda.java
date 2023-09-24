package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatoSet;

    public Agenda() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.exibirContatos();

        agenda.adicionarContato("Rod", 999362309);
        agenda.adicionarContato("Kash", 999432611);
        agenda.adicionarContato("Mãe", 998094826);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Rod"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Rod", 9999999));
        agenda.exibirContatos();
    }
}
