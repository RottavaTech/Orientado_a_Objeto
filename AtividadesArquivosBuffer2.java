/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividadesarquivosbuffer2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 7 - Arquivos Buffer 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AtividadesArquivosBuffer2 {

    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new FileReader("mensagem.txt"))) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            System.out.println("ERRO ao ler o arquivo: " + e.getMessage());
        }

        long tempoFinal = System.currentTimeMillis();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("Tempo de leitura: " + duracao + " ms");
    }
}

