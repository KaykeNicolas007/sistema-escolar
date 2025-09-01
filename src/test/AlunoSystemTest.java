package test;

import dataBases.MembroAcademicoDB;
import org.junit.jupiter.api.Test;
import system.AlunoSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AlunoSystemTest {
    MembroAcademicoDB membroAcademicoDB = new MembroAcademicoDB();

    @Test
    void somaDeveRetornarValorCorreto() {
        int resultado = 2 + 3;
        assertEquals(5, resultado);
    }

    @Test
    void validarCadastrarAluno() {
        AlunoSystem alunoSystem = new AlunoSystem();
        // alunoSystem.cadastrarAluno("Comp", "12/12/12", "Kayke", 1);
        membroAcademicoDB.adicionarAluno("Comp", "12/12/12", "Kayke", 1);
        assertFalse(membroAcademicoDB.matriculaValida(1));
    }
}