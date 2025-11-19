package Model;

public class Capitulo {
    private int numero;
    private String titulo;
    private int paginas;

    public Capitulo(int numero, String titulo, int paginas) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título inválido");
        this.numero = numero;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public int getNumero() { return numero; }
    public String getTitulo() { return titulo; }
    public int getPaginas() { return paginas; }

    @Override
    public String toString() {
        return "Capítulo " + numero + ": " + titulo + " (" + paginas + " páginas)";
    }
}

