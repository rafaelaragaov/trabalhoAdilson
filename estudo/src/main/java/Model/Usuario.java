package Model;

public abstract class Usuario {
    private String id;
    private String nome;
    private String documento;

    public Usuario(String id, String nome, String documento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getDocumento() { return documento; }

    public abstract int prazoDiasPadrao();
    public abstract double fatorMulta();

    @Override
    public String toString() {
        return nome + " (" + getClass().getSimpleName() + ")";
    }
}
