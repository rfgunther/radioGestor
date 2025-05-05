package br.gov.sc.pm.radiogestor;

import java.time.LocalDate;

public class Manutencao {
    private LocalDate data;
    private String tipo; // "Realizada" ou "Preventiva"
    private String descricao;

    public Manutencao(LocalDate data, String tipo, String descricao) {
        this.data = data;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "[" + tipo + "] " + data + " - " + descricao;
    }
}
