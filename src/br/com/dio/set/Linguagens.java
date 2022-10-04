package br.com.dio.set;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Linguagens {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("SQL", 1970, "MySQL"));
            add(new LinguagemFavorita("Python", 1991, "IntelliJ"));
        }};
        System.out.println("Ordem de inserção: ");
        System.out.println(linguagens);
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2);
    }
}
class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private final String nome;
    private final Integer anoDeCriacao;
    private final String ide;
    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome = '" + nome + '\'' +
                ", anoDeCriacao = " + anoDeCriacao +
                ", ide = '" + ide + '\'' +
                '}';
    }
    @Override
    public int compareTo(LinguagemFavorita o) {
        int nome = this.nome.compareTo(o.nome);
        if(nome != 0) return nome;
        int ano = this.anoDeCriacao.compareTo(o.anoDeCriacao);
        if (ano != 0) return ano;
        return this.ide.compareTo(o.ide);
    }
}