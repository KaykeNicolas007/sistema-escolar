package entities;

public class AvaliacaoAluno extends Avaliacao{
    private String comentario;

    public AvaliacaoAluno(String data, int nota, String comentario) {
        super(data, nota);
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }
}
