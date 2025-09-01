package entities;

public abstract class Avaliacao {
    private String data;
    private int nota;

    public Avaliacao(String data, int nota) {
        this.data = data;
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public int getNota() {
        return nota;
    }
}
