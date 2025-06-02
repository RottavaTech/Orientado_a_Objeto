/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atvoptionpane5;

/*
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade - Introdução ao uso de JOptionPane em Java, 4.
 * Prof°: Lucas Brunetto Cari - Desenvolvimento Orientado a Objetos
 */

import javax.swing.JOptionPane;

public class AtvOptionPane5 {
    public static void main(String[] args) {
        int opcao;
        double total = 0;
        do {
            String[] itens = {
                "1. agua (R$ 5.00)",
                "2. Refrigerante (R$ 10.00)",
                "3. Chocolate Nestle da Coopavel (R$ 15.00)",
                "0. Sair"
            };

            String menu = String.join("\n", itens);
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dos itens:\n" + menu));
            switch (opcao) {
                case 1:
                    total += 2.50;
                    break;
                case 2:
                    total += 4.00;
                    break;
                case 3:
                    total += 5.50;
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida.");
            }
            
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Compra Total: R$ " + total);
    }
}
