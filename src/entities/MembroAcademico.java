package entities;

public abstract class MembroAcademico {
    private String curso;
    private String dataNascimento;
    private String nome;
    private int matricula;
    private Disciplina[] disciplinas;

    public MembroAcademico(String curso, String dataNascimento, String nome, int matricula, Disciplina[] disciplinas) {
        this.curso = curso;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
