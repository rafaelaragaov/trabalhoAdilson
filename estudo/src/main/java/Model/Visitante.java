package Model;

public class Visitante extends Usuario {
    public Visitante(String id, String nome, String documento) {
        super(id, nome, documento);
    }

    @Override
    public int prazoDiasPadrao() {
        return 5;
    }

    @Override
    public double fatorMulta() {
        return 1.5;
    }
}