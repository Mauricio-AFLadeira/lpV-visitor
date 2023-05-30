package org.example;

public class Medico implements Profissao{
    private String nome;
    private String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }

}
