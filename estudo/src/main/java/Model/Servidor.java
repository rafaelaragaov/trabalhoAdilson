package Model;

public class Servidor extends Usuario {
    public Servidor(String id, String nome, String documento) {
        super(id, nome, documento);
    }

    @Override
    public int prazoDiasPadrao() {
        return 10;
    }

    @Override
    public double fatorMulta() {
        return 0.75;
    }
}
