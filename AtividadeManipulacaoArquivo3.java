/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividademanipulacaoarquivo3;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 6 - Manipulação de Arquivos 3
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AtividadeManipulacaoArquivo3 {

    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque seu Nome:");
        String nome = scanner.nextLine();
        System.out.println("Coloque seu CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Coloque sua Cidade:");
        String cidade = scanner.nextLine();

        try (FileWriter writer = new FileWriter("clientes.txt", true)) {
            writer.write(nome + "," + cpf + "," + cidade + "\n");
            System.out.println("Cliente cadastrado com sucesso");
        } catch (IOException e) {
            System.out.println("ERRO ao gravar cliente: " + e.getMessage());
        }
    }

    public static void listarClientes() {
        try (FileReader reader = new FileReader("clientes.txt")) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            System.out.println("ERRO ao ler clientes: " + e.getMessage());
        }
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
