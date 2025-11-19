package Model;

public class Revista extends Recurso {
    private int edicao;
    private int carenciaDias = 2;

    public Revista(String id, String titulo, int anoPublicacao, int edicao) {
        super(id, titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public double calcularMulta(long diasAtraso) {
        long diasComMulta = Math.max(0, diasAtraso - carenciaDias);
        return diasComMulta * 1.0;
    }

    @Override
    public String toString() {
        return super.toString() + " [Revista edição " + edicao + "]";
    }
}
