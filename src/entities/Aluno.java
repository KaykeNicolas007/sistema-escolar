package entities;

public class Aluno extends MembroAcademico {
    public Aluno(String curso, String dataNascimento, String nome, int matricula, Disciplina[] disciplinas) {
        super(curso, dataNascimento, nome, matricula, disciplinas);
    }

    public Aluno(String curso, String dataNascimento, String nome, int matricula) {
        super(curso, dataNascimento, nome, matricula);
    }
}
