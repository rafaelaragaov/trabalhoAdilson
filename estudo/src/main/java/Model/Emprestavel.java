package Model;

import java.time.LocalDate;

public interface Emprestavel {
    boolean emprestar(Usuario u);
    void devolver();
    LocalDate getDataPrevistaDevolucao();
}

