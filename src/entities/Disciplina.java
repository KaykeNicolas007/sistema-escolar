package entities;

public class Disciplina {
    private Professor professorResponsavel;

    public Disciplina(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }
}
