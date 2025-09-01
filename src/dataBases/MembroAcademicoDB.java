package dataBases;

import entities.Aluno;
import entities.Disciplina;
import entities.Professor;

import java.util.HashMap;

public class MembroAcademicoDB {
    private HashMap<Integer, Aluno> alunos;
    private HashMap<Integer, Professor> professores;

    public MembroAcademicoDB() {}

    public void adicionarAluno(String curso, String dataNascimento, String nome, int matricula) {
        Aluno aluno = new Aluno(curso, dataNascimento, nome, matricula);
        alunos.put(matricula, aluno);
    }

    public boolean matriculaValida(Integer matricula) {
        if (alunos.containsKey(matricula) ||  professores.containsKey(matricula)) {
            return false;
        }
        return true;
    };

    public HashMap<Integer, Aluno> getAlunos() {
        return alunos;
    }

    public HashMap<Integer, Professor> getProfessores() {
        return professores;
    }
}
