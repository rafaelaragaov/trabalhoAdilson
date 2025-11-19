package Model;

public abstract class Recurso {
    private String id;
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel = true;

    public Recurso(String id, String titulo, int anoPublicacao) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título inválido");
        if (anoPublicacao <= 0) throw new IllegalArgumentException("Ano inválido");
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public String getDescricao() {
        return titulo + " (" + anoPublicacao + ")";
    }

    public abstract double calcularMulta(long diasAtraso);

    @Override
    public String toString() {
        return getDescricao() + " - " + (disponivel ? "Disponível" : "Emprestado");
    }
}

