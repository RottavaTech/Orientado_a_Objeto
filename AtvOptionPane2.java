/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atvoptionpane2;

/*
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade - Introdução ao uso de JOptionPane em Java, 2.
 * Prof°: Lucas Brunetto Cari - Desenvolvimento Orientado a Objetos
 */

import javax.swing.JOptionPane;

public class AtvOptionPane2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1º numero:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2º numero:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 3º numero:"));
        int resultado = n1 * n2 * n3;
        JOptionPane.showMessageDialog(null, "Resultado da multiplicacao: " + resultado);
    }
}
