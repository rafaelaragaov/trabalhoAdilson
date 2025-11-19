package Model;

import lombok.Getter;

import java.time.LocalDate;

public class Emprestimo {
    @Getter
    private Recurso recurso;
    @Getter
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    @Getter
    private LocalDate dataPrevista;
    @Getter
    private LocalDate dataDevolucao;

    public Emprestimo(Recurso recurso, Usuario usuario) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevista = dataEmprestimo.plusDays(usuario.prazoDiasPadrao());
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        recurso.setDisponivel(true);
    }

    public boolean estaAtrasado() {
        return dataDevolucao != null && dataDevolucao.isAfter(dataPrevista);
    }

    public double calcularMulta() {
        if (dataDevolucao == null || !estaAtrasado()) return 0;
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataPrevista, dataDevolucao);
        return recurso.calcularMulta(dias) * usuario.fatorMulta();
    }

    