package org.example;

public class ProfissaoVisitor implements Visitor{
    public String exibir(Profissao profissao) {
        return profissao.aceitar(this);
    }

    @Override
    public String exibirPsicologo(Psicologo psicologo) {
        return "Psicologo{" +
                "CRP=" + psicologo.getCrp() +
                ", nome='" + psicologo.getNome() + '\''  +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "CRM=" + medico.getCrm() +
                ", nome='" + medico.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirDentista(Dentista dentista) {
        return "Dentista{" +
                "CRO=" + dentista.getCro() +
                ", nome='" + dentista.getNome() + '\''+
                '}';
    }
}
