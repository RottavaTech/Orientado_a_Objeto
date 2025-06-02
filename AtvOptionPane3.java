/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atvoptionpane3;

/*
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade - Introdução ao uso de JOptionPane em Java, 3.
 * Prof°: Lucas Brunetto Cari - Desenvolvimento Orientado a Objetos
 */

import javax.swing.JOptionPane;

public class AtvOptionPane3 {
    public static void main(String[] args) {
        int soma = 0;
        int opcao;
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero:"));
            soma += numero;
            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmacao", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "Soma total: " + soma);
    }
}