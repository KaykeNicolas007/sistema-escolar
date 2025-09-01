package dataBases;

import entities.Aluno;
import entities.Professor;

import java.util.HashMap;

public class MembroAcademicoDB {
    private HashMap<Integer, Aluno> alunos;
    private HashMap<Integer, Professor> professores;

    public MembroAcademicoDB() {}

    public boolean matriculaValida(Integer matricula) {
        if (alunos.containsKey(matricula) ||  professores.containsKey(matricula)) {
            return false;
        }
        return true;
    };
}
