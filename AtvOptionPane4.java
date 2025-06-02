/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atvoptionpane4;

/*
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade - Introdução ao uso de JOptionPane em Java, 4.
 * Prof°: Lucas Brunetto Cari - Desenvolvimento Orientado a Objetos
 */

import javax.swing.JOptionPane;

public class AtvOptionPane4 {
    public static void main(String[] args) {
        String senhaCorreta = "60001962";
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Coloque a senha:");
        } while (!entrada.equals(senhaCorreta));
        JOptionPane.showMessageDialog(null, "Acesso liberado");
    }
}
