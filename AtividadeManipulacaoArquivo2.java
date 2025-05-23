/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atividademanipulacaoarquivo2;

/**
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade 6 - Manipulação de Arquivos 2
 */

import java.io.FileReader;
import java.io.IOException;

public class AtividadeManipulacaoArquivo2 {

   public static void main(String[] args) {
        try (FileReader reader = new FileReader("mensagem.txt")) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            System.out.println("ERRO ao ler o arquivo: " + e.getMessage());
        }
    }
}
