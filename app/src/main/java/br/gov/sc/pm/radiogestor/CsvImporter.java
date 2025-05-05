package br.gov.sc.pm.radiogestor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvImporter {

    public static List<RadioSite> importarSites(String caminhoCsv) {
        List<RadioSite> sites = new ArrayList<>();
        int contadorId = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoCsv))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue; // pula o cabeçalho
                }

                String[] campos = linha.split(",", -1);


                if (campos.length < 6) {
                    System.out.println("⚠️ Linha ignorada (colunas insuficientes): " + linha);
                    continue;
                }

                String municipio = campos[1].trim();
                String nomeSite = campos[2].trim();
                String referencia = campos[3].trim();
                String sistema = campos[5].trim();
                String status = campos.length > 6 ? campos[6].trim() : "";

                RadioSite site = new RadioSite(
                        contadorId++, municipio, nomeSite, referencia, sistema, status
                );

                sites.add(site);
            }

        } catch (Exception e) {
            System.out.println("Erro ao importar CSV: " + e.getMessage());
        }

        System.out.println("✅ Total de sítios importados: " + sites.size());
        return sites;
    }
}
