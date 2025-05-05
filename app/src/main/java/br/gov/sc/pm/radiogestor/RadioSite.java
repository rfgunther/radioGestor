package br.gov.sc.pm.radiogestor;

import java.util.ArrayList;
import java.util.List;

public class RadioSite {
    private int id;
    private String municipio;
    private String nomeSite;
    private String referenciaGeografica;
    private String sistema;
    private String status;

    private List<Manutencao> manutencoes;
    private List<Risco> riscos;
    private List<Incidente> incidentes;

    public RadioSite(int id, String municipio, String nomeSite, String referenciaGeografica, String sistema, String status) {
        this.id = id;
        this.municipio = municipio;
        this.nomeSite = nomeSite;
        this.referenciaGeografica = referenciaGeografica;
        this.sistema = sistema;
        this.status = status;
        this.manutencoes = new ArrayList<>();
        this.riscos = new ArrayList<>();
        this.incidentes = new ArrayList<>();
    }

    public void adicionarManutencao(Manutencao manutencao) {
        this.manutencoes.add(manutencao);
    }

    public void adicionarRisco(Risco risco) {
        this.riscos.add(risco);
    }

    public void adicionarIncidente(Incidente incidente) {
        this.incidentes.add(incidente);
    }

    @Override
    public String toString() {
        return "[#" + id + "] " + municipio + " - " + nomeSite + " (" + sistema + ") - " + referenciaGeografica;
    }

    // Getters e Setters omitidos por brevidade, mas adicione-os no IntelliJ (Alt+Insert)
}
