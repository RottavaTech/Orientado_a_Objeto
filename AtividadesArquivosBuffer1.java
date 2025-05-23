/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividadesarquivosbuffer1;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 7 - Arquivos Buffer 1
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AtividadesArquivosBuffer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque uma mensagem para gravar no arquivo:");
        String mensagem = scanner.nextLine();

        long tempoInicial = System.currentTimeMillis();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mensagem.txt"))) {
            writer.write(mensagem);
            System.out.println("Mensagem gravada com sucesso parabens");
        } catch (IOException e) {
            System.out.println("ERRO ao escrever no arquivo: " + e.getMessage());
        }

        long tempoFinal = System.currentTimeMillis();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("Tempo de gravacao: " + duracao + " ms");
    }
}
