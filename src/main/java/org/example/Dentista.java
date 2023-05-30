package org.example;

public class Dentista implements Profissao{
    private String nome;
    private String cro;

    public Dentista(String nome, String cro) {
        this.nome = nome;
        this.cro = cro;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDentista(this);
    }

    public String getNome() {
        return nome;
    }

    public String getCro() {
        return cro;
    }
}
