package br.gov.sc.pm.radiogestor;

import java.time.LocalDate;

public class Incidente {
    private LocalDate data;
    private String tipo;       // Ex: "Furto", "Sabotagem", "Tempestade", etc.
    private String descricao;  // Detalhes sobre o que ocorreu

    public Incidente(LocalDate data, String tipo, String descricao) {
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
