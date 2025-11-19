package Model;

public class MidiaDigital extends Recurso {
    private double tamanhoMB;
    private String tipoArquivo;

    public MidiaDigital(String id, String titulo, int anoPublicacao, double tamanhoMB, String tipoArquivo) {
        super(id, titulo, anoPublicacao);
        this.tamanhoMB = tamanhoMB;
        this.tipoArquivo = tipoArquivo;
    }

    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + " [Mídia " + tipoArquivo + ", " + tamanhoMB + "MB]";
    }
}
