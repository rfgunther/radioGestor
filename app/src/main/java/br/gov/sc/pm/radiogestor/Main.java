package br.gov.sc.pm.radiogestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<RadioSite> sites = CsvImporter.importarSites("C:/Users/rudol/Desktop/DTIC/radioGestor/dados/sites.csv");
    private static final Scanner scanner = new Scanner(System.in);
    private static int contadorId = 1;

    public static void main(String[] args) throws Exception {


        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Sistema de Gestão de Rádio Comunicação ===");
            System.out.println("1 - Cadastrar novo sítio");
            System.out.println("2 - Listar todos os sítios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarSite();
                case 2 -> listarSites();
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                    executando = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarSite() {
        System.out.print("Município: ");
        String municipio = scanner.nextLine();

        System.out.print("Nome do site: ");
        String nome = scanner.nextLine();

        System.out.print("Referência geográfica (ex: 27°35'24.30\"S 51°3'1.55\"O): ");
        String referencia = scanner.nextLine();

        System.out.print("Sistema (VHF, UHF, etc): ");
        String sistema = scanner.nextLine();

        System.out.print("Status ou observação: ");
        String status = scanner.nextLine();

        RadioSite site = new RadioSite(contadorId++, municipio, nome, referencia, sistema, status);
        sites.add(site);

        System.out.println("✔ Sítio cadastrado com sucesso.");
    }

    private static void listarSites() {
        if (sites.isEmpty()) {
            System.out.println("Nenhum sítio cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Sítios ---");
        for (RadioSite site : sites) {
            System.out.println(site);
        }
    }
}
