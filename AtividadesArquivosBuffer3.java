/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividadesarquivosbuffer3;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 7 - Arquivos Buffer 3
 */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AtividadesArquivosBuffer3 {

    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque seu Nome:");
        String nome = scanner.nextLine();
        System.out.println("Coloque seu CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Coloque sua Cidade:");
        String cidade = scanner.nextLine();

        long tempoInicial = System.currentTimeMillis();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt", true))) {
            writer.write(nome + "," + cpf + "," + cidade);
            writer.newLine();
            System.out.println("Cliente cadastrado com sucesso");
        } catch (IOException e) {
            System.out.println("ERRO ao gravar cliente: " + e.getMessage());
        }

        long tempoFinal = System.currentTimeMillis();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("Tempo de gravacao: " + duracao + " ms");
    }

    public static void listarClientes() {
        long tempoInicial = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("ERRO ao ler clientes: " + e.getMessage());
        }

        long tempoFinal = System.currentTimeMillis();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("Tempo de leitura: " + duracao + " ms");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
    }
}
