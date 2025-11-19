package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro extends Recurso {
    private List<Capitulo> capitulos = new ArrayList<>();

    public Livro(String id, String titulo, int anoPublicacao) {
        super(id, titulo, anoPublicacao);
    }

    public void adicionarCapitulo(Capitulo c) {
        capitulos.add(c);
    }

    public List<Capitulo> getCapitulos() {
        return Collections.unmodifiableList(capitulos);
    }

    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " [Livro com " + capitulos.size() + " capítulos]";
    }
}
