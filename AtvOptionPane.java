/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rotts.atvoptionpane;

/*
 @author Rodrigo Rottava
 * RA: 60001962 - ADS Unipar
 * Atividade - Introdução ao uso de JOptionPane em Java, 1.
 * Prof°: Lucas Brunetto Cari - Desenvolvimento Orientado a Objetos
 */

import javax.swing.JOptionPane;

public class AtvOptionPane {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o primeiro numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o segundo numero:"));
        int soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
}


