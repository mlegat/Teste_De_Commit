package model;

import java.util.Date;

public class Emprestimo {
    private Ferramenta ferramenta;
    private String nomeAmigo;
    private long dataEmprestimo;
    private long dataDevolucao; // Usamos Long para poder representar a ausência de data com null

    public Emprestimo(Ferramenta ferramenta, String nomeAmigo, long dataEmprestimo) {
        this.ferramenta = ferramenta;
        this.nomeAmigo = nomeAmigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public long getDataEmprestimo() {
        return dataEmprestimo;
    }

    public long getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(long dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Ferramenta: " + ferramenta.getNome() + ", Amigo: " + nomeAmigo + 
               ", Data de Empréstimo: " + dataEmprestimo + 
               ", Data de Devolução: " + (dataDevolucao == null + "Não devolvida" : dataDevolucao);
    }
}

