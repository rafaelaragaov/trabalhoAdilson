package Model;

public class Aluno extends Usuario {
    public Aluno(String id, String nome, String documento) {
        super(id, nome, documento);
    }

    @Override
    public int prazoDiasPadrao() {
        return 7;
    }

    @Override
    public double fatorMulta() {
        return 1.0;
    }
}
