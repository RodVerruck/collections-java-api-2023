package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Rodrigo", 123);
        conjuntoConvidados.adicionarConvidado("Fabio", 456);
        conjuntoConvidados.adicionarConvidado("Joao", 789);
        conjuntoConvidados.adicionarConvidado("Pedro", 122);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(122);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
