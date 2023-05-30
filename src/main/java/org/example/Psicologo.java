package org.example;

public class Psicologo implements Profissao{
    private String nome;
    private String crp;

    public String getNome() {
        return nome;
    }

    public String getCrp() {
        return crp;
    }

    public Psicologo(String nome, String crp) {
        this.nome = nome;
        this.crp = crp;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPsicologo(this);
    }

}
