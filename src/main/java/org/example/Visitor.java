package org.example;

public interface Visitor {
    String exibirPsicologo(Psicologo psicologo);
    String exibirMedico(Medico medico);
    String exibirDentista(Dentista dentista);
}
