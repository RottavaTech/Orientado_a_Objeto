/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividademanipulacaoarquivo1;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 6 - Manipulação de Arquivos 1
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AtividadeManipulacaoArquivo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque uma mensagem para gravar no arquivo:");
        String mensagem = scanner.nextLine();

        try (FileWriter writer = new FileWriter("mensagem.txt")) {
            writer.write(mensagem);
            System.out.println("Mensagem gravada com sucesso parabens");
        } catch (IOException e) {
            System.out.println("ERRO ao escrever no arquivo: " + e.getMessage());
        }
    }
}
