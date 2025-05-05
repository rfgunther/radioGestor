package br.gov.sc.pm.radiogestor;

public class Risco {
    private String descricao;
    private String grau; // Exemplo: "Baixo", "Médio", "Alto", "Crítico"

    public Risco(String descricao, String grau) {
        this.descricao = descricao;
        this.grau = grau;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getGrau() {
        return grau;
    }

    @Override
    public String toString() {
        return grau + " - " + descricao;
    }
}
