package entities;

public class AvaliacaoProfessor extends Avaliacao{
    private String observacao;

    public AvaliacaoProfessor(String data, int nota, String observacao) {
        super(data, nota);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }
}
