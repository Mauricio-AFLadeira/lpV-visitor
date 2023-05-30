package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfissaoVisitorTest {
    @Test
    void deveExibirPsicologo() {
        Psicologo Psicologo = new Psicologo("Glaucia", "02/25350");

        ProfissaoVisitor profissaoVisitor = new ProfissaoVisitor();
        assertEquals("Psicologo{CRP=02/25350, nome='Glaucia'}", profissaoVisitor.exibir(Psicologo));
    }

    @Test
    void deveExibirMedico() {
        Medico Medico = new Medico("Juliano", "61775");

        ProfissaoVisitor profissaoVisitor = new ProfissaoVisitor();
        assertEquals("Medico{CRM=61775, nome='Juliano'}", profissaoVisitor.exibir(Medico));
    }

    @Test
    void deveExibirDentista() {
        Dentista Dentista = new Dentista("Pedro", "41986");

        ProfissaoVisitor profissaoVisitor = new ProfissaoVisitor();
        assertEquals("Dentista{CRO=41986, nome='Pedro'}", profissaoVisitor.exibir(Dentista));
    }


}