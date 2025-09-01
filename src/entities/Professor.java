package entities;

public class Professor extends MembroAcademico {
    private String[] especializacoes;
    private double salario;


    public Professor(String curso, String dataNascimento, String nome, int matricula, Disciplina[] disciplinas) {
        super(curso, dataNascimento, nome, matricula, disciplinas);
    }

    public String[] getEspecializacoes() {
        return especializacoes;
    }

    public double getSalario() {
        return salario;
    }
}
