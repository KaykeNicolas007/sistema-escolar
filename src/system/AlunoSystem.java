package system;

import dataBases.MembroAcademicoDB;
import entities.Aluno;
import entities.Disciplina;

public class AlunoSystem {
    private MembroAcademicoDB membroAcademicoDB;

    public AlunoSystem() {}

    public void cadastrarAluno(String curso, String dataNascimento, String nome, int matricula) {
        if(membroAcademicoDB.matriculaValida(matricula))
            membroAcademicoDB.adicionarAluno(curso, dataNascimento, nome, matricula);
        else
            System.out.println("Erro ao cadastrar Aluno");
    }
}
